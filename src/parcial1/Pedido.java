// Autor: Santiago Palencia
// Tema: Parcial 1 Restaurante

package parcial1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido de ").append(cliente.getNombre()).append(":\n");
        for (Producto producto : productos) {
            sb.append("- ").append(producto.toString()).append("\n");
        }
        sb.append("Total a pagar: $").append(calcularTotal());
        return sb.toString();
    }
}