/**
 * 
 */
package productosList;

/**
 * 
 */
public class Perecedero extends Producto{

	private int diasCaducar;

	public Perecedero(int codigo, String descripcion, double precio, int diasCaducar) {
		super(codigo, descripcion, precio);
		this.diasCaducar = diasCaducar;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecioVenta() {
        if (diasCaducar == 1) {
            return precio * 0.25;
        } else if (diasCaducar == 2) {
            return precio * 0.33;
        } else if (diasCaducar == 3) {
            return precio * 0.5;
        } else {
            return precio;
        }
    }

	@Override
	public String toString() {
		return "Perecedero " +
				super.toString()
				+ " diasCaducar=" + diasCaducar 
				+ ")";
	}

}
