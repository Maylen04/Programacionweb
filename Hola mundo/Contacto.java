public class Contacto {

	private String nombre;
	private String numero;
	private String email;

  // Te parece agregar este constructor?
  public Contacto(String nombre, String numero, String email) {
    this.nombre = nombre;
    this.numero = numero;
    this.email = email;
  }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

  // propuesta de como podria ser...
  public void presentate() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Numero: " + numero);
    if (!email.isEmpty()) {
      System.out.println("Email: " + email);
    }
  }

}
