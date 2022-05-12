package my.page.server.controllers

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class ProjectControllerTests {

    private val projectUri: String = "/api/v1/project"

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `whenProjectPage_thenReturnProjectAPI`() {
        // given
        // when
        val uri: String = "$projectUri/1"
        // then
        mockMvc.get(uri)
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$.title") { value("test") }
            }.andDo {
                print()
            }
    }
}
