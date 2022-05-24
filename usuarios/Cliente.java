package cafeteria.usuarios;

import java.util.ArrayList;
import cafeteria.usuarios.pagos.Pago;

public class Cliente {
    private int idCliente;
    private String nombre;
    private int telefono;
    private String correo;
    private ArrayList<Pago> metodoPago = new ArrayList<Pago>();
    public Cliente(int idCliente, String nombre, int telefono, String correo){
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdCliente(){
        return this.idCliente;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public String getCorreo(){
        return this.correo;
    }

}
