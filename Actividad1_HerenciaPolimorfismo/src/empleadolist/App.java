/**
 * 
 */
package empleadolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class App {
	
	List<Empleado> empleados;

	App() {
	    empleados = new ArrayList<>();
	    empleados();
	}

    void empleados() {
    	/** Crear objetos Vendedor y agregarlos a la lista
    	 * Los parametros para crear la lista son:
    	 * id, nombre, edad, anioIngreso, Salario Basico, ventas
    	 */
    	empleados.add(new Vendedor(1, "Juan", 30, 2010, 1000.0, 5000.0));
    	empleados.add(new Vendedor(2, "Maria", 25, 2015, 1200.0, 7000.0));
    	empleados.add(new Vendedor(3, "Pedro", 35, 2005, 1100.0, 6000.0));

        /** Crear objetos Vendedor y agregarlos a la lista
    	 * Los parametros para crear la lista son:
    	 * id, nombre, edad, anioIngreso, Salario Basico, zona, repartos
    	 */
        empleados.add(new Repartidor(4, "Luis", 28, 2012, 1000.0, 3, 50));
        empleados.add(new Repartidor(5, "Ana", 40, 2008, 1100.0, 6, 70));
        empleados.add(new Repartidor(6, "Sofia", 33, 2006, 1050.0, 2, 60));
    }
    
    public void buscarEmpleado(int id) {
        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                encontrado = true;
                if (empleado instanceof Vendedor) {
                    System.out.println("El empleado es un");
                } else if (empleado instanceof Repartidor) {
                    System.out.println("El empleado es un");
                }
                System.out.println(empleado);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Empleado no existe");
        }
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            if (empleado instanceof Vendedor) {
                System.out.println(empleado);
            } else if (empleado instanceof Repartidor) {
                System.out.println(empleado);
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una opción
        System.out.println("Ingrese una opción:");
        System.out.println("1. Buscar Empleado");
        System.out.println("2. Lista de empleados");
        int opcion = scanner.nextInt();

        // Llamar al método correspondiente de la opción elegida
        if (opcion == 1) {
            System.out.print("Ingrese el código del empleado: ");
            int codigo = scanner.nextInt();
            app.buscarEmpleado(codigo);
        } else if (opcion == 2) {
            app.mostrarEmpleados();
        }

        scanner.close();
    }

}
