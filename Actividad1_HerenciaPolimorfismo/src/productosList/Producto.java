/**
 * 
 */
package productosList;

/**
 * 
 */
public abstract class Producto {
	
	protected int codigo;
	protected String descripcion;
	protected double precio;
	
	public Producto(int codigo, String descripcion, double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	//Metodo abstracto que se usara en las subclases
	public abstract double calcularPrecioVenta();
	
	// get que se necesitara para imprimir los datos
	public int getCodigo() {
        return codigo;
    }

	@Override
	public String toString() {
	    return "(codigo=" + codigo + 
	            ", descripcion=" + descripcion + 
	            ", precio=$" + precio + 
	            ",";
	}
	
}
