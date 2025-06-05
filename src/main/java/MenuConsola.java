import productos.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuConsola {

    static ArrayList<Producto> productosAgregados = new ArrayList<>();

    public static void inicializarConsola() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while(continuar) {
            
            System.out.println("=================================== SISTEMA DE GESTIÓN - TECHLAB ==================================");
            System.out.println("1) Agregar Producto");
            System.out.println("2) Listar Productos");
            System.out.println("3) Buscar/Actualizar producto");
            System.out.println("4) Eliminar producto");
            System.out.println("5) Crear un pedido");
            System.out.println("6) Listar pedidos");
            System.out.println("7) Salir");

            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    agregarProductos(scanner);
                    break;
                case 2:
                    listarProductos(scanner);
                    break;
                case 3:
                    buscarProducto(scanner);
                    break;
                case 4:
                    eliminarProducto(scanner);
                    break;
                case 5:
                    crearPedido(scanner);
                    break;
                case 6:
                    listarPedidos(scanner);
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Finalizando Programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }

    public static void agregarProductos(Scanner scanner) {
        separadorDeMenu();
        // Crear Producto:
        System.out.println(">>> Submenu: Agregar Productos");
        System.out.print("Ingrese Nombre de Producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese Precio Producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // prevengo error de lectura del buffer

        System.out.print("Ingrese Stock del Producto: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // prevengo error de lectura del buffer

        Producto producto = new Producto(nombre, precio, stock);
        productosAgregados.add(producto);
        System.out.println("Producto Agregado Correctamente...");
        producto.mostrarProducto();

        System.out.print("Presione Enter para volver...");
        scanner.nextLine(); // espera input
    }

    public static void listarProductos(Scanner scanner) {
        separadorDeMenu();
        System.out.println(">>> Submenu: Lista Productos");
        for(Producto producto : productosAgregados){
            producto.mostrarProducto();
        }
        System.out.print("Presione Enter para volver...");
        scanner.nextLine(); // espera input
    }

    public static void buscarProducto(Scanner scanner) {
        separadorDeMenu();
        System.out.println(">>> Submenu: Buscar Productos");
        System.out.println("Ingrese Nombre o ID del producto a buscar:");
        String nombreProducto = scanner.nextLine();
        ArrayList<Producto> productosEncontrados = new ArrayList<>();
        for(Producto producto: productosAgregados){
            if(producto.contieneNombre(nombreProducto)){
                productosEncontrados.add(producto);
        }
        if(productosEncontrados.isEmpty()){
            System.out.printf("No pudimos encontrar el producto con el nombre: <%s>%n",nombreProducto);
        }else {
            System.out.println("PRODUCTOS ENCONTRADOS:");
            for (Producto prod : productosEncontrados) {
                prod.mostrarProducto();

                System.out.println("Desea modificar el producto?:");
                System.out.println("1) Modificar el Producto");
                System.out.println("2) Regresar al Menu Principal");
                int opcion2 = scanner.nextInt();

                if(opcion2 == 1){
                    modificarProducto(prod);
                } else if (opcion2 == 2) {
                    System.out.println("Regresando al Menu Principal...");
                }
            }

        }
        }

        System.out.print("Presione Enter para volver...");
        scanner.nextLine(); // espera input
    }

    public static  void  modificarProducto(Producto prod){
        System.out.println("QUIERE MODIFICAR EL PRODUCTO NOOOO!");
    }

    public static void eliminarProducto(Scanner scanner) {
        separadorDeMenu();
        System.out.println(">>> Submenu: Eliminar Producto");
        System.out.println("Producto 1");
        System.out.println("Producto 2");
        System.out.print("Presione Enter para volver...");
        scanner.nextLine(); // espera input
    }

    public static void crearPedido(Scanner scanner) {
        separadorDeMenu();
        System.out.println(">>> Submenu: Crear Pedido");
        System.out.println("Producto 1");
        System.out.println("Producto 2");
        System.out.print("Presione Enter para volver...");
        scanner.nextLine(); // espera input
    }

    public static void listarPedidos(Scanner scanner) {
        separadorDeMenu();
        System.out.println(">>> Submenu: Lista de Pedidos");
        System.out.println("Pedido 1");
        System.out.println("Pedido 2");
        System.out.print("Presione Enter para volver...");
        scanner.nextLine(); // espera input
    }


    public static void separadorDeMenu() {
        System.out.println("=============================");
        System.out.println("");

        // Caracteres de escape, no andan en Windows.
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
    }
}
