// Autor: Santiago Palencia
// Tema: Parcial 1 Restaurante

package parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Parcial1 {
    // método main

    private static Cliente crearCliente(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        return new Cliente(nombre);
    }

    private static Pedido seleccionarPedido(List<Pedido> pedidos, Scanner scanner) {
        System.out.println("Seleccione un pedido (ingrese el número):");
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println((i + 1) + ". " + pedidos.get(i));
        }
        int opcion = scanner.nextInt();
        if (opcion >= 1 && opcion <= pedidos.size()) {
            return pedidos.get(opcion - 1);
        } else {
            System.out.println("Opción inválida.");
            return null;
        }
    }

    private static void agregarProductos(Pedido pedido, Scanner scanner) {
             do {
                    System.out.println("Escriba el numero del producto que quiere agregar");
                    System.out.println("1. Entrada de Nachos $5000 ");
                    System.out.println("2. Entrada de Deditos $4500");
                    System.out.println("3. Plato principal de Pastas $6000");
                    System.out.println("4. Plato principal de Carnes con Arroz $6000");
                    System.out.println("5. Postre de Helado $3000");
                    System.out.println("6. Postre de Pastel $3000");
                    System.out.println("8. Bebida de Limonada $2000");
                    System.out.println("9. Bebida de Gaseosa $2000");
                    System.out.println("10. Consultar productos agregados al pedido");
                    System.out.println("11. Terminar pedido ");
                        switch (opcion) {

                    case 1 -> {
                        System.out.print("Producto Agregado");
                    pedido = seleccionarPedido(pedidos, scanner);
                    if (pedido != null) {
                        agregarProductos(pedido, scanner);
                    }
                    break;
                   
                    }
                        }
             }

}




