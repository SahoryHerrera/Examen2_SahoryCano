package examen2_sahorycano;


import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Hilo extends Thread {

    private JProgressBar progBar;
    private boolean avanzar;
    private CLIENTE e;
    private JTable tabla1;

    public Hilo() {
    }

    public Hilo(JProgressBar progBar, JTable tabla1) {
        this.progBar = progBar;
        this.tabla1 = tabla1;
    }

    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = true;
    }

    public CLIENTE getE() {
        return e;
    }

    public void setE(CLIENTE e) {
        this.e = e;
    }

    public JTable getTabla1() {
        return tabla1;
    }

    public void setTabla1(JTable tabla1) {
        this.tabla1 = tabla1;
    }

    @Override
    public String toString() {
        return "Hilo{" + "progBar=" + progBar + ", avanzar=" + avanzar + ", e=" + e + ", tabla1=" + tabla1 + '}';
    }

    @Override
    public void run() {

        while (true) {
            if (avanzar) {
                progBar.setMaximum(10);
                progBar.setValue(progBar.getValue() + 10);
                //activar y modificar propiedad stringPainted para que esto funciones

                //if (progBar.getValue() == 1) {
                    
                        String num = "";
                        String elem1 = "";
                        String elem2 = "";
                        String elem3 = "";
                        String elem4 = "";
                        String elem5 = "";
                        String elem6 = "";
                        String tiempo = "";
                        String piez = "", bis = "", pu = "", papas = "", refre = "", pie = "";

                        for (int i = 0; i < e.getHistorial().size(); i++) {
                            piez = e.getHistorial().get(i).getPiezas() + " Minutos";
                            bis = e.getHistorial().get(i).getBiscuit() + " Minuto";
                            pu = e.getHistorial().get(i).getPure() + " Minutos";
                            papas = e.getHistorial().get(i).getPapas() + " Minutos";
                            refre = e.getHistorial().get(i).getFresco() + " Minuto";
                            pie = e.getHistorial().get(i).getPie() + "  Minutos";
                            num = "Numero:  " + e.getHistorial().get(i).getNumero() + "";
                            elem1 = "Piezas: " + e.getHistorial().get(i).getPiezas() + "";
                            elem2 = "Biscuits: " + e.getHistorial().get(i).getBiscuit() + "";
                            elem3 = "Pure: " + e.getHistorial().get(i).getPure() + "";
                            elem4 = "Papas: " + e.getHistorial().get(i).getPapas() + "";
                            elem5 = "Frescos: " + e.getHistorial().get(i).getFresco() + "";
                            elem5 = "Pie: " + e.getHistorial().get(i).getPie() + "";
                        }
                        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
                        Object newRow[] = {
                            num, elem1, piez};
                        Object newRow2[] = {
                            num, elem2, bis};
                        Object newRow3[] = {
                            num, elem3, pu};
                        Object newRow4[] = {
                            num, elem4, papas};
                        Object newRow5[] = {
                            num, elem5, refre};
                        Object newRow6[] = {
                            num, elem6, pie};

                        modelo.addRow(newRow);
                        modelo.addRow(newRow2);
                        modelo.addRow(newRow3);
                        modelo.addRow(newRow4);
                        modelo.addRow(newRow5);
                        modelo.addRow(newRow6);

                        tabla1.setModel(modelo);

                    
               // }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }

    }

}
