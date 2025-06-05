package pedido;
import productos.Producto;
import java.util.ArrayList;



public class Pedido {
    private ArrayList<Producto> pedidos;

    public Pedido() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        pedidos.add(producto);
    }

    public void mostrarPedido(){
        for(Producto producto: pedidos){
            producto.mostrarProducto();
        }
    }
    
}