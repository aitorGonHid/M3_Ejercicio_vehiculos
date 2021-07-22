
public class Rueda {
	//Atributos
	private String marca;
	private double diametro;
	
	//Constructor
	public Rueda() {
		this("marca_blanca", 18.0);
	}
	public Rueda(String marca, double diametro) {
		this.marca = marca;
		this.diametro = diametro;
	}
	
	//Getters & setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	//Metodos clase
	/**
	 * Comprueba que el valor del diametro de la rueda es valido
	 * Metodo estatico para poder llamarlo sin instanciar una rueda
	 * @param diametro
	 * @return true: diametro valido / false: diametro invalido
	 */
	public static boolean checkDiametro (float diametro) {
		boolean check = (diametro > 0.4 && diametro < 4) ? true : false; //Comprueba que el parametro este dentro del rango
		return check;
	}
}
