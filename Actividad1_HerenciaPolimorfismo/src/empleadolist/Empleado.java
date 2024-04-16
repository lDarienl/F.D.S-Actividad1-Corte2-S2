/**
 * 
 */
package empleadolist;

/**
 * 
 */
public class Empleado {

	protected int id;
	protected String nombre;
	protected int edad;
	protected int aniolngreso;
	protected double salarioBasico;

    Empleado(int id, String nombre, int edad, int aniolngreso, double salarioBasico) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.aniolngreso = aniolngreso;
        this.salarioBasico = salarioBasico;
    }

    @Override
    public String toString() {
        return "\nDatos(" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", aniolngreso=" + aniolngreso +
                ", salarioBasico=" + salarioBasico +
                ')';
    }

	public int getId() {
		return id;
	}
     
}
