package pryClasesAbstractasInterfaces;
//Clase que hereda de la clase padre Persona e implementa de la interface operacionesAlumno
public class Alumno extends Persona implements operacionesAlumno{
	//Encapsulamiento del atributo en este caso privado ya que generaliza a clases inferiores.
	private int codigoAlumno;
	//Constructor Parametrizado y utilizando la sentencia super para extender los datos a la clase padre (herencia)
	public Alumno(int id, String nombreCompleto, String fechaNacimiento, String estadoCivil, int codigoAlumno) {
		super(id, nombreCompleto, fechaNacimiento, estadoCivil);
		this.codigoAlumno = codigoAlumno;
	}
	//SobreEscritura metodo toString retorna String que contiene toda la info del objeto
	public String toString() {
		return super.toString()+ "\n Codigo Alumno: "+ codigoAlumno+notasSemestre()+promedioCarrera();
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
}
