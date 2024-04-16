/**
 * 
 */
package productosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class AppTienda {

	private List<Producto> productos = new ArrayList<>();

    public void crearProductos() {
    	/** Crear objetos Perecederos y agregarlos a la lista
    	 * Los parametros para crear la lista son:
    	 * codigo, descripcion, precio y dias a caducar
    	 */
        productos.add(new Perecedero(101, "Leche", 2.5, 2));
        productos.add(new Perecedero(102, "Carne", 7.0, 1));
        productos.add(new Perecedero(103, "Pan", 1.0, 3));

    	/** Crear objetos No Perecederos y agregarlos a la lista
    	 * Los parametros para crear la lista son:
    	 * codigo, descripcion, precio y tipo
    	 */
        productos.add(new NoPerecedero(201, "Arroz", 3.0, 2));
        productos.add(new NoPerecedero(202, "Aceite", 5.0, 0));
        productos.add(new NoPerecedero(203, "Sal", 0.5, 3));
    }

    public void venderProductos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código del producto a vender:");
        int codigo = scanner.nextInt();
        boolean encontrado = false;

        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                encontrado = true;
                System.out.println("Producto encontrado:");
                System.out.println(producto);
                System.out.println("Ingrese la cantidad a comprar:");
                int cantidad = scanner.nextInt();
                double precioTotal = producto.calcularPrecioVenta() * cantidad;
                System.out.println("El valor total a pagar es: $" + precioTotal);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no existe.");
        }
        scanner.close();
    }

    public void listaProductos() {
        System.out.println("Lista de productos:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static void main(String[] args) {
        AppTienda tienda = new AppTienda();
        tienda.crearProductos();
        tienda.listaProductos();
        tienda.venderProductos();
    }
    
    
}
