/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicolombo.pb20232.ventanas;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Maldonado
 */
public class Femenino extends javax.swing.JFrame {
 Random random = new Random();
 
   public DefaultTableModel modelo;
    /**
     * Creates new form Femenino
     */
    public Femenino() {
        initComponents();
         modelo= new DefaultTableModel();
        modelo.addColumn("Nombre del equipo ");
        modelo.addColumn("Sedes");
        modelo.addColumn("Tipo de juego ");
        modelo.addColumn("Propietario");
        modelo.addColumn("PJ");
        modelo.addColumn("PG");
        modelo.addColumn("PP");
        modelo.addColumn("P");
       
        agregarEquipo("Rusia","Mosku","Femenino","Yuri Marichev");
        agregarEquipo2("Japon","Tokio","Femenino","Hirofumi Daimatsu");       
        agregarEquipo3("Argentina","Buenos Aires","Femenino","Goku");
        agregarEquipo4("Polonia","nidea","Femenino","un tal leon");
        agregarEquipo5("Estados Unidos","Washintong","Femenino","besto armador");
        
         
        
        
       
        
        
        
        
        this.tabla.setModel(modelo);
    }
    private void agregarEquipo(String nombreEquipo1, String sedeequipo1, String masculino, String propietario) {
        Object[] fila = {nombreEquipo1,sedeequipo1,masculino,propietario,0, 0, 0, 0};
        modelo.addRow(fila);
    }

private void agregarEquipo2(String nombreEquipo1, String sedeequipo1, String masculino, String yuri_Marichev) {
        Object[] fila = {nombreEquipo1,sedeequipo1,masculino,yuri_Marichev,0, 0, 0, 0};
        modelo.addRow(fila);
    }
private void agregarEquipo3(String nombreEquipo, String sedeequipo, String masculino, String propietario) {
        Object[] fila = {nombreEquipo,sedeequipo,masculino,propietario,0, 0, 0, 0};
        modelo.addRow(fila);
    }
private void agregarEquipo4(String nombreEquipo, String sedeequipo, String masculino, String propietario) {
        Object[] fila = {nombreEquipo,sedeequipo,masculino,propietario,0, 0, 0, 0};
        modelo.addRow(fila);
    }
private void agregarEquipo5(String nombreEquipo, String sedeequipo, String masculino, String propietario) {
        Object[] fila = {nombreEquipo,sedeequipo,masculino,propietario,0, 0, 0, 0};
        modelo.addRow(fila);
    }
private void agregarEquipo6() {
        Object[] fila = {nombredelequipo.getText(),sede.getText(),tipodejuego.getSelectedItem(),propietario.getText(),0, 0, 0, 0};
        modelo.addRow(fila);
    }

private void sumarPartidoJugado() {
    
    
      //------------------------------------------------------------------------------------------------------------------------------
        
      // partidos jugados
      
      
      
      
      
      int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            int partidosJugados = (int) modelo.getValueAt(i, 4);
            modelo.setValueAt(partidosJugados + 1, i, 4);
        }//Cuando se presiona jugar a los partidos jugados se les suma uno
      
       
          //------------------------------------------------------------------------------------------------------------------------------
          
          
          // partidos ganados y perdidos
          
          
          
          
          
         int filas1 = modelo.getRowCount();
        for (int i = 0; i < filas1; i++) {
            double numeroaleatorio = random.nextDouble();
           if(numeroaleatorio < 0.5){
            int partidosGanados = (int) modelo.getValueAt(i, 5);
            modelo.setValueAt(partidosGanados+ 1, i, 5);
           } else {
                int partidosGanados = (int) modelo.getValueAt(i, 6);
                modelo.setValueAt(partidosGanados+ 1, i, 6);
           }
        }// Cuando se presiona jugar hay un 50% de probabilidad de que gane un partido
        
