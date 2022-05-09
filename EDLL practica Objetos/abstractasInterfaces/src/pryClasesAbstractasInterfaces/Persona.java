package pryClasesAbstractasInterfaces;
//Clase abstracta
public abstract class Persona {
	//Encapsulamiento de los atributos.
	protected int id;
	protected String nombreCompleto;
	protected String fechaNacimiento;
	protected String estadoCivil;
	//Constructor parametrizado
	public Persona(int id, String nombreCompleto, String fechaNacimiento, String estadoCivil) {
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = fechaNacimiento;
		this.estadoCivil = estadoCivil;
	}
	//SobreEscritura metodo toString retorna String que contiene toda la info del objeto
	public String toString() {
		return "\n Identificacion: "+id+"\n Nombre Completo: "+nombreCompleto+"\n Fecha de Nacimiento: "
				+fechaNacimiento+"\nEstado civil"+ estadoCivil;
	}
}
