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

    private float total;
    private ArrayList<ORDEN> lista = new ArrayList();

    public CLIENTE() {
    }

    public CLIENTE(String nombre, String apellido, float total) {
        this.nombres = nombre;
        this.apellidos = apellido;

        this.total = total;
    }

    public CLIENTE(String nombre, String apellido, int edad) {
        this.nombres = nombre;
        this.apellidos = apellido;

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
