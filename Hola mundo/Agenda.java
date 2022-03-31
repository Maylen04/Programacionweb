import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
	static ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	static Scanner lectura = new Scanner(System.in);

	public static void main(final String[] args) {

		String option;
		System.out.println("AGENDA DE  MAYLEN v1" + "\n");

		System.out.println("¿Quieres [I]ngresar un nuevo contacto o [C]onsultar un cotacto existente?");
		option = lectura.next();
		switch (option) {
		case "i":
			System.out.println("Ingresa el nombre");
			final String nombreIngresado = lectura.next();

			System.out.println("Ingresa su numero");
			final int numeroingresado = lectura.nextInt();

			System.out.println("Ingresa su email o presione enter si no lo sabe");
			final String emailingresado = lectura.next();
			if (emailingresado == null) {
				System.out.println("Usuario no ingresado, intente nuevamente" + "\n");
			} else {
				Contacto aux;
				aux = new Contacto();
				aux.setNombre(nombreIngresado);
				aux.setNumero(numeroingresado);
				aux.setEmail(emailingresado);
				contactos.add(aux);
				System.out.println("!Contacto Ingresado!");
			}

			break;

		case "c":

			System.out.println("Ingresa el nombre  del contacto que quieres consultar");
			String nombre;
			nombre = lectura.next();
			System.out.println("");
			System.out.println("Informacion del contacto" + nombre + ": ");
			for (int i = 0; i < contactos.size(); i++) {
				if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {

				}
			}

			break;

		default:
			break;
		}
		System.out.println("¿Quieres [I]ngresar un nuevo contacto o [C]onsultar un cotacto existente?");

	}

}
