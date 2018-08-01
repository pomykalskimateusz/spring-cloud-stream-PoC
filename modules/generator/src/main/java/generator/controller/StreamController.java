package generator.controller;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import generator.service.GeneratorService;

@AllArgsConstructor
@RestController
public class StreamController
{
    private GeneratorService generatorService;

    @GetMapping("/stream")
    public String startStream()
    {
        generatorService.generateString();

        return "Successfully started string generator";
    }
}
