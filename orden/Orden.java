package cafeteria.orden;
import cafeteria.usuarios.*;
import cafeteria.contenidos.*;
import java.util.ArrayList;

public class Orden {
    private int id;
    private Empleado empleado;
    private Cliente cliente;
    private ArrayList<Item> productos = new ArrayList<Item>();
    public Orden(int id, Empleado empleado, Cliente cliente){
        this.id = id;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    public Empleado getEmpleado(){
        return this.empleado;
    }
    public Cliente getCliente (){
        return this.cliente;
    }
    public int getId(){
        return this.id;
    }

    public void agregarProducto (Item producto){
        productos.add(producto);
    }
    public double total (){
        double total = 0;
        for (Item item : productos) {
            total += item.getPrecio();
        }
        return total;
    }
}
