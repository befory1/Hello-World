import java.lang.reflect.Field;


public class TestClass {
	private Integer id;
	public String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Field[] getFields2() throws SecurityException, ClassNotFoundException{
		//System.out.println(this.getClass().getName());
		return Class.forName(this.getClass().getName()).getDeclaredFields();
	}
}
