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
        outputChannel.send(new GenericMessage<String>("Hello cruel world"));
    }
}
