import java.util.Scanner;

public abstract class ConsolePrints {
	
	
	public ConsolePrints() {
		super();
	}

	static Scanner scan = new Scanner(System.in);
	
	public static void printByke() {

		//Introduce los datos de la moto
		System.out.println("Introduce la matricula:");
		String matriculaM = scan.nextLine().toString();
		//Comprueba la matricula
		Boolean checkMatricula = Vehiculo.checkMatricula(matriculaM);
		while (!checkMatricula) {
			System.out.println("Introduce una matricula correcta: (0000aaa / 0000aa)");
			matriculaM = scan.nextLine().toString();
			checkMatricula = Vehiculo.checkMatricula(matriculaM);
		}
		System.out.println("Introduce la marca:");
		String marcaM = scan.nextLine().toString();
		System.out.println("Introduce el color:");
		String colorM = scan.nextLine().toString();
		//Crea una nueva moto
		Byke moto = new Byke(matriculaM,marcaM, colorM);
		//Pide el modelo de rueda
		System.out.println("Introduce la marca de rueda que quieres montar:");
		String marcaRuedaM = scan.nextLine().toString();
		System.out.println("Introduce el diametro de rueda que quieres montar:");
		float diametroM = Float.parseFloat(scan.nextLine().toString());
		Boolean checkRuedaM = Rueda.checkDiametro(diametroM);
		while (!checkRuedaM) {
			System.out.println("Introduce un diametro correcto: (  0.4 < D < 4)");
			diametroM = Float.parseFloat(scan.nextLine().toString());
			checkRuedaM = Rueda.checkDiametro(diametroM);
		}
		moto.setEjeDelantero(new Rueda(marcaRuedaM, diametroM));
		moto.setEjeTrasero(new Rueda(marcaRuedaM, diametroM));
	}
	
	public static void printCar() {
		//Introduce los datos de la moto
		System.out.println("Introduce la matricula:");
		String matriculaC = scan.nextLine().toString();
		//Comprueba la matricula
		Boolean checkMatriculaC = Vehiculo.checkMatricula(matriculaC);
		while (!checkMatriculaC) {
			System.out.println("Introduce una matricula correcta: (0000aaa / 0000aa)");
			matriculaC = scan.nextLine().toString();
			checkMatriculaC = Vehiculo.checkMatricula(matriculaC);
		}
		System.out.println("Introduce la marca:");
		String marcaC = scan.nextLine().toString();
		System.out.println("Introduce el color:");
		String colorC = scan.nextLine().toString();
		//Crea una nueva moto
		Car coche = new Car(matriculaC,marcaC, colorC);
		//Pide el modelo de rueda
		System.out.println("Introduce la marca de rueda que quieres montar:");
		String marcaRuedaC = scan.nextLine().toString();
		System.out.println("Introduce el diametro de rueda que quieres montar:");
		float diametroC = Float.parseFloat(scan.nextLine().toString());
		Boolean checkRuedaC = Rueda.checkDiametro(diametroC);
		while (!checkRuedaC) {
			System.out.println("Introduce un diametro correcto: (  0.4 < D < 4)");
			diametroC = Float.parseFloat(scan.nextLine().toString());
			checkRuedaC = Rueda.checkDiametro(diametroC);
		}
		coche.setEjeDelantero(new Rueda(marcaRuedaC, diametroC));
		coche.setEjeTrasero(new Rueda(marcaRuedaC, diametroC));
	}
}


