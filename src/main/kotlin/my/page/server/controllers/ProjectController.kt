package my.page.server.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
public class ProjectController {
    
    @GetMapping("/api/v1/project/{id}")
    public fun getProject(@PathVariable id: Int): String {
        return "id: $id"
    }
}
