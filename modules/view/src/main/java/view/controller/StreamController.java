package view.controller;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import view.service.ViewService;

import java.util.List;

@RestController
@AllArgsConstructor
public class StreamController
{
    private ViewService viewService;

    @GetMapping("/stream")
    public List<String> fetchList()
    {
        return viewService.getList();
    }
}
