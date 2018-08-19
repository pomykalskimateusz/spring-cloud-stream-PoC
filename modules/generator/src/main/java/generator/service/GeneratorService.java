package generator.service;

import lombok.AllArgsConstructor;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GeneratorService
{
    private MessageChannel outputChannel;

    public void generateString()
    {
        for(int i = 1; i <= 10; i++ ) {
            outputChannel.send(new GenericMessage<String>("Hello cruel world"));
        }
    }
}
