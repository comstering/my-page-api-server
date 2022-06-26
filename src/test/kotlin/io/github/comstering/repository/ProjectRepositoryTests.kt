package my.page.server.repository

import my.page.server.models.Project

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest(showSql = true)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProjectRepositoryTests @Autowired constructor(
    val projectRepository: ProjectRepository) {

    @Test
    fun `whenGetProject_thenReturnProject`() {
        // given
        projectRepository.save(Project("test1", "test1"))
        // when
        val project: Project? = projectRepository.findByTitle("test1")
        // then
        assertEquals("test1", project?.title)
    }
}
