package logica;

public abstract class Persona {
	protected String name;
	protected double peso;
	protected double altura;
	protected int edad;
	
	public Persona (String nombre, double peso, double altura, int edad) {
		this.name = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	public abstract double calcularTMB();
}
