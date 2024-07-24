package Website;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class TodoRestController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todo")
    public List<Todo> getAllTodos() {
        return todoService.getAll();
    }
}

