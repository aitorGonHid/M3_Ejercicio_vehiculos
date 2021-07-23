
public class Titular extends Persona {
	//Atributos
	private boolean seguro;
	private boolean garagePropio;
	
	//Constructores
	public Titular() {
		super();
		this.seguro = true;
		this.garagePropio = true;
	}

	public Titular(String nombre, String apellido, String fechaNacimiento, Licencia licencia, boolean seguro, boolean garage) {
		super(nombre, apellido, fechaNacimiento, licencia);
		this.seguro = seguro;
		this.garagePropio = garage;
	}
	
	//Getters and setters
	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public boolean isGaragePropio() {
		return garagePropio;
	}

	public void setGaragePropio(boolean garagePropio) {
		this.garagePropio = garagePropio;
	}

}
