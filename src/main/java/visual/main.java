package visual;

import javax.swing.JOptionPane;



public class main extends javax.swing.JFrame {
    public int aux;

    public main(int aux) {
        this.aux=aux;
        if(aux==1){
            add dialog = new add(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
        }else{if(aux==2){
            edit dialog = new edit(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
        }else{if(aux==3){
            eliminar dialog = new eliminar(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
        }}
    }
}}
