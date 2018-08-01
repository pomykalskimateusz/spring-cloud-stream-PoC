package view.stream.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Channel
{
    String INPUT_CHANNEL_NAME = "inputChannel";
    String OUTPUT_CHANNEL_NAME = "outputChannel";

    @Input(INPUT_CHANNEL_NAME)
    SubscribableChannel inputChannel();

    @Output(OUTPUT_CHANNEL_NAME)
    MessageChannel outputChannel();
}
