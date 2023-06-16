package main;

import java.util.Scanner;



public class Principal {

	private static Contenedor contenedor;

    public static void main(String[] args) {
        contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = obtenerOpcion(scanner);
            ejecutarAccion(opcion, scanner);
        } while (opcion != 9);

        System.out.println("¡Hasta luego!");
    }

    private static void mostrarMenu() {
        System.out.println("== Menú Principal ==");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Agregar Profesional");
        System.out.println("3. Agregar Administrativo");
        System.out.println("4. Agregar Capacitación");
        System.out.println("5. Eliminar Usuario");
        System.out.println("6. Listar Usuarios");
        System.out.println("7. Listar Usuarios por Tipo");
        System.out.println("8. Listar Capacitaciones");
        System.out.println("9. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private static int obtenerOpcion(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static void ejecutarAccion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                contenedor.agregarCliente(scanner);
                break;
            case 2:
                contenedor.agregarProfesional(scanner);
                break;
            case 3:
                contenedor.agregarAdministrativo(scanner);
                break;
            case 4:
                contenedor.agregarCapacitacion(scanner);
                break;
            case 5:
                contenedor.eliminarUsuario(scanner);
                break;
            case 6:
                contenedor.listarUsuarios();
                break;
            case 7:
                contenedor.listarUsuariosPorTipo(scanner);
                break;
            case 8:
                contenedor.listarCapacitaciones();
                break;
            case 9:
                // Opción para salir, no se realiza ninguna acción adicional
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                break;
        }
    }
}
