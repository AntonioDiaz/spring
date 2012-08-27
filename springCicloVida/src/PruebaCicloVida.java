import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Estudiante;


public class PruebaCicloVida {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Estudiante estudiante0 = applicationContext.getBean("estudianteUni", Estudiante.class);
		System.out.println(estudiante0);
		
		Estudiante estudiante1 = applicationContext.getBean("estudianteUni", Estudiante.class);
		System.out.println(estudiante1);

		Estudiante estudiante2 = applicationContext.getBean("estudianteInsti", Estudiante.class);
		System.out.println(estudiante2);
		
		Estudiante estudiante3 = applicationContext.getBean("estudianteInsti", Estudiante.class);
		System.out.println(estudiante3);
	}
}