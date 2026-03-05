package gestioncuentas;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta() {
        setSaldo(0);
    }

    /**
     *
     */
    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    /**
     * EL ejerciocio sirve para bla bla bla
     * @param cantidad {double} cantidad de dinero a retirar
     * @return {boolean} true si la cantiad a retirar es menor que el saldo actual
     */
    public boolean retirarConControl(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            return true;
        } else {
            return false;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
