
public class Byke extends Vehiculo {
	//Atributos
	private Rueda ejeDelantero;
	private Rueda ejeTrasero;
	
	//Constructor
	public Byke(String matricula, String marca, String color) {
		super();
	}
	
	//Getters & setters
	public Rueda getEjeDelantero() {
		return ejeDelantero;
	}

	public void setEjeDelantero(Rueda ejeDelantero) {
		this.ejeDelantero = ejeDelantero;
	}

	public Rueda getEjeTrasero() {
		return ejeTrasero;
	}

	public void setEjeTrasero(Rueda ejeTrasero) {
		this.ejeTrasero = ejeTrasero;
	}
}
