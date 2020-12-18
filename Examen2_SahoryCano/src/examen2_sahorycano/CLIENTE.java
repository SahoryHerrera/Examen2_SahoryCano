package examen2_sahorycano;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


 
public class CLIENTE implements Serializable {

    private static final long SerialVersionUID = 8989L;
    private String nombre;
    private String apellido;
    private int edad;
    private float tarjeta;
    private float total;
    private ArrayList<ORDEN> lista = new ArrayList();

    public CLIENTE() {
    }

    public CLIENTE(String nombre, String apellido, int edad, float tarjeta, float total) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tarjeta = tarjeta;
        this.total = total;
    }

    public CLIENTE(String nombre, String apellido, int edad, float tarjeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tarjeta = tarjeta;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(float tarjeta) {
        this.tarjeta = tarjeta;
    }

    public ArrayList<ORDEN> getHistorial() {
        return lista;
    }

    public void setHistorial(ArrayList<ORDEN> historial) {
        this.lista = historial;
    }

    @Override
    public String toString() {
        return nombre;
    }
  

}
