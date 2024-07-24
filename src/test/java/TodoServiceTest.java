import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import Website.MayTinh;
import Website.Todo;
import Website.TodoRepository;
import Website.TodoService;


@SpringBootTest
public class TodoServiceTest {
//	@MockBean
//	TodoRepository todoRepository;
//
//	@Autowired
//	private TodoService todoService;
//
//	@BeforeEach
//	public void setUp() {
//		Mockito.when(todoRepository.findAll()).thenReturn(IntStream.range(0, 10)
//				.mapToObj(i -> new Todo(i, "title-" + i, "detail-" + i)).collect(Collectors.toList()));
//
//	}
//
//	@Test
//	public void testCount() {
//		assertEquals(10, todoService.countTodo());
//	}
}
