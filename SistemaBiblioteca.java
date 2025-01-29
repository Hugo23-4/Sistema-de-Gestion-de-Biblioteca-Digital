/** @author Hugo Pérez Muñoz */

import java.util.ArrayList;

public class SistemaBiblioteca {
    private ArrayList<Libros> libros;
    private ArrayList<Usuario> usuarios;

    public SistemaBiblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public Usuario iniciarSesion(String nombre, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getContrasena().equals(contrasena)) {
                return usuario;
            }
        }
        return null;
    }

    public void mostrarMenu(Usuario usuario) {
        System.out.println("\n Menú Principal ");
        if (usuario instanceof Admin) {
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Consultar usuarios");
            System.out.println("4. Mostrar libros prestados");
        } else {
            System.out.println("1. Buscar libros");
            System.out.println("2. Realizar préstamo");
            System.out.println("3. Devolver libro");
        }
        System.out.println("0. Cerrar sesión");
    }

    public boolean ejecutarOpcion(Usuario usuario, int opcion) {
        return opcion != 0;
    }
}
