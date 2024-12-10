/*
*Autor: Santiago Palencia
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parcial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pedido> pedidos = new ArrayList<>(); // Para guardar los pedidos

        // Menú principal
        while (true) {
            // ... (mostrar menú y leer opción)

            switch (opcion) {
                case 1:
                    // Crear un nuevo pedido
                    Cliente cliente = crearCliente(scanner);
                    Pedido pedido = new Pedido(cliente);
                    pedidos.add(pedido);
                    break;
                case 2:
                    // Agregar productos a un pedido
                    pedido = seleccionarPedido(pedidos, scanner);
                    if (pedido != null) {
                        agregarProductos(pedido, scanner);
                    }
                    break;
                case 3:
                    // Pagar un pedido
                    pedido = seleccionarPedido(pedidos, scanner);
                    if (pedido != null && autenticarUsuario(scanner)) {
                        pedido.pagar();
                    }
                    break;
                // ... otros casos
            }
        }
    }

    // Métodos auxiliares para crear cliente, seleccionar pedido, agregar productos, etc.
    private static Cliente crearCliente(Scanner scanner) {
        // ...
    }

    private static Pedido seleccionarPedido(List<Pedido> pedidos, Scanner scanner) {
        // ...
    }

    private static void agregarProductos(Pedido pedido, Scanner scanner) {
        // ...
    }

