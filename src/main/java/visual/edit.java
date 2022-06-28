package visual;

import control.book;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;



public class edit extends javax.swing.JDialog {

    book Book=new book();
    
    public edit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        datepublic = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        est_num = new javax.swing.JTextField();
        est_sec = new javax.swing.JTextField();
        piso = new javax.swing.JTextField();
        edificio = new javax.swing.JTextField();
        sede = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        registrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel1.setText("Editar libro");

        jLabel2.setText("Titulo que desea editar");

        titulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tituloKeyTyped(evt);
            }
        });

        jLabel3.setText("Fecha de publicación");

        jLabel4.setText("Autor");

        jLabel22.setText("Número de estante");

        jLabel33.setText("Sección");

        jLabel44.setText("Piso");

        jLabel55.setText("Edificio");

        jLabel66.setText("Sede");

        autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                autorKeyTyped(evt);
            }
        });

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Alquilado", "Extraviado" }));

        registrar.setText("Actualizar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(registrar)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(datepublic, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(author, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(est_num, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(est_sec, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(piso, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(edificio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sede, javax.swing.GroupLayout.Alignment.LEADING)
                    ))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datepublic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel22)
                .addComponent(est_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel33)
                .addComponent(est_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel44)
                .addComponent(piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel55)
                .addComponent(edificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel66)
                .addComponent(sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGap(18, 18, 18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {
        String Titulo=titulo.getText().trim(); String Autor =author.getText().trim(); int Est_num= Integer.parseInt((String)est_num.getText().trim()); String Est_sec=(String)est_sec.getText().trim(); int Piso= Integer.parseInt(piso.getText().trim()); String Edificio=(String)edificio.getText().trim(); String Sede=(String)sede.getText().trim();
        int Anio= Integer.parseInt((String)datepublic.getText().trim());
        if(Book.valid(Titulo, Autor, Anio, Est_num, Est_sec, Piso, Edificio, Sede)){
            Book.update(Titulo, Autor, Anio, Est_num, Est_sec, Piso, Edificio, Sede);

            titulo.setText("");
            author.setText("");
            datepublic.setText("");
            est_num.setText("");
            est_sec.setText("");
            piso.setText("");
            edificio.setText("");
            sede.setText("");
        } else {
            System.out.println("Error");
            JOptionPane.showMessageDialog(null,"Error, asegurese de rellenar todos los campos.");
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<String> data=Book.buscar();
        String Value=titulo.getText();
        if(data.contains(Value)){
                //obtener la posicion del valor
                int pos=data.indexOf(Value);
                author.setText(data.get(pos+1));
                datepublic.setText(data.get(pos+2));
                est_num.setText(data.get(pos+3));
                est_sec.setText(data.get(pos+4));
                piso.setText(data.get(pos+5));
                edificio.setText(data.get(pos+6));
                sede.setText(data.get(pos+7));
        }
    }

    private void tituloKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
        }
    }

    private void autorKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
        }
    }

    private javax.swing.JTextField autor;
    private javax.swing.JTextField titulo;
    private javax.swing.JTextField author;
    private javax.swing.JTextField anio;
    private javax.swing.JTextField est_num;
    private javax.swing.JTextField est_sec;
    private javax.swing.JTextField piso;
    private javax.swing.JTextField edificio;
    private javax.swing.JTextField sede;
    private javax.swing.JTextField datepublic;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton registrar;
}
