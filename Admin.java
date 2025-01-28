public class Admin {
    private String usuario;
    private String contrasena;
    private String añadirLibro;
    private String eliminarLibro;
    private String modificarLibro;
    private String verLibros;
    private String crearUsuario;
    private String verEstadisticas;
    private String verPrestamos;
    public Libros libros;
    private int numLibros;
    

    public static void InicioSesion (String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public static void crearUsuario (String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        System.out.println("Usuario creado con éxito.");
    }

    private void crearLibro (String fechaLibro, String nomLibro, String autorLibro, String editorialLibro){
        Libros libros = new Libros(fechaLibro, nomLibro, autorLibro, editorialLibro);
        this.numlibros++;
    }
}
