import pedido.Pedido;
import productos.Producto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Producto.resetearId();

        Pedido pedido = new Pedido();

        // PRODUCTOS DE PRUEBA:
        Producto pepino = new Producto("Pepino", 750, 100);
        Producto tomate = new Producto("Tomate", 2000, 120);
        Producto lechuga = new Producto("Lechuga", 2500, 150);

        pedido.agregarProducto(pepino);
        pedido.agregarProducto(tomate);
        pedido.agregarProducto(lechuga);

        // INICIALIZO LA CONSOLA ==> MENU
        MenuConsola.inicializarConsola();
    }
}

