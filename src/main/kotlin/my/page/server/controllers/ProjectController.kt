package my.page.server.controllers

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProjectController {
    @GetMapping("/api/v1/project/{id}")
    public fun getProject(@PathVariable id: String): String {
        return "id: $id"
    }
}