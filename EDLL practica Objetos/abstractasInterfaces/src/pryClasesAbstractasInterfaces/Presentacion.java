/**
 * DESCRIPCION: Programa que crea la clase persona y esta siendo abstracta y de ella hereda las clase alumno y profesor Y los metodos de las clases hijas 
 * son declaradas por las interfaces. Crea objetos de estas clases para despues imprimir su informacion.
 * ESTUDIANTE: Carlos Andres Muñoz Ortega.
 * FECHA: 2022/01/25
**/
package pryClasesAbstractasInterfaces;

public class Presentacion {
	public static void main(String[] args) {
		//Instanceamos los objetos con su contructor parametrizado
		Persona Alumno1 = new Alumno(11,"Carlos Muñoz", "22/03/1999","Soltero", 1232);
		Persona Alumno2 = new Alumno(12,"Mary Lebaza", "02/12/1989","Soltero", 2343);
		
		Persona Profesor1 = new Profesor(01,"Pedro Perea", "21/10/1998", "Casado", 32423);
		Persona Profesor2 = new Profesor(02,"Sandra Cabezas", "14/09/1965", "Casado",23454);
		
		Persona AP1 = new alumnoProfesor(21, "Andres Valencia", "02/03/2000", "Soltero", 12232);
		Persona AP2 = new alumnoProfesor(22, "Jesica Hoyos", "11/06/2002", "Casado", 12443);
		//imprimimos por consola los datos de los objetos por medio del metodo toString()
		System.out.println(Alumno1.toString());
		System.out.println(Alumno2.toString());
		
		System.out.println(Profesor1.toString());
		System.out.println(Profesor2.toString());
		
		System.out.println(AP1.toString());
		System.out.println(AP2.toString());
	}
}
