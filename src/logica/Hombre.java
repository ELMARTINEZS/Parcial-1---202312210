package logica;

public class Hombre extends Persona {

	public Hombre(String nombre, double peso, double altura, int edad) {
		super(nombre, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularTMB() {
		// TODO Auto-generated method stub
		double tmb = 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
		return tmb;
	}
	
	
}
