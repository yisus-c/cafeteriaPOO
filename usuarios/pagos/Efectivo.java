package cafeteria.usuarios.pagos;

public class Efectivo implements Pago {
    private double saldo;
    public Efectivo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double ingreso){
        this.saldo = this.saldo + ingreso;
    }
    public void cobrar(double monto){
        this.saldo = this.saldo - monto;
    }
}
