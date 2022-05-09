
public class Taxi extends Vehiculo{
	private int numeroLicencia;
	public Taxi(String matricula, int modelo, int potenciaCV, int numeroLicencia) {
		super(matricula, modelo, potenciaCV);
		this.numeroLicencia = numeroLicencia;
	}
	public int getNumeroLicencia() {
		return numeroLicencia;
	}
	public void setNumeroLicencia(int numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}
	//Sobre escribir metodo toString() en la clase hija Taxi
	public String toString() {
		return super.toString() + "\n Numero de licencia: "+numeroLicencia;
	}
}
