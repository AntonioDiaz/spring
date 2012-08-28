import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Estudiante;


public class PruebaCicloVida {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Estudiante estudiante0 = applicationContext.getBean("estudianteUni", Estudiante.class);
		System.out.println("Estudiante 0: [" + estudiante0 + "]");
		
		Estudiante estudiante1 = applicationContext.getBean("estudianteUni", Estudiante.class);
		System.out.println("Estudiante 1: [" + estudiante1 + "]");

		Estudiante estudiante2 = applicationContext.getBean("estudianteInsti", Estudiante.class);
		System.out.println("Estudiante 2: [" + estudiante2 + "]");
		
		Estudiante estudiante3 = applicationContext.getBean("estudianteInsti", Estudiante.class);
		System.out.println("Estudiante 3: [" + estudiante3 + "]");
		
		Estudiante estudiante4 = applicationContext.getBean("doctorado", Estudiante.class);
		System.out.println("Estudiante 4: [" + estudiante4 + "]");
		
		applicationContext = new AnnotationConfigApplicationContext("com.beans");
		Estudiante estudianteGuarderia = applicationContext.getBean("estudianteGuarderia", Estudiante.class);
		System.out.println("Estudiante 5: [" + estudianteGuarderia + "]");
		
		applicationContext.close();
	}
}