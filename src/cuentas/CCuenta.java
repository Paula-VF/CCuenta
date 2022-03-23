package cuentas;

/**
 * Clase que crea objetos CCuenta
 * 
 * @author paula
 */
public class CCuenta {

    /**
     * @return el nombre del propietario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la cuenta, el numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta la cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo, el dinero que hay en la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés el tipoInterés a establecer
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /** Atributos*/
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Metodo constructor sin parametros*/
    public CCuenta()
    {
    }

    /** Metodo constructor con parametro
     * @param nom
     * @param cue
     * @param sal
     * @param tipo*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /** Metodo para saber la cantidad de dinero del que disponemos en la cuenta
     * @return dinero disponible*/
    public double estado()
    {
        return getSaldo();
    }

    /** Metodo para meter dinero en la cuent
     * @param cantidad
     * @throws java.lang.Exception*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /** Metodo para sacar dinero de la cuent
     * @param cantidad
     * @throws java.lang.Exception*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
