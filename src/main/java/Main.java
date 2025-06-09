import pedido.Pedido;
import productos.Producto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Producto.resetearId();

        Pedido pedido = new Pedido();

        // PRODUCTOS DE PRUEBA PARA UN PEDIDO:
//        Producto pepino = new Producto("Pepino", 500, 100);
//        Producto tomate = new Producto("Tomate", 2000, 120);
//        Producto lechuga = new Producto("Lechuga", 500, 150);
//
//        pedido.agregarProducto(pepino);
//        pedido.agregarProducto(tomate);
//        pedido.agregarProducto(lechuga);
//        pedido.mostrarPedido();
//        System.out.println("Monto Total: "+ pedido.calcularTotal());

        // INICIALIZO LA CONSOLA ==> MENU
        MenuConsola.inicializarConsola();
    }
}

