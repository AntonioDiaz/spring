import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.BeanFactory;


public class PruebaBeanFactory {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory beanFactory = applicationContext.getBean("beanFactory", BeanFactory.class);
		System.out.println(beanFactory.getMensaje());
	}
}