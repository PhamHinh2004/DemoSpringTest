import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Website.TodoRepository;
import Website.TodoService;

@Configuration
public class TestConfig {

    @Bean
    public TodoService todoService() {
        return new TodoService();
    }
}
