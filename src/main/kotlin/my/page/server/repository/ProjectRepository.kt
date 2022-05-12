package my.page.server.repository

import my.page.server.models.Project

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjectRepository: JpaRepository<Project, Long> {
    fun findByTitle(title: String): Project?
}
