
public class Licencia {
	
	//Atributos
	private int id;
	private char tipo;
	private String nombreCompleto;
	private String fechaCaducidad;
	/**
	 * Tipos licencia:
	 * A: coche, moto, camion
	 * B: coche, moto
	 * C: moto
	 * D: nada
	 */
	
	//Constructores
	public Licencia() {
		this(0, 'A', "Max Power", "15/7/2077");
	}
	
	public Licencia(char c) { //<<< Constructor rapido para comprobar la logica del programa
		this(0, c, "Max Power", "15/7/2077");
	}
	
	public Licencia(int id, char tipo, String nombreCompleto, String fechaCaducidad) {
		this.id = id;
		this.tipo = tipo;
		this.nombreCompleto = nombreCompleto;
		this.fechaCaducidad = fechaCaducidad;
	}
	
	//Getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	
	
	
}
