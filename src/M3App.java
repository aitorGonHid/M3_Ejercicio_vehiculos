import java.util.ArrayList;
import java.util.Scanner;

public class M3App {
	/**
	 * Logica del programa taller manager:
	 * 1-Solicita a�adir / no a�adir un vehiculo
	 * 2-Solicita los datos del titular
	 * 3-Solicita a que tipo de vehiculo se le van a cambiar las ruedas
	 * 4-Vincula titular y vehiculo
	 * 5-Solicita modelo y medidas de neumatico
	 * 6-Pregunta quien sacar� el vehiculo del taller
	 * 	6.1 - Si lo saca el titular verifica su licencia 
	 * 		  - valida: saca el vehiculo y lo a�ade a su lista de conductores
	 * 		  - no valida: termina el proceso
	 * 	6.2 - Si solicita que lo saque un conductor verifica su licencia.
	 *  	  - valida: saca el vehiculo y lo a�ade a su lista de conductores
	 *  	  - no valida: termina el proceso
	 * 7- Solicita si se quiere a�adir otro vehiculo
	 * 8- Solicita continuar con el mismo titular o con uno diferente
	 * 	8.1 - continuar con el mismo titular -> paso 3
	 * 	8.2 - nuevo titular -> paso 2
	 */
	public static void main(String[] args) {
		//Listas
		ArrayList<Persona> listaUsuarios = new ArrayList<>();
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
		
		//Header
		System.out.println("+---------------------+");
		System.out.println("|   TALLER MANAGER    |");
		System.out.println("+---------------------+");
		
		//Inicia programa
		boolean continuar = false;
		Scanner sc = new Scanner(System.in);
		//Pide a�adir vehiculo
		System.out.println("Desea a�adir un vehiculo?");
		String respuesta = sc.nextLine().toString().toLowerCase();
		if (respuesta.equals("si")) continuar = true;
		Titular titular = null;
		//Inicia la logica del programa mientras el usuario no solicite no continuar
		while (continuar) {
			//Pide datos del usuario titular si aun no hay uno seleccionado
			if (titular == null) {
				titular = ConsolePrints.newTitular();
			} else {
				System.out.println("A�adir nuevo titular o contiunar con el mismo? (si/no)");
				respuesta = sc.nextLine();
				//Cambio de titular
				if (respuesta.equals("si")) {
					titular = ConsolePrints.newTitular();
				}
			}
			//titular = ConsolePrints.newTitular();
			//Solicita tipo de vehiculo
			System.out.println("Quiere a�adir un coche, una moto o un camion?");
			String tipoVehiculo = sc.nextLine().toLowerCase();
			
			switch (tipoVehiculo) {
			case ("moto"):
				if (titular.getLicencia().getTipo() == 'A' || titular.getLicencia().getTipo() == 'B' || titular.getLicencia().getTipo() == 'C') {
					Byke moto = ConsolePrints.printByke();
					moto.setTitular(titular);
					int exitM = ConsolePrints.sacarVehiculo(moto, titular);
					if (exitM == -1) continuar = false;
				} else {
					System.out.println("Licencia no v�lida !!");
					continuar = false;
				}
				break;
			case ("coche"):
				if (titular.getLicencia().getTipo() == 'A' || titular.getLicencia().getTipo() == 'B') {
					Car coche = ConsolePrints.printCar();
					coche.setTitular(titular);
					int exitC = ConsolePrints.sacarVehiculo(coche, titular);
					if (exitC == -1) continuar = false;
				} else {
					System.out.println("Licencia no v�lida !!");
					continuar = false;
				}
				break;
			case ("camion"):
				if (titular.getLicencia().getTipo() == 'A') {
					Truck camion = ConsolePrints.printTruck();
					camion.setTitular(titular);
					int exitT = ConsolePrints.sacarVehiculo(camion, titular);
					if (exitT == -1) continuar = false;
				} else {
					System.out.println("Licencia no v�lida !!");
					continuar = false;
				}
				break;
			default:
				System.out.println("Tipo de vehiculo erroneo !!");
			}
			//Preguntar� si quieres a�adir otro vehiculo si el proceso ha terminado con exito
			if (continuar) {
				System.out.println("Quiere a�adir un vechiculo?");
				respuesta = sc.nextLine().toString().toLowerCase();
				if (!(respuesta.equals("si"))) continuar = false;
			}
		}
		sc.close();
		System.out.println("Saliendo...");
		

	}

}
