package cafeteria.contenidos.items.cafes;
import cafeteria.contenidos.items.Cafe;

public class Capuccino extends Cafe {
    public Capuccino(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }

    public void preparar() {
        System.out.println("Preparando el cafe capuccino");
    }

}
    