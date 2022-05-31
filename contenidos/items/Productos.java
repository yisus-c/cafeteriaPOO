package cafeteria.contenidos.items;
import cafeteria.contenidos.Item;

public class Productos implements Item {
    private String nombre;
    private String descripcion;
    private double precio;

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
