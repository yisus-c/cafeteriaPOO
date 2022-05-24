package cafeteria.usuarios.pagos;

public interface Pago {
    
    public double getSaldo();
    public void cobrar(double monto);
    public void setSaldo(double ingreso);
}
