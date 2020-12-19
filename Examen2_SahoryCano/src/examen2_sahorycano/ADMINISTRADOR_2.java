package examen2_sahorycano;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class ADMINISTRADOR_2 {

    private File archivo = null;
    private ArrayList<CLIENTE> lista = new ArrayList();

    public ADMINISTRADOR_2(String path) {
        archivo = new File(path);
    }

    public void setClie(CLIENTE u) {
        this.lista.add(u);
    }

    public ADMINISTRADOR_2() {
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<CLIENTE> getLista() {
        return lista;
    }

    public void setLista(ArrayList<CLIENTE> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "admintxt{" + "archivo=" + archivo + ", lista=" + lista + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (CLIENTE t : lista) {
                for (int i = 0; i < t.getHistorial().size(); i++) {
                    Date fecha = new Date();
                    bw.write("Orden: " + t.getHistorial().get(i).getNumero() + ";");
                    bw.newLine();
                    bw.write("Fecha: " + fecha.getDay()+ ";");
                    bw.newLine();
                    bw.write("Nombre: " + t.getNombre() + ";");
                    bw.newLine();
                    bw.write("Apellido: " + t.getApellido() + ";");
                    bw.newLine();
                    bw.write("Total Complementos: " + t.getTotal() + ";");
                    bw.newLine();
                    bw.write("Piezas: " + t.getHistorial().get(i).getPiezas() + ";");
                    bw.newLine();
                    bw.write("Papas: " + t.getHistorial().get(i).getPapas() + ";");
                    bw.newLine();
                    bw.write("Frescos: " + t.getHistorial().get(i).getFresco() + ";");
                    bw.newLine();
                    bw.write("Pures: " + t.getHistorial().get(i).getPure() + ";");
                    bw.newLine();
                    bw.write("Pies: " + t.getHistorial().get(i).getPie() + ";");
                    bw.newLine();
                }

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    lista.add(new CLIENTE(sc.next(), sc.next(), sc.nextInt())
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
