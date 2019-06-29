package ctrl.json;

import java.util.List;

public class LL {
	private String id;
	private List<Student> list;
	
	public LL() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LL(String id, List<Student> list) {
		super();
		this.id = id;
		this.list = list;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "LL [id=" + id + ", list=" + list + "]";
	}
	
}
