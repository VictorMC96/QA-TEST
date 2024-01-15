package parte02.ejercicio02;

public class CuentaBancariaDTO {

    String numeroCuenta;
    String numeroTarjeta;
    String beneficiario;
    double saldo;

    public CuentaBancariaDTO() {
    }

    public CuentaBancariaDTO(String numeroCuenta, String numeroTarjeta, String beneficiario, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.numeroTarjeta = numeroTarjeta;
        this.beneficiario = beneficiario;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        this.saldo = this.saldo + deposito;
    }

    public void retirar(double retiro){
        this.saldo = this.saldo - retiro;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta=" + numeroCuenta +
                ", numeroTarjeta=" + numeroTarjeta +
                ", beneficiario=" + beneficiario +
                ", saldo=" + saldo +
                '}';
    }



}




