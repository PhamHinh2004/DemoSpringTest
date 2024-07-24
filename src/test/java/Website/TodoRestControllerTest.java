package Website;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// đánh dấu xử lý cho class TodoRestController
// Cần tạo ra mọt pakage gióng với class TodoRestController
@WebMvcTest(TodoRestController.class)
public class TodoRestControllerTest {
	/**
	 * Đối tượng MockMvc do Spring cung cấp Có tác dụng giả lập request, thay thế
	 * việc khởi động Server
	 */
	@Autowired
	private MockMvc mvc;

	/*
	 * @MockBean có tác dụng tạo ra môt Bean ảo
	 */
	@MockBean
	private TodoService todoService;

	@Test
	public void testFindAll() throws Exception {
		// tạo ra một list chứa 10 phần tử
		List<Todo> allTodos = IntStream.range(0, 10).mapToObj(i -> new Todo(i, "title-" + i, "detail-" + i))
				.collect(Collectors.toList());

// giả lập todoService trả về List mong muốn
		given(todoService.getAll()).willReturn(allTodos);
		
		// phương thức test class rest controller
		mvc.perform(get("/api/v1/todo").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(10))).andExpect(jsonPath("$[0].id", is(0)))
				.andExpect(jsonPath("$[0].title", is("title-0"))).andExpect(jsonPath("$[0].detail", is("detail-0")));
	}
}
