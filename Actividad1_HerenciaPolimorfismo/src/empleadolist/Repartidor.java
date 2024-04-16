package empleadolist;

public class Repartidor extends Empleado{

	private int zona;
    private int repartos;

    public Repartidor(int id, String nombre, int edad, int aniolngreso, double salarioBasico, int zona, int repartos) {
        super(id, nombre, edad, aniolngreso, salarioBasico);
        comprobarZona(zona);
        this.repartos = repartos;
    }

    private void comprobarZona(int zona) {
        if (zona < 1 || zona > 5) {
            this.zona = 1;
        } else {
            this.zona = zona;
        }
    }

    @Override
    public String toString() {
        return "Repartidor: " +
        		"(zona=" + zona +
                ", repartos=" + repartos +
                ") " + super.toString();
    }
}
