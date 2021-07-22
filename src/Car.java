
public class Car extends Vehiculo {
	//Atributos
	private Rueda[] ejeDelantero = new Rueda[2];
	private Rueda[] ejeTrasero = new Rueda[2];
	
	//Constructor
	public Car(String matricula, String marca, String color) {
		super();
	}
		
	//Getters & setters
	public Rueda[] getEjeDelantero() {
			return ejeDelantero;
	}
	//Añade la rueda pasada como parámetro al eje delantero
	public void setEjeDelantero(Rueda ruedaDelantera) {
		this.ejeDelantero[0] = ruedaDelantera;
		this.ejeDelantero[1] = ruedaDelantera;
	}
	
	public Rueda[] getEjeTrasero() {
		return ejeTrasero;
	}
	//Añade la rueda pasada como parámetro al eje trasero
	public void setEjeTrasero(Rueda ruedaTrasera) {
		this.ejeTrasero[0] = ruedaTrasera;
		this.ejeTrasero[1] = ruedaTrasera;
	}
}
