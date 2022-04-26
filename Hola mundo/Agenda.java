import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
	static ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	static Scanner lectura = new Scanner(System.in);

	public static void main(final String[] args) {

		String option;
		System.out.println("AGENDA DE  MAYLEN v1" + "\n");

    // Esta es la pieza clave que te falto... while para repetir el ingreso de comando
    while (true) {

      System.out.println("¿Quieres [I]ngresar un nuevo contacto o [C]onsultar un cotacto existente?");
      option = lectura.next();
      switch (option) {
      case "i":
        // Podes hacer esto para nombre y numero:
        String nombreIngresado;
        do {
          System.out.println("Ingresa el nombre");
          nombreIngresado = lectura.nextLine();
        } while (nombreIngresado.isEmpty());
  
        // el numero te lo dejo a vos
        System.out.println("Ingresa su numero");
        // me gustaria que el numero sea un string "098364819" o "+598 (32) 455-1234" 
        final String numeroingresado = lectura.nextLine();
  
        System.out.println("Ingresa su email o presione enter si no lo sabe");
        final String emailingresado = lectura.nextLine();
  
        // Ya no seria necesario testear los datos xq sabemos qiue estos son validos 
          System.out.println("Usuario no ingresado, intente nuevamente" + "\n");
          Contacto aux;
          // ahi se hace mas facil instanciarlo con el contructor
          aux = new Contacto(nombreIngresado, numeroingresado, emailingresado);
          // aux.setNombre(nombreIngresado);
          // aux.setNumero(numeroingresado);
          // aux.setEmail(emailingresado);
          contactos.add(aux); // podriamos poner el new Contacto(...) adentro de el add y ahorrarnos el `aux`
          System.out.println("!Contacto Ingresado!");
  
        break;
  
      case "c":
  
        System.out.println("Ingresa el nombre  del contacto que quieres consultar");
        String nombre;
        // Aca podes usar lo mismo que puse antes, un do while mientras el valor ingresado es vacio
        nombre = lectura.nextLine();
        
        System.out.println("Informacion del contacto" + nombre + ": ");
        for (int i = 0; i < contactos.size(); i++) {
          if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
            // Otra pieza clave que te falto en el puzle
            contactos.get(i).presentate() // seria una fuincion a definir en la clase contacto que se presenta.
          }
        }
  
        break;
  
      default:
        break;
      }
    }
	}

}
