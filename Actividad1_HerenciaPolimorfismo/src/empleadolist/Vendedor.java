/**
 * 
 */
package empleadolist;

/**
 * 
 */
public class Vendedor extends Empleado{

	private double comision;
    private double ventas;

    public Vendedor(int id, String nombre, int edad, int anioIngreso, double salarioBasico, double ventas) {
        super(id, nombre, edad, anioIngreso, salarioBasico);
        this.ventas = ventas;
        calcularComision();
    }

    public void calcularComision() {
        comision = ventas * 0.15;
    }

    public double getComision() {
        return comision;
    }

    @Override
    public String toString() {
        return "Vendedor: " + 
        		"(comision=" + comision +
                ", ventas=" + ventas +
                ") " + super.toString();
    }
}
