package pryClasesAbstractasInterfaces;

public class Profesor extends Persona implements operacionesProfesor{
	//Encapsulamiento del atributo en este caso privado ya que generaliza a clases inferiores.
	private int codigoProfesor;
	//Constructor Parametrizado y utilizando la sentencia super para extender los datos a la clase padre (herencia)
	public Profesor(int id, String nombreCompleto, String fechaNacimiento, String estadoCivil, int codigoProfesor) {
		super(id, nombreCompleto, fechaNacimiento, estadoCivil);
		this.codigoProfesor = codigoProfesor;
	}
	//SobreEscritura metodo toString retorna String que contiene toda la info del objeto
	public String toString() {
		return super.toString() + "\n Codigo Profesor"+codigoProfesor+registroNotas()+cursosACargo();
	}
	//metodos implementados de la interface
	@Override
	public String registroNotas() {
		return "\n Ha registrado notas el profesor: "+nombreCompleto;
	}
	@Override
	public String cursosACargo() {
		return "\n Cursos a cargo del profesor: "+nombreCompleto;
	}
}
