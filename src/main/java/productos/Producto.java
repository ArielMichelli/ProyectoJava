package productos;

import java.util.ArrayList;

public class Producto {
    private static int contadorId = 1;
    private int id = 0;
    private String nombre;
    private double precio;
    private int cantidad;

    private ArrayList<Producto> productos;

    public static void resetearId(){
        contadorId = 1;
    }

    public void productos(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    void descontarStock(){
        System.out.println("Descontando Stock");
    }
    public void mostrarProducto(){
        System.out.println("id-"+this.id+" | "+"Nombre: " + this.nombre +" | "+"Precio: $" + this.precio+ " | "+"Stock: " + this.cantidad  );
    }
    public  void  mostrarTodosLosProductos(){
        for(Producto producto: productos){
            producto.mostrarProducto();
        }
    }

}
