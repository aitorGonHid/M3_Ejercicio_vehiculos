
public class Persona {
	
	//Atributos
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private Licencia licencia;
	
	//Constructores
	public Persona() {
		this("Max", "Power", "1/1/1990", new Licencia());
	}
	public Persona(String nombre, String apellido, String fechaNacimiento, Licencia licencia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.licencia = licencia;
	}
	
	//Getters & setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Licencia getLicencia() {
		return licencia;
	}
	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	public static Licencia newLicencia (char c) {
		switch (c) {
		case 'A':
			return new Licencia('A');
		case 'B':
			return new Licencia('B');
		case 'C':
			return new Licencia('C');
		case 'D':
			return new Licencia('D');
		default:
			return new Licencia('A');
		}
	}
}
