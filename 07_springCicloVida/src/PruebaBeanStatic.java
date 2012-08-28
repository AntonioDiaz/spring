import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.BeanStatic;


public class PruebaBeanStatic {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanStatic beanStatic = applicationContext.getBean("myBean", BeanStatic.class);
		System.out.println(beanStatic.getMensaje());
	}
}