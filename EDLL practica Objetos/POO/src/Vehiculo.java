import java.util.Calendar;
public class Vehiculo {
	//Encapsulamiento de atributos: para este caso encapsulamos con la sentencia protected, debido a que esta clase es una clase
	// padre y sus atributos seran heredados por sus hijos.
	protected String matricula;
	protected int modelo;
	protected int potenciaCV;
	//Constructor simple 
	public Vehiculo() {
		System.out.println("Se ha creado el vehiculo sin sus datos correspondientes");
	}
	//Constructor Parametrizado de la clase Vehiculo.
	//Sobre Cargar el metodo Vehiculo o tambien contructor de la clase.
	public Vehiculo(String matricula, int modelo, int potenciaCV) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.potenciaCV = potenciaCV;
	}
	//Encapsulamiento setter y getter.
	public String getMatricula(){
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public int getPotenciaCV() {
		return potenciaCV;
	}
	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	//metodo que calcula el tiempo (en años) de rodamiento del vehiculo, por medio del atributo modelo y con la fecha del sistema
	public String calcularRodamiento() {
		//Se abre campo de memoria al objeto anio de la clase Calendar.
		Calendar anio = Calendar.getInstance();
		//anioActual guarda el dato del año actual por medio del metodo getWeekYear() de la clase calendar.
		int anioActual = anio.getWeekYear();
		//tiempoRodamiento almacena la resta del año actual con la del modelo y asi se obtiene cuanto tiempo de rodamiento lleva
		int tiempoRodamiento = anioActual - modelo;
		return "El tiempo de rodamiento del vehiculo es: "+tiempoRodamiento+" años";
	}
	//SobreCarga del metodo calcularRodamiento
	public String calcularRodamiento(Calendar anio) {
		//anioActual guarda el dato del año actual por medio del metodo getWeekYear() de la clase calendar.
		int anioActual = anio.getWeekYear();
		//tiempoRodamiento almacena la resta del año actual con la del modelo y asi se obtiene cuanto tiempo de rodamiento lleva
		int tiempoRodamiento = anioActual - modelo;
		return "El tiempo de rodamiento del vehiculo es: "+tiempoRodamiento+" años";
	}
	//SobreEscribir metodo toString()
	public String toString() {
		return "\n Matricula:" + matricula + "\n Modelo: "+ modelo + "\n PotenciaCV: " +potenciaCV+ "\n "+ calcularRodamiento();
	}
}
