package Website;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

@DataJpaTest
public class SqlAnnnotationTest {

	@Autowired
	private TodoRepository todoRepository;
	
	@Test
	@Sql("/createTodo.sql")
	public void testTodoRepositoryBySqlSchema() {
		Assertions.assertThat(todoRepository.findAll()).hasSize(2);
		Assertions.assertThat(todoRepository.findById(1).getTitle()).isEqualTo("Todo-1");
	}
}
