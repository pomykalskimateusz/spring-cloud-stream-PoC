package generator.stream;

import generator.stream.channels.Channel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(Channel.class)
public class StreamConfig {}
