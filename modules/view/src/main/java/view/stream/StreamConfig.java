package view.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import view.stream.channels.Channel;

@Configuration
@EnableBinding(Channel.class)
public class StreamConfig {}
