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
    private String nombres;
    private String apellidos;
    private int edad;
    private float ID;
    private float total;
    private ArrayList<ORDEN> lista = new ArrayList();

    public CLIENTE() {
    }

    public CLIENTE(String nombre, String apellido, int edad, float Id, float total) {
        this.nombres = nombre;
        this.apellidos = apellido;
        this.edad = edad;
        this.ID = Id;
        this.total = total;
    }

    public CLIENTE(String nombre, String apellido, int edad, float Id) {
        this.nombres = nombre;
        this.apellidos = apellido;
        this.edad = edad;
        this.ID = Id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public String getApellido() {
        return apellidos;
    }

    public void setApellido(String apellido) {
        this.apellidos = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getTarjeta() {
        return ID;
    }

    public void setTarjeta(float tarjeta) {
        this.ID = tarjeta;
    }

    public ArrayList<ORDEN> getHistorial() {
        return lista;
    }

    public void setHistorial(ArrayList<ORDEN> historial) {
        this.lista = historial;
    }

    @Override
    public String toString() {
        return nombres;
    }
  

}
