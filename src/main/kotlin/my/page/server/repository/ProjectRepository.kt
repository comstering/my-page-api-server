package my.page.server.repository

import my.page.server.models.Project

import org.springframework.data.jpa.repository.JpaRepository

public interface ProjectRepository: JpaRepository<Project, Long>
