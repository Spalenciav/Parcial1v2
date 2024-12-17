// Autor: Santiago Palencia
// Tema: Parcial 1 Restaurante

package parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurante {
    private List<Producto> menu;

    public Restaurante() {
        menu = new ArrayList<>();
        // Agregar algunos productos al menú
        menu.add(new Producto("Hamburguesa", 7000));
        menu.add(new Producto("Pastas con Pollo", 7000));
        menu.add(new Producto("Papas Fritas", 5000));
        menu.add(new Producto("Sopa", 5000));
        menu.add(new Producto("Refresco", 3000));
        menu.add(new Producto("Jugo De Naranja", 3000));
        menu.add(new Producto("Helado con pastel", 4000));        
    }

    public void mostrarMenu() {
        System.out.println("Menú disponible:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }
    }

    public void realizarPedido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nombreCliente);
        Pedido pedido = new Pedido(cliente);

        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            System.out.print("Seleccione un producto (0 para terminar): ");
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                continuar = false;
            } else if (opcion > 0 && opcion <= menu.size()) {
                pedido.agregarProducto(menu.get(opcion - 1));
                System.out.println("Producto agregado: " + menu.get(opcion - 1).getNombre());
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        System.out.println(pedido);
    }
}