package pedido;
import productos.Producto;
import java.util.ArrayList;



public class Pedido {
    private int idPedido = 0;
    private ArrayList<Producto> pedidos;

    public Pedido() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        pedidos.add(producto);
    }
    public double calcularTotal(){
        double montoTotal = 0;
        for(Producto prod : pedidos){
            montoTotal += prod.getPrecio();
        }
        return montoTotal;
    }

    public void mostrarPedido(){
        for(Producto producto: pedidos){
            producto.mostrarProducto();
        }
    }
    
}