import java.util.Scanner;

public abstract class ConsolePrints {
	
	
	public ConsolePrints() {
		super();
	}

	static Scanner scan = new Scanner(System.in);
	
	public static Byke printByke() {

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
		
		return moto;
	}
	
	public static Car printCar() {
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
		
		return coche;
	}

	public static Truck printTruck() {
		//Introduce los datos del camion
		System.out.println("Introduce la matricula:");
		String matriculaT = scan.nextLine().toString();
		//Comprueba la matricula
		Boolean checkMatricula = Vehiculo.checkMatricula(matriculaT);
		while (!checkMatricula) {
			System.out.println("Introduce una matricula correcta: (0000aaa / 0000aa)");
			matriculaT = scan.nextLine().toString();
			checkMatricula = Vehiculo.checkMatricula(matriculaT);
		}
		System.out.println("Introduce la marca:");
		String marcaT = scan.nextLine().toString();
		System.out.println("Introduce el color:");
		String colorT = scan.nextLine().toString();
		//Crea una nueva moto
		Truck camion = new Truck(matriculaT,marcaT, colorT);
		//Pide el modelo de rueda
		System.out.println("Introduce la marca de rueda que quieres montar:");
		String marcaRuedaT = scan.nextLine().toString();
		System.out.println("Introduce el diametro de rueda que quieres montar:");
		float diametroT = Float.parseFloat(scan.nextLine().toString());
		Boolean checkRuedaT = Rueda.checkDiametro(diametroT);
		while (!checkRuedaT) {
			System.out.println("Introduce un diametro correcto: (  0.4 < D < 4)");
			diametroT = Float.parseFloat(scan.nextLine().toString());
			checkRuedaT = Rueda.checkDiametro(diametroT);
		}	
		camion.setEjeDelantero(new Rueda (marcaRuedaT, diametroT));
		camion.setEjeIntermedio(new Rueda (marcaRuedaT, diametroT));
		camion.setEjeTrasero(new Rueda (marcaRuedaT, diametroT));
		
		return camion;
	}
	//Pide datos para crear un titular
	public static Titular newTitular() {
		System.out.println("Introducir datos del titular:");
		System.out.println("Nombre: ");
		String nombre = scan.nextLine().toString();
		System.out.println("Apellido");
		String apellido = scan.nextLine().toString();
		System.out.println("Fecha de nacimiento ( dd/mm/aaaa)");
		String fechaNacimiento = scan.nextLine().toString();
		System.out.println("Licencia (A, B, C o D)");
		char tipoLicencia = scan.nextLine().toString().toUpperCase().charAt(0);
		System.out.println("Seguro (si/no)");
		String seguroInput = scan.nextLine().toString();
		boolean seguro = seguroInput.equals("si");
		System.out.println("Garage propio (si/no)");
		String garageInput = scan.nextLine().toString();
		boolean garage = garageInput.equals("si");
		Titular titular = new Titular(nombre, apellido, fechaNacimiento, Persona.newLicencia(tipoLicencia), seguro, garage);
		return titular;
	}
	
	//Pide datos para crear un conductor
	public static Conductor newConductor() {
		System.out.println("Introducir datos del conductor:");
		System.out.println("Nombre: ");
		String nombre = scan.nextLine().toString();
		System.out.println("Apellido");
		String apellido = scan.nextLine().toString();
		System.out.println("Fecha de nacimiento ( dd/mm/aaaa)");
		String fechaNacimiento = scan.nextLine().toString();
		System.out.println("Licencia (A, B, C o D)");
		char tipoLicencia = scan.nextLine().toString().toUpperCase().charAt(0);
		Conductor conductor = new Conductor(nombre, apellido, fechaNacimiento, Persona.newLicencia(tipoLicencia));
		return conductor;
	}
	
	//Devolvera true o false si el vehiculo y licencia son compatibles
	public static boolean checkLicencia(Licencia licencia, Vehiculo vehiculo) {

		if (vehiculo instanceof Truck) {
			if (licencia.getTipo() == 'A') return true;
			return false;
		}
		if (vehiculo instanceof Car) {
			if (licencia.getTipo() == 'A' || licencia.getTipo() == 'B') return true;
			return false;
		}
		if (vehiculo instanceof Byke) {
			if (licencia.getTipo() == 'A' || licencia.getTipo() == 'B' || licencia.getTipo() == 'C') return true;
			return false;
		}
		
		return false;
	}
	//Preguntará quien sacará el vehiculo y si se trata de un conductor si su licencia lo permite
	public static int sacarVehiculo (Vehiculo v, Titular t) {
		System.out.println("Sacará usted mismo el vehiculo del taller?");
		String respuesta = scan.nextLine();
		if (respuesta.equals("si")) {
			v.addConductores(t); //añade al titular también como conductor
			System.out.println("Aqui tiene su vehiculo. Buen viaje !!");
			return 0;
		} else {
			Conductor conductor = ConsolePrints.newConductor();
			if (checkLicencia(conductor.getLicencia(), v)) {
				v.addConductores(conductor); //añade el conductor a la lista de conductores del vehiculo
				System.out.println("Aqui tiene su vehiculo. Buen viaje !!");
				return 0;
			} else {
				System.out.println("La licencia del conductor no permite usar este vehiculo");
				return -1;
			}
		}
	}
}


