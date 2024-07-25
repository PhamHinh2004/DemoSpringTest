package Website;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public  int id;
	public String title;
	public String detail;
	public Todo(int id, String title, String detail) {
		super();
		this.id = id;
		this.title = title;
		this.detail = detail;
	}
	
	public Todo(String title, String detail) {
		super();
		this.title = title;
		this.detail = detail;
	}

	public Todo() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
}
