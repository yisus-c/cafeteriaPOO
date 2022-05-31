package cafeteria.contenidos.items.cafes;
import cafeteria.contenidos.items.Cafe;

public class Expresso extends Cafe {
    public Expresso(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }

    public void preparar() {
        System.out.println("Preparando el cafe expresso");
    }
}
