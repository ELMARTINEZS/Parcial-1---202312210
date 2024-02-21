package logica;

public class Mujer extends Persona{

	public Mujer(String nombre, double peso, double altura, int edad) {
		super(nombre, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularTMB() {
		// TODO Auto-generated method stub
		double tmb =  447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);
		return tmb;
	}

}
