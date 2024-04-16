/**
 * 
 */
package productosList;

/**
 * 
 */
public class NoPerecedero extends Producto {

    private int tipo;

    public NoPerecedero(int codigo, String descripcion, double precio, int tipo) {
        super(codigo, descripcion, precio);
        comprobarTipo(tipo);
    }

    @Override
    public double calcularPrecioVenta() {
        if (tipo == 1) {
            return precio + (precio * 0.03);
        } else if (tipo == 2) {
            return precio + (precio * 0.02);
        } else if (tipo == 3) {
            return precio + (precio * 0.01);
        } else {
            return precio;
        }
    }   

    private void comprobarTipo(int tipo) {
        if (tipo < 1 || tipo > 3) {
            this.tipo = 1;
        } else {
            this.tipo = tipo;
        }
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "NoPerecedero: " +
        		super.toString() +
                " tipo=" + tipo + 
                ")";
    }
}

