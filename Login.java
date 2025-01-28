/** @author Hugo Pérez Muñoz */
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        // Inicializar datos de prueba
        sistema.cargarDatosPrueba();

        Scanner scanner = new Scanner(System.in);
        boolean ejecutando = true;

        System.out.println("=== Bienvenido al Sistema de Biblioteca Digital ===");

        while (ejecutando) {
            // Pantalla de login
            System.out.print("\nUsuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();

            Usuario usuario = sistema.iniciarSesion(nombreUsuario, contrasena);

            if (usuario == null) {
                System.out.println("Usuario o contraseña incorrectos. Inténtalo de nuevo.");
                continue;
            }

            System.out.println("\n¡Bienvenido, " + usuario.getNombre() + "!");
            boolean enSesion = true;

            while (enSesion) {
                sistema.mostrarMenu(usuario);
                System.out.print("Selecciona una opción: ");
                int opcion = Integer.parseInt(scanner.nextLine());
                enSesion = sistema.ejecutarOpcion(usuario, opcion);
            }
        }

        scanner.close();
        System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
    }
}