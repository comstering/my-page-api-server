package my.page.server.services

import my.page.server.models.Project
import my.page.server.repository.ProjectRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ProjectService @Autowired constructor(val projectRepository: ProjectRepository) {
    fun getProject(id: Long): Project? {
        return projectRepository.findByIdOrNull(id)
    }
}
