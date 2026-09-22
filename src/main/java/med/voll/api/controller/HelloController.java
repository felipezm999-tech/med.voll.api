package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("apresentar")
    public String olaMundo() {
        return "hello word, Felipe!";
    }

        
    @GetMapping("olaMundo")
    public String felipe() {
        return "Felipe costa";
    }


}


