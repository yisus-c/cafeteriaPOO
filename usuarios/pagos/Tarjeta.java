package cafeteria.usuarios.pagos;

public class Tarjeta {
    private double saldo;
    private int numero;
    private int cvv;
    private String vencimiento;
    public Tarjeta(double saldo, int numero, int cvv, String vencimiento){
        this.saldo = saldo;
        this.numero = numero;
        this.cvv = cvv;
        this.vencimiento = vencimiento;
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
