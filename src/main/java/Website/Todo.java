package Website;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
	private int id;
	private String title;
	private String detail;
	public Todo(int id, String title, String detail) {
		super();
		this.id = id;
		this.title = title;
		this.detail = detail;
	}
	public Todo() {
		super();
	}
	
	
}
