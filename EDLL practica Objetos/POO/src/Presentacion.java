/**
 * DESCRIPCION: Programa que crea vehiculos y almacena estos en un vector para imprimir su informacion.
 * ESTUDIANTE: Carlos Andres Muñoz Ortega.
 * FECHA: 2022/01/25
**/
import java.util.Vector;
public class Presentacion {

	public static void main(String[] args) {
		//Creamos el vector vehiculos con el tipo de dato vehiculo.
		Vector<Vehiculo> vehiculos = new Vector<Vehiculo>();
		//Instanceamos los objetos de las clases Taxi y Autobus por medio de su constructor parametrizado.
		Vehiculo myTaxi = new Taxi("cbx234", 1999, 50, 12323);
		Vehiculo myTaxi1 = new Taxi("fre455", 1998, 50, 87655);
		Vehiculo myTaxi2 = new Taxi("hhy656", 2000, 50, 45466);
		Vehiculo myTaxi3 = new Taxi("jhy567", 1998, 50, 44653);
		Vehiculo myTaxi4 = new Taxi("ert345", 2020, 50, 87543);
		Vehiculo myAutoBus = new Autobus("bbn213", 2017, 100, 5, "municipal");
		Vehiculo myAutoBus1 = new Autobus("oop897", 2016, 100, 6, "intermunicipal");
		Vehiculo myAutoBus2 = new Autobus("ggt546", 2009, 100, 9, "municipal");
		Vehiculo myAutoBus3 = new Autobus("ssd543", 2012, 100, 5, "intermunicipal");
		Vehiculo myAutoBus4 = new Autobus("dde567", 1999, 100, 5, "municipal");
		//Adicionamos los elementos al vector
		vehiculos.addElement(myTaxi);
		vehiculos.addElement(myTaxi1);
		vehiculos.addElement(myTaxi2);
		vehiculos.addElement(myTaxi3);
		vehiculos.addElement(myTaxi4);
		vehiculos.addElement(myAutoBus);
		vehiculos.addElement(myAutoBus1);
		vehiculos.addElement(myAutoBus2);
		vehiculos.addElement(myAutoBus3);
		vehiculos.addElement(myAutoBus4);
		//Iteramos con un ciclo for para extraer la informacion de cada vehiculo del vector
		for(int i = 0; i < vehiculos.size();i++) {
			//condicional que compara con la sentencia instanceof el contenido del vector, comparando con taxi o autobus.
			if(vehiculos.get(i) instanceof Taxi) {
				System.out.println("\nDatos Pertenecientes a un Vehiculo tipo Taxi: \n");
				//Objeto auxiliar que almacena el contenido del vector en la posicion i y los castea a la clase que pertenece
				Taxi aux1 = (Taxi) vehiculos.get(i);
				//imprimimos por consola llamando al metodo toString() del objeto 
				System.out.println(aux1.toString());
			}else {
				System.out.println("\nDatos Pertenecientes a un Vehiculo tipo Autobus: \n");
				//Objeto auxiliar que almacena el contenido del vector en la posicion i y los castea a la clase que pertenece
				Autobus aux2 = (Autobus) vehiculos.get(i);
				//imprimimos por consola llamando al metodo toString() del objeto
				System.out.println(aux2.toString());
			}
		}
		
	}
	
}
