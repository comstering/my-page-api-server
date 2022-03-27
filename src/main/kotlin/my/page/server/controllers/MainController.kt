package my.page.server.controllers

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    
    @GetMapping("/")
    @ResponseBody
    public fun home(): String {
        return "Hello, World!"
    }
}
