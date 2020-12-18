package examen2_sahorycano;


import java.io.Serializable;


public class ORDEN implements Serializable {
     private static final long SerialVersionUID = 8989L;
    private int piezas, biscuit, pure, papas, fresco, pie;
    private int numero;

    public ORDEN(int piezas, int biscuit, int pure, int papas, int fresco, int pie, int numero) {
        this.piezas = piezas;
        this.biscuit = biscuit;
        this.pure = pure;
        this.papas = papas;
        this.fresco = fresco;
        this.pie = pie;
        this.numero = numero;
    }

    public ORDEN() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ORDEN(int piezas, int biscuit, int pure, int papas, int fresco, int pie) {
        this.piezas = piezas;
        this.biscuit = biscuit;
        this.pure = pure;
        this.papas = papas;
        this.fresco = fresco;
        this.pie = pie;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public int getBiscuit() {
        return biscuit;
    }

    public void setBiscuit(int biscuit) {
        this.biscuit = biscuit;
    }

    public int getPure() {
        return pure;
    }

    public void setPure(int pure) {
        this.pure = pure;
    }

    public int getPapas() {
        return papas;
    }

    public void setPapas(int papas) {
        this.papas = papas;
    }

    public int getFresco() {
        return fresco;
    }

    public void setFresco(int fresco) {
        this.fresco = fresco;
    }

    public int getPie() {
        return pie;
    }

    public void setPie(int pie) {
        this.pie = pie;
    }

    @Override
    public String toString() {
        return "Ordenes{" + "piezas=" + piezas + ", biscuit=" + biscuit + ", pure=" + pure + ", papas=" + papas + ", fresco=" + fresco + ", pie=" + pie + '}';
    }

}
