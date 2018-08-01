package view.service;

import lombok.Getter;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import view.stream.channels.Channel;


@Service
@Getter
public class ViewService
{
    private List<String> list = new ArrayList<String>();

    @StreamListener(Channel.INPUT_CHANNEL_NAME)
    public void fetchStrings(String message)
    {
        list.add(message);
    }
}
