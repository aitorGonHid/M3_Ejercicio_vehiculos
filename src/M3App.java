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
		//Pide a�adir vehiculo
		System.out.println("Desea a�adir un vehiculo?");
		String respuesta = sc.nextLine().toString().toLowerCase();
		if (respuesta.equals("si")) continuar = true;
		
		while (continuar) {
			//El usuario desea continuar a�adiendo vehiculo/s
			//Solicita tipo de vehiculo
			System.out.println("Quiere a�adir un coche o una moto?");
			String tipoVehiculo = sc.nextLine().toLowerCase();
			
			switch (tipoVehiculo) {
			case ("moto"):
				ConsolePrints.printByke();
				break;
			case ("coche"):
				ConsolePrints.printCar();
				break;
			default:
				System.out.println("Introducidos datos erroneos !!");
			}
			
			System.out.println("Quiere a�adir un coche o una moto?");
			respuesta = sc.nextLine().toString().toLowerCase();
			if (!(respuesta.equals("si"))) continuar = false;
		}
		sc.close();
		System.out.println("Saliendo...");
		

	}

}