        //------------------------------------------------------------------------------------------------------------------------------
        
       
        
        
        
        
        
        
        
        
        //Sistema de puntos
        
        
          for (int i = 0; i < filas1; i++) {
            int partidosGanados = (int) modelo.getValueAt(0, 5);
           if( partidosGanados == 1 || partidosGanados == 2 || partidosGanados == 10 || partidosGanados == 3 || partidosGanados == 4 || partidosGanados == 5 || partidosGanados == 6 || partidosGanados == 7 || partidosGanados == 8 || partidosGanados == 9  ){
            modelo.setValueAt(partidosGanados + 3, 0, 7);// hago que le sume puntos a la columna de puntos
           }
        }
           for (int i = 0; i < filas1; i++) {
            int partidosGanados = (int) modelo.getValueAt(1, 5);
           if( partidosGanados == 1 || partidosGanados == 2 || partidosGanados == 3 || partidosGanados == 4 || partidosGanados == 5 || partidosGanados == 6 || partidosGanados == 7 || partidosGanados == 8 || partidosGanados == 9 || partidosGanados == 10  ){
            modelo.setValueAt(partidosGanados + 3, 1, 7);
           }
        }
            for (int i = 0; i < filas1; i++) {
            int partidosGanados = (int) modelo.getValueAt(2, 5);
           if(  partidosGanados == 1 || partidosGanados == 2 || partidosGanados == 3 || partidosGanados == 4 || partidosGanados == 5 || partidosGanados == 6 || partidosGanados == 7 || partidosGanados == 8 || partidosGanados == 9 || partidosGanados == 10  ){
            modelo.setValueAt(partidosGanados + 3, 2, 7);// hago que le sume puntos a la columna de puntos
           }
        }
             for (int i = 0; i < filas1; i++) {
            int partidosGanados = (int) modelo.getValueAt(3, 5);
           if( partidosGanados == 1 || partidosGanados == 2 || partidosGanados == 3 || partidosGanados == 4 || partidosGanados == 5 || partidosGanados == 6 || partidosGanados == 7 || partidosGanados == 8 || partidosGanados == 9 || partidosGanados == 10 ){
            modelo.setValueAt(partidosGanados + 3, 3, 7);// hago que le sume puntos a la columna de puntos
           }
        }
              for (int i = 0; i < filas1; i++) {
            int partidosGanados = (int) modelo.getValueAt(4, 5);
           if( partidosGanados == 1 || partidosGanados == 2 || partidosGanados == 3 || partidosGanados == 4 || partidosGanados == 5 || partidosGanados == 6 || partidosGanados == 7 || partidosGanados == 8 || partidosGanados == 9 || partidosGanados == 10 ){
            modelo.setValueAt(partidosGanados + 3, 4, 7);// hago que le sume puntos a la columna de puntos
           }
        }
              //---------------------------------------------------------------------------------------------------------------------------------------
              
              
              
              
              
              
              
              
              
              
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombredelequipo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        sede = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        propietario = new javax.swing.JTextField();
        Jugar = new javax.swing.JButton();
        tipodejuego = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Contraseña = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfila = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcolumna = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        txtdatonuevo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombredelequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombredelequipoActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedeActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar todo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propietarioActionPerformed(evt);
            }
        });

        Jugar.setText("Jugar");
        Jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JugarMouseClicked(evt);
            }
        });

        tipodejuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Femenino" }));

        jLabel9.setText("Ingrese la contraseña como administrador");

        jButton2.setText("Modificar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese la fila");

        jLabel7.setText("Ingrese la colunma");

        jLabel8.setText("Ingrese el dato a reemplazar");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("Registrar equipo");

        jLabel2.setText("Nombre del equipo");

        jLabel3.setText("Sede:");

        jLabel4.setText("Tipo de juego");

        jLabel5.setText("Propietario");

        Registrar.setText("Registrar");
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nombredelequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sede, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Registrar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipodejuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel7)
                    .addComponent(txtfila, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcolumna, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdatonuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jButton3)
                .addGap(59, 59, 59)
                .addComponent(jButton4)
                .addGap(29, 29, 29)
                .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(nombredelequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tipodejuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(propietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(Registrar)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(Jugar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtcolumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdatonuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)))
                .addGap(0, 134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombredelequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombredelequipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombredelequipoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila =tabla.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);

        }else{
            JOptionPane.showMessageDialog(null,"seleccione la fila");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sedeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int fila=tabla.getRowCount();
        for (int i=fila-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propietarioActionPerformed

    private void JugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JugarMouseClicked
        sumarPartidoJugado();
    }//GEN-LAST:event_JugarMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String contraseña = "123";
        if(Contraseña.getText().equals(contraseña) ){
            int fila=Integer.parseInt(txtfila.getText());

            int columna=Integer.parseInt(txtcolumna.getText());
            if(columna<4){
                int datonuevo = Integer.parseInt(txtdatonuevo.getText());
                modelo.setValueAt(txtdatonuevo.getText(), fila, columna);
            }
            else {
                JOptionPane.showMessageDialog(this, " Los eventos no se pueden modificar ");
            }
        }

        else{
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
        agregarEquipo6();
    }//GEN-LAST:event_RegistrarMouseClicked

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if (nombredelequipo.getText().isEmpty() || sede.getText().isEmpty() ||

            propietario.getText().isEmpty())
        {

            JOptionPane.showMessageDialog(rootPane, "Si gusta en participar, por favor complete todos los campos");
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Femenino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Femenino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Femenino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Femenino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Femenino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contraseña;
    private javax.swing.JButton Jugar;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombredelequipo;
    private javax.swing.JTextField propietario;
    private javax.swing.JTextField sede;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipodejuego;
    private javax.swing.JTextField txtcolumna;
    private javax.swing.JTextField txtdatonuevo;
    private javax.swing.JTextField txtfila;
    // End of variables declaration//GEN-END:variables
}
