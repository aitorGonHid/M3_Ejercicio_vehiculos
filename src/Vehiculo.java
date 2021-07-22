import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehiculo {
	//ATRIBUTOS
	private String matricula;
	private String marca;
	private String color;
	
	//Constructor
	public Vehiculo() {
		this("0000AA", "Honda", "Negro");
	}
	
	public Vehiculo(String matricula, String marca, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//Metodos clase
	/**
	 * Comprueba que una matricula cumple el patron 4 digitos 2,3 letras
	 * Metodo estatico para poder ser llamado sin instanciar un vehiculo
	 * @param matricula: matriculo por verificar
	 * @return true: matricula valida / false: matricula invalida
	 */
	public static boolean checkMatricula (String matricula) {
		if (matricula.length() < 6 || matricula.length() > 7) return false; // comprobar numero de digitos valido
		
		Matcher m = Pattern.compile("^[0-9]{4}[A-Za-z]{2,3}$").matcher(matricula); //Crea un matcher a partir del patron que se comparará con el parametro
		if (m.find()) return true;
		return false;
	}
}
