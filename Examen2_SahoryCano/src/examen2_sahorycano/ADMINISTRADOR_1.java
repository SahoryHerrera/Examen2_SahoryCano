package examen2_sahorycano;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ADMINISTRADOR_1 {
       private ArrayList<CLIENTE> lista = new ArrayList();
    private File archivo = null;
    public ADMINISTRADOR_1(String path) {
        archivo = new File(path);
    }

    public void setclie(CLIENTE a) {
        lista.add(a);
    }

    public ArrayList<CLIENTE> getLista() {
        return lista;
    }

    public void setLista(ArrayList<CLIENTE> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ADMINISTRADOR_1() {
    }

    @Override
    public String toString() {
        return "adminbinario{" + "lista=" + lista + ", archivo=" + archivo + '}';
    }
     public void cargarArchivo() {
        try {
            lista = new ArrayList();
           CLIENTE temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (CLIENTE) objeto.readObject()) != null) {
                        lista.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (CLIENTE t : lista) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
