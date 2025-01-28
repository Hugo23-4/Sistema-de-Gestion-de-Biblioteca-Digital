public class Usuario {
    private String usuario;
    private String contrasena;
    private String verLibros;
    public Libros libros;
    private int numLibros;
    private int CogerLibro;
    private int DejarLibro;
    
    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    private void CogerLibro (int CogerLibro){
        if (this.numLibros < 3) {
            this.numLibros++;
            System.out.println("Libro cogido con éxito.");
        } else {
            System.out.println("No puedes coger más de 3 libros al mismo tiempo.");
        }
    }

    private void DejarLibro(){
        if (this.numLibros > 0) {
            this.numLibros--;
            System.out.println("Libro devuelto con éxito.");
        } else {
            System.out.println("No tienes libros cogidos para devolver.");
        }
    }

}
