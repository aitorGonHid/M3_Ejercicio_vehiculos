
public class Truck extends Vehiculo{
		//Atributos
		private Rueda[] ejeDelantero = new Rueda[2];
		private Rueda[] ejeIntermedio = new Rueda[4];
		private Rueda[] ejeTrasero = new Rueda[4];
		
		//Constructor
		public Truck(String matricula, String marca, String color) {
			super(matricula, marca, color);
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
	
		public Rueda[] getEjeIntermedio() {
			return ejeIntermedio;
		}
		
		//Añade la rueda pasada como parámetro al eje intermedio
		public void setEjeIntermedio(Rueda ruedaIntermedia) {
			this.ejeIntermedio[0] = ruedaIntermedia;
			this.ejeIntermedio[1] = ruedaIntermedia;
			this.ejeIntermedio[2] = ruedaIntermedia;
			this.ejeIntermedio[3] = ruedaIntermedia;
		}
		
		public Rueda[] getEjeTrasero() {
			return ejeTrasero;
		}
		
		//Añade la rueda pasada como parámetro al eje trasero
		public void setEjeTrasero(Rueda ruedaTrasera) {
			this.ejeTrasero[0] = ruedaTrasera;
			this.ejeTrasero[1] = ruedaTrasera;
			this.ejeTrasero[2] = ruedaTrasera;
			this.ejeTrasero[3] = ruedaTrasera;
		}
		
}
