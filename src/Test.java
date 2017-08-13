import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Test {
	public static void main(String[] args) {
		try {
			Field[] fields = new TestClass().getFields2();
			/*Method[] methods = Class.forName(TestClass.class.getName()).getMethods();
			//System.out.println(Class.forName("TestClass").getFields());
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i].getName());
			}
			
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i].getName());
			}*/
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i].getName());
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
