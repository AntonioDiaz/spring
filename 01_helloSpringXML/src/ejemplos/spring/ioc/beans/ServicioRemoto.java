package ejemplos.spring.ioc.beans;

public class ServicioRemoto {

	public int consultaDato() {
		return (int) (Math.random() * 10.0);
	}
}
