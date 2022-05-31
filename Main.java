package cafeteria;

import java.util.ArrayList;
import cafeteria.usuarios.*;
import cafeteria.contenidos.*;
import cafeteria.contenidos.items.Alimentos;
import cafeteria.orden.Orden;
import cafeteria.usuarios.pagos.*;

public class Main{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Juan", 12345678, "juan@mail.com");
        Empleado empleado1 = new Empleado("Pedro", 1, 1000.0);

        cliente1.metodoPago.add(new Efectivo(500.0));
        System.out.println(cliente1.metodoPago.get(0).getSaldo());

        Orden orden1 = new Orden(1, empleado1, cliente1);
        Alimentos sandwich = new Alimentos("pollo", "Sandwich de pollo", 200.0);
        orden1.agregarProducto(sandwich);
        cliente1.metodoPago.get(0).cobrar(orden1.total());
        System.out.println("El total es de :" + orden1.total());
        System.out.println("Saldo restante: " + cliente1.metodoPago.get(0).getSaldo());
    }
}