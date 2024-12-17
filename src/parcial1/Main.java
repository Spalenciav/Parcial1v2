// Autor: Santiago Palencia
// Tema: Parcial 1 Restaurante

package parcial1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Mostrar menú");
            System.out.println("2. Realizar pedido");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    restaurante.mostrarMenu();
                    break;
                case 2:
                    restaurante.realizarPedido();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}