package pryClasesAbstractasInterfaces;
//Clase que hereda de la clase Persona e implementa de manera multiple las interfaces operacionesAlumno y operacionesProfesor
public class alumnoProfesor extends Persona implements operacionesAlumno , operacionesProfesor{
	//Encapsulamiento del atributo en este caso privado ya que generaliza a clases inferiores.
	private int codigoAP;
	//Constructor Parametrizado y utilizando la sentencia super para extender los datos a la clase padre (herencia)
	public alumnoProfesor(int id, String nombreCompleto, String fechaNacimiento, String estadoCivil, int codigoAP) {
		super(id, nombreCompleto, fechaNacimiento, estadoCivil);
		this.codigoAP = codigoAP;
	}
	//SobreEscritura metodo toString retorna String que contiene toda la info del objeto
	public String toString() {
		return super.toString()+ "\n Codigo Alumno Profesor: "+codigoAP+notasSemestre()+promedioCarrera()+registroNotas()+cursosACargo();
	}
	//metodos implementados de la interface
	@Override
	public String notasSemestre() {
		return "\n Notas del alumno: "+nombreCompleto;
	}
	@Override
	public String promedioCarrera() {
		return "\n Promedio del alumno: "+nombreCompleto;
	}
	@Override
	public String registroNotas() {
		return "\n Ha registrado notas el profesor: "+nombreCompleto;
	}
	@Override
	public String cursosACargo() {
		return "\n Cursos a cargo del profesor: "+nombreCompleto;
	}
}
