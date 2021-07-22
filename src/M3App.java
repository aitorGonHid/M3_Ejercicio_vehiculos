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
		//Pide añadir vehiculo
		System.out.println("Desea añadir un vehiculo?");
		String respuesta = sc.nextLine().toString().toLowerCase();
		if (respuesta.equals("si")) continuar = true;
		
		while (continuar) {
			//El usuario desea continuar añadiendo vehiculo/s
			//Solicita tipo de vehiculo
			System.out.println("Quiere añadir un coche o una moto?");
			String tipoVehiculo = sc.nextLine().toLowerCase();
			
			switch (tipoVehiculo) {
			case ("moto"):
				//Introduce los datos de la moto
				System.out.println("Introduce la matricula:");
				String matriculaM = sc.nextLine().toString();
				//Comprueba la matricula
				Boolean checkMatricula = Vehiculo.checkMatricula(matriculaM);
				while (!checkMatricula) {
					System.out.println("Introduce una matricula correcta: (0000aaa / 0000aa)");
					matriculaM = sc.nextLine().toString();
					checkMatricula = Vehiculo.checkMatricula(matriculaM);
				}
				System.out.println("Introduce la marca:");
				String marcaM = sc.nextLine().toString();
				System.out.println("Introduce el color:");
				String colorM = sc.nextLine().toString();
				//Crea una nueva moto
				Byke moto = new Byke(matriculaM,marcaM, colorM);
				//Pide el modelo de rueda
				System.out.println("Introduce la marca de rueda que quieres montar:");
				String marcaRuedaM = sc.nextLine().toString();
				System.out.println("Introduce el diametro de rueda que quieres montar:");
				float diametroM = Float.parseFloat(sc.nextLine().toString());
				Boolean checkRueda = Rueda.checkDiametro(diametroM);
				while (!checkRueda) {
					System.out.println("Introduce un diamtro correcto: (  0.4 < D < 4");
					matriculaM = sc.nextLine().toString();
					checkMatricula = Vehiculo.checkMatricula(matriculaM);
				}
				moto.setEjeDelantero(new Rueda(marcaRuedaM, diametroM));
				moto.setEjeTrasero(new Rueda(marcaRuedaM, diametroM));
				break;
			case ("coche"):
				//Introduce los datos de la moto
				System.out.println("Introduce la matricula:");
				String matriculaC = sc.nextLine().toString();
				//Comprueba la matricula
				Boolean checkMatriculaC = Vehiculo.checkMatricula(matriculaC);
				while (!checkMatriculaC) {
					System.out.println("Introduce una matricula correcta: (0000aaa / 0000aa)");
					matriculaC = sc.nextLine().toString();
					checkMatricula = Vehiculo.checkMatricula(matriculaC);
				}
				System.out.println("Introduce la marca:");
				String marcaC = sc.nextLine().toString();
				System.out.println("Introduce el color:");
				String colorC = sc.nextLine().toString();
				//Crea una nueva moto
				Car coche = new Car(matriculaC,marcaC, colorC);
				//Pide el modelo de rueda
				System.out.println("Introduce la marca de rueda que quieres montar:");
				String marcaRuedaC = sc.nextLine().toString();
				System.out.println("Introduce el diametro de rueda que quieres montar:");
				float diametroC = Float.parseFloat(sc.nextLine().toString());
				Boolean checkRuedaC = Rueda.checkDiametro(diametroC);
				while (!checkRuedaC) {
					System.out.println("Introduce un diamtro correcto: (  0.4 < D < 4");
					matriculaC = sc.nextLine().toString();
					checkMatricula = Vehiculo.checkMatricula(matriculaC);
				}
				coche.setEjeDelantero(new Rueda(marcaRuedaC, diametroC));
				coche.setEjeTrasero(new Rueda(marcaRuedaC, diametroC));
				break;
			}
		} 
		System.out.println("/EXIT");
		

	}

}
