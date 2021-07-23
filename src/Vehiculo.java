import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehiculo {
	//ATRIBUTOS
	private String matricula;
	private String marca;
	private String color;
	private Titular titular = null;
	private ArrayList<Persona> conductores = new ArrayList<>();
	
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
	
	//Getters & setters
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
	
	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public ArrayList<Persona> getConductores() {
		return conductores;
	}
	//Añadirá un conductor a la lista de conductores si tiene la licencia adecuada
	//Devuelve 0 si se ha podido añadir / -1 si el conductor no tiene una licencia valida
	public int addConductores(Persona conductor) {
		if (ConsolePrints.checkLicencia(conductor.getLicencia(), this)) {
			conductores.add(conductor);
			return 0;
		} else {
			return -1;
		}	
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
