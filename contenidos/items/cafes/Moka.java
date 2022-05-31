package cafeteria.contenidos.items.cafes;
import cafeteria.contenidos.items.Cafe;

public class Moka extends Cafe {
    public Moka(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }
    public void preparar() {
        System.out.println("Preparando el cafe moka");
    }
}
