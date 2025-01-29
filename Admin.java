/** @author Javier Gil Galan */

public class Admin extends Usuario {
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

    public Admin(String usuario, String contrasena) {
        super(usuario, contrasena);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.añadirLibro = "defaultAñadirLibro";
        this.eliminarLibro = "defaultEliminarLibro";
        this.modificarLibro = "defaultModificarLibro";
        this.verLibros = "defaultVerLibros";
        this.crearUsuario = "defaultCrearUsuario";
        this.verEstadisticas = "defaultVerEstadisticas";
        this.verPrestamos = "defaultVerPrestamos";
        this.libros = null;
        this.numLibros = 0;
    }

    public void InicioSesion (String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public void crearUsuario (String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        System.out.println("Usuario creado con éxito.");
    }

    private void crearLibro (String fechaLibro, String nomLibro, String autorLibro, String editorialLibro, String categoria){
        Libros libros = new Libros(fechaLibro, nomLibro, autorLibro, editorialLibro, categoria);
        this.numLibros++;
    }   
}