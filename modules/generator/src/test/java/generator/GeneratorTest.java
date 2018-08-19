package generator;

import generator.service.GeneratorService;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.test.binder.MessageCollector;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.BlockingQueue;

import static junit.framework.TestCase.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class GeneratorTest
{
    @Autowired
    MessageChannel outputChannel;

    @Autowired
    MessageCollector collector;

    @Autowired
    GeneratorService generatorService;

    @Test
    public void testMessages() {
        generatorService.generateString();

        BlockingQueue<Message<?>> messages = collector.forChannel(outputChannel);

        messages.forEach(message -> assertEquals(message.getPayload().toString(), "Hello cruel world"));
    }
}
