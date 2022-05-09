	
public class Autobus extends Vehiculo{
	//Encapsulamiento de atributos: Para estos atributos son encapsulados con la sentencia private ya que no podran ser vistas por 
	//otra clase solo en ella misma y esta clase no tendra clases hijas.
	private int numeroPlaza;
	private String categoria; // donde categoria puede ser municipal o intermunicipal.
	public Autobus(String matricula, int modelo, int potenciaCV, int numeroPlaza, String categoria) {
		super(matricula, modelo, potenciaCV);
		this.numeroPlaza = numeroPlaza;
		this.categoria = categoria;
	}
	//Encapsulamiento setter y getter
	public int getNumeroPlaza() {
		return numeroPlaza;
	}
	public void setNumeroPlaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	//SobreEscribir metodo toString() en la clase hija Autobus
	public String toString() {
		return super.toString() + "\n Numero de Plaza: "+ numeroPlaza+ "\n Categoria: "+categoria; 
	}
}
