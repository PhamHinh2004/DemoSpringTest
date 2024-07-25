package Website;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest(classes = {TodoServiceTest2.class, TestConfig.class})
	public class TodoServiceTest2 {

	    @MockBean
	    private TodoRepository todoRepository;

	    @Autowired
	    private TodoService todoService;

	    @BeforeEach
	    public void setUp() {
	        Mockito.when(todoRepository.findAll()).thenReturn(
	            IntStream.range(0, 10)
	                .mapToObj(i -> new Todo(i, "title-" + i, "detail-" + i))
	                .collect(Collectors.toList())
	        );
	    }

	    @Test
	    public void testCong() {
	        assertEquals(5, todoService.cong(2, 3));
	    }
	    @Test
		public void testCount() {
			assertEquals(10, todoService.countTodo());
		}
}

