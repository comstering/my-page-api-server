package my.page.server.controllers

import my.page.server.repository.ProjectRepository

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import my.page.server.models.Project
import my.page.server.services.ProjectService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/project")
class ProjectController @Autowired constructor(val projectService: ProjectService) {
    @GetMapping("/{id}")
    fun getProject(@PathVariable id: Long): ResponseEntity<Project> {
        val project = projectService.getProject(id)

        return if (project != null) {
            ResponseEntity(project, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.BAD_REQUEST)
        }
    }
}
