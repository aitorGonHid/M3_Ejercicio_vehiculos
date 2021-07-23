import java.util.ArrayList;
import java.util.Scanner;

public class M3App {

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
		//Pide añadir vehiculo
		System.out.println("Desea añadir un vehiculo?");
		String respuesta = sc.nextLine().toString().toLowerCase();
		if (respuesta.equals("si")) continuar = true;
		Titular titular = null;
		
		while (continuar) {
			//Pide datos del usuario titular si aun no hay uno seleccionado
			if (titular == null) {
				titular = ConsolePrints.newTitular();
			} else {
				System.out.println("Añadir nuevo titular o contiunar con el mismo? (si/no)");
				respuesta = sc.nextLine();
				//Cambio de titular
				if (respuesta.equals("si")) {
					titular = ConsolePrints.newTitular();
				}
			}
			//titular = ConsolePrints.newTitular();
			//Solicita tipo de vehiculo
			System.out.println("Quiere añadir un coche, una moto o un camion?");
			String tipoVehiculo = sc.nextLine().toLowerCase();
			
			switch (tipoVehiculo) {
			case ("moto"):
				if (titular.getLicencia().getTipo() == 'A' || titular.getLicencia().getTipo() == 'B' || titular.getLicencia().getTipo() == 'C') {
					Byke moto = ConsolePrints.printByke();
					int exitM = ConsolePrints.sacarVehiculo(moto, titular);
					if (exitM == -1) continuar = false;
				} else {
					System.out.println("Licencia no válida !!");
					continuar = false;
				}
				break;
			case ("coche"):
				if (titular.getLicencia().getTipo() == 'A' || titular.getLicencia().getTipo() == 'B') {
					Car coche = ConsolePrints.printCar();
					int exitC = ConsolePrints.sacarVehiculo(coche, titular);
					if (exitC == -1) continuar = false;
				} else {
					System.out.println("Licencia no válida !!");
					continuar = false;
				}
				break;
			case ("camion"):
				if (titular.getLicencia().getTipo() == 'A') {
					Truck camion = ConsolePrints.printTruck();
					int exitT = ConsolePrints.sacarVehiculo(camion, titular);
					if (exitT == -1) continuar = false;
				} else {
					System.out.println("Licencia no válida !!");
					continuar = false;
				}
				break;
			default:
				System.out.println("Tipo de vehiculo erroneo !!");
			}
			//Preguntará si quieres añadir otro vehiculo si el proceso ha terminado con exito
			if (continuar) {
				System.out.println("Quiere añadir un vechiculo?");
				respuesta = sc.nextLine().toString().toLowerCase();
				if (!(respuesta.equals("si"))) continuar = false;
			}
		}
		sc.close();
		System.out.println("Saliendo...");
		

	}

}
