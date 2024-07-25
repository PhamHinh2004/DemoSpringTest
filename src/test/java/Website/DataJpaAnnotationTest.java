package Website;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;

@DataJpaTest
public class DataJpaAnnotationTest {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private TodoRepository todoRepository;

	@Test
	public void testTodoRepositoryByCode() {
		// save 2 Todo vào repository
		todoRepository.save(new Todo(0,"todo-1", "detail-1"));
		todoRepository.save(new Todo(0,"todo-2", "detail-2"));

		// Assertions là một class giúp test chứng minh cái này có khác cái khia không
		// ex : int removed = employees.removeFired();
		//		 assertThat(removed).isZero();
		//		 List<Employee> newEmployees = employees.hired(TODAY);
		//		 assertThat(newEmployees).hasSize(6);
		
		Assertions.assertThat(todoRepository.findAll()).hasSize(2);
		Assertions.assertThat(todoRepository.findById(1).getTitle()).isEqualTo("todo-1");
	}
	
	
	// sau cùng xóa hết đi khỉ repository
	@AfterEach
	public void clean() {
		todoRepository.deleteAll();
	}
}
