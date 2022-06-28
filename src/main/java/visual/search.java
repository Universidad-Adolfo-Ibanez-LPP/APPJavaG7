package visual;

import com.mycompany.APP2G7.Root;
import control.book;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;



public final class search extends javax.swing.JDialog {
    Root r=new Root();
    book Book=new book();

    public search(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setv();  
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchvalue = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        title = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel1.setText("Buscar libro");

        res.setEditable(false);
        res.setColumns(20);
        res.setFont(new java.awt.Font("Century Gothic", 0, 14));
        res.setRows(5);
        res.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(res);

        jButton2.setText("CERRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar por titulos disponibles");

        jLabel3.setText("Buscar por titulo especifico");

        searchvalue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchvalueKeyTyped(evt);
            }
        });

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ArrayList<String> lista =Book.buscar();
        ArrayList<String> tit=new ArrayList<String>();
        for(int i=0; i<lista.size();i+=8){
            if (i%8==0) {
                if (lista.get(i).length()>20) {
                    tit.add(lista.get(i).substring(0, 20)+"...");
                }else {
                    tit.add(lista.get(i));
                }
            }
        }
        title.setModel(new javax.swing.DefaultComboBoxModel<>(new Vector<String>(tit)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(title, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(25, 25, 25))
        );

        pack();
    }
    
    public void setv(){
        r.setdata(res);  
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        String Value=searchvalue.getText().trim();
        if (Value.contains("...")){
            Value=Value.substring(0, Value.length()-3);
        }
        if (!Value.isEmpty()){
            ArrayList<String> book = Book.buscar();
            if(book.contains(Value)){
                //obtener la posicion del valor
                int pos=book.indexOf(Value);
                //Asignar los valores en orden del libro en la lista resultado
                String ret="Titulo: "+book.get(pos)+"\nAutor: "+book.get(pos+1)+"\nAño: "+book.get(pos+2)+"\nEstante: "+book.get(pos+3) +"\nSección: "+book.get(pos+4) + "\nPiso: "+book.get(pos+5) + "\nEdificio: "+book.get(pos+6) + "\nSede: "+book.get(pos+7);
                res.setText(ret);
            }
            else
                res.setText("Libro no encontrado :(\nIntenta escribir bien el Titulo.");
            }else{
            JOptionPane.showMessageDialog(null,"Debe ingresar un titulo para buscar.");
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        String Value=(String)title.getSelectedItem();
        ArrayList<String> book = Book.buscar();
        assert Value != null;
        if (Value.contains("...")){
            Value=Value.substring(0, Value.length()-3);
        }
        for (int i = 0; i < book.size(); i+=8) {
            if (book.get(i).contains(Value)){
                String ret="Titulo: "+book.get(i)+"\nAutor: "+book.get(i+1)+"\nAño: "+book.get(i+2)+"\nEstante: "+book.get(i+3) +"\nSección: "+book.get(i+4) + "\nPiso: "+book.get(i+5) + "\nEdificio: "+book.get(i+6) + "\nSede: "+book.get(i+7);
                res.setText(ret);
                break;
            } else {
                res.setText("Libro no encontrado :(\nIntenta escribir bien el Titulo.");
            }
        }
    }

    private void searchvalueKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
        }
    }

    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea res;
    private javax.swing.JTextField searchvalue;
    private javax.swing.JComboBox<String> title;
}
