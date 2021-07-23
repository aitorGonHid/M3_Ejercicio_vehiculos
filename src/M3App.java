import java.util.Scanner;

public class M3App {

	public static void main(String[] args) {
		//Header
		System.out.println("+---------------------+");
		System.out.println("|   TALLER MANAGER    |");
		System.out.println("+---------------------+");
		
		//Inicia programa
		boolean continuar = false;
		Scanner sc = new Scanner(System.in);
		//Pide datos del usuario titular
		Titular titular = ConsolePrints.newTitular();
		//Pide a�adir vehiculo
		System.out.println("Desea a�adir un vehiculo?");
		String respuesta = sc.nextLine().toString().toLowerCase();
		if (respuesta.equals("si")) continuar = true;
		
		while (continuar) {
			//El usuario desea continuar a�adiendo vehiculo/s
			//Solicita tipo de vehiculo
			System.out.println("Quiere a�adir un coche, una moto o un camion?");
			String tipoVehiculo = sc.nextLine().toLowerCase();
			
			switch (tipoVehiculo) {
			case ("moto"):
				if (titular.getLicencia().getTipo() == 'A' || titular.getLicencia().getTipo() == 'B' || titular.getLicencia().getTipo() == 'C') {
					Byke moto = ConsolePrints.printByke();
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
