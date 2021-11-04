package proyecto;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ordenar1 extends javax.swing.JFrame {
Proyecto conn = new Proyecto();
Connection cn = conn.conexion();
    public Ordenar1() {
        initComponents();
        fecha.setText(fechaActual());
        mostrarDatos(0,null);
    }

    public void mostrarDatos(int num, String valor){
    DefaultTableModel ta = new DefaultTableModel();
    ta.addColumn("Orden");
    ta.addColumn("Proveedor");
    ta.addColumn("Entrega requerida");
    ta.addColumn("Ordenado po");
    ta.addColumn("Entrega en");
    ta.addColumn("Producto");
    ta.addColumn("Importe");
    ta.addColumn("Cantidad");
    ta.addColumn("Precio");
    ta.addColumn("Total");
    ta.addColumn("Vuelto");
    ta.addColumn("Comentario");
    Tabla1.setModel(ta);
    
    String[] datos = new String[11];
        try {
            Statement leer = cn.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT *FROM comprar");
            
            while(resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                datos[8] = resultado.getString(9);
                datos[9] = resultado.getString(10);
                datos[10] = resultado.getString(11);
                datos[11] = resultado.getString(12);
                ta.addRow(datos);
            }
            Tabla1.setModel(ta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comPro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        txtOrden = new javax.swing.JTextField();
        txtEntrega = new javax.swing.JTextField();
        txtPersona = new javax.swing.JTextField();
        comAlm = new javax.swing.JComboBox<>();
        txtImporte = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        label3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        comCosas = new javax.swing.JComboBox<>();
        fecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtTotal = new javax.swing.JLabel();
        txtVuelto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Orden no:");

        jLabel2.setText("Proveedor: ");

        jLabel4.setText("Entrega Requerida: ");

        comPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dismart", "Libreria e imprenta Vivian S.A", "Office Depot", "Libreria Juridica" }));

        jLabel5.setText("Ordenado por:");

        jLabel6.setText("Entregado en: ");

        jLabel7.setText("Importe: ");

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane1.setViewportView(txtComentario);

        comAlm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almacen Zona 10", "Almacen Zona 1", "Almacen Zona 4", "Almacen Zona 16" }));

        jLabel8.setText("Comentario: ");

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Tabla1);

        label3.setText("Cantidad: ");

        comCosas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organizador de escritorio", "Engrapadora", "Perforadora", "Caja Lapiceros Punto fino", "Caja de Boligrafos Bic", "Caja Lapiz Mongol", "Agenda 2022", "Hojas cuadricula tamaño Carta", "Hojas cuadricula tamaño Oficio", "Hojas lineas tamaño Carta", "Hojas lineas tamaño Oficio", "Hojas bond tamaño Carta", "Hojas bond tamaño Oficio", "Resaltadores metalico", "Resaltadores pastel", "Resaltadores neon", "Banderitas delgadas", "Cuchilla pequeña", "Block de notas 3x3 400 hojas", "Calculadora cientifica", "Cinta Adhesiva", "Clips Niquelado", "Corrector tipo boligrafo", "Tijeras", "Impresora Multifuncional HP", "Cartucho HP 57", "Bote de basura malla", "Cartapacio Kinera 2", "Dispensador de cinta adhesiva", "Memoria USB 32 GB", "Memoria USB 16 GB", "Laptop DELL X7V7R" }));
        comCosas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comCosasItemStateChanged(evt);
            }
        });
        comCosas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCosasActionPerformed(evt);
            }
        });

        fecha.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(102, 0, 102));
        fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/relo3.png"))); // NOI18N

        jLabel3.setText("Precio: ");

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/guardar.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/cerrar.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtTotal.setForeground(new java.awt.Color(204, 204, 204));
        txtTotal.setText("Precio: ");

        txtVuelto.setForeground(new java.awt.Color(204, 204, 204));
        txtVuelto.setText("Precio: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(9, 9, 9)
                                        .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(fecha)))
                                        .addGap(17, 17, 17)
                                        .addComponent(comPro, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(15, 15, 15)
                                        .addComponent(txtPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(15, 15, 15)
                                        .addComponent(comAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel7)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comCosas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addGap(7, 7, 7)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtVuelto)
                                        .addGap(22, 22, 22))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fecha)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(comPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comCosas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal)
                            .addComponent(txtVuelto)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String fechaActual()
    {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);   
        
    }
    
    private void comCosasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCosasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comCosasActionPerformed

    private void comCosasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comCosasItemStateChanged
        String cosas = (String)comCosas.getSelectedItem();
        if(cosas.equals("Organizador de escritorio"))
        {
            txtPrecio.setText("59.90");
        }
        if(cosas.equals("Engrapadora"))
        {
            txtPrecio.setText("31.40");
        }
        if(cosas.equals("Perforadora"))
        {
            txtPrecio.setText("64.90");
        }
        if(cosas.equals("Caja Lapiceros Punto fino"))
        {
            txtPrecio.setText("63.00");
        }
        if(cosas.equals("Caja de Boligrafos Bic"))
        {
            txtPrecio.setText("5.00");
        }
        if(cosas.equals("Caja Lapiz Mongol"))
        {
            txtPrecio.setText("10.00");
        }
        if(cosas.equals("Agenda 2022"))
        {
            txtPrecio.setText("40.00");
        }
        if(cosas.equals("Hojas cuadricula tamaño Carta"))
        {
            txtPrecio.setText("10.00");
        }
        if(cosas.equals("Hojas cuadricula tamaño Oficio"))
        {
            txtPrecio.setText("12.00");
        }
        if(cosas.equals("Hojas lineas tamaño Carta"))
        {
            txtPrecio.setText("10.00");
        }
        if(cosas.equals("Hojas lineas tamaño Oficio"))
        {
            txtPrecio.setText("12.00");
        }
        if(cosas.equals("Hojas bond tamaño Carta"))
        {
            txtPrecio.setText("10.00");
        }
        if(cosas.equals("Hojas bond tamaño Oficio"))
        {
            txtPrecio.setText("12.00");
        }
        if(cosas.equals("Resaltadores metalico"))
        {
            txtPrecio.setText("30.00");
        }
        if(cosas.equals("Resaltadores pastel "))
        {
            txtPrecio.setText("30.00");
        }
        if(cosas.equals("Resaltadores neon"))
        {
            txtPrecio.setText("30.00");
        }
        if(cosas.equals("Banderitas delgadas"))
        {
            txtPrecio.setText("10.00");
        }
        if(cosas.equals("Cuchilla pequeña"))
        {
            txtPrecio.setText("15.90");
        }
        if(cosas.equals("Block de notas 3x3 400 hojas"))
        {
            txtPrecio.setText("24.00");
        }
        if(cosas.equals("Calculadora cientifica"))
        {
            txtPrecio.setText("124.85");
        }
        if(cosas.equals("Cinta Adhesiva"))
        {
            txtPrecio.setText("97.80");
        }
        if(cosas.equals("Clips Niquelado"))
        {
            txtPrecio.setText("70.50");
        }
        if(cosas.equals("Corrector tipo boligrafo "))
        {
            txtPrecio.setText("5.35");
        }
        if(cosas.equals("Tijeras"))
        {
            txtPrecio.setText("23.90");
        }
        if(cosas.equals("Impresora Multifuncional HP"))
        {
            txtPrecio.setText("2,259.00");
        }
        if(cosas.equals("Cartucho HP 57"))
        {
            txtPrecio.setText("399.00");
        }
        if(cosas.equals("Bote de basura malla"))
        {
            txtPrecio.setText("38.00");
        }
        if(cosas.equals("Cartapacio Kinera 2"))
        {
            txtPrecio.setText("27.00");
        }
        if(cosas.equals("Dispensador de cinta adhesiva"))
        {
            txtPrecio.setText("12.65");
        }
        if(cosas.equals("Memoria USB 32 GB"))
        {
            txtPrecio.setText("209.60");
        }
        if(cosas.equals("Memoria USB 16 GB"))
        {
            txtPrecio.setText("56.60");
        }
        if(cosas.equals("Laptop DELL X7V7R"))
        {
            txtPrecio.setText("3,369.00");
        }
        
    }//GEN-LAST:event_comCosasItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            String cosas = (String)comCosas.getSelectedItem();
            double precio = Double.parseDouble(txtPrecio.getText());
            double cantidad = Double.parseDouble(txtCantidad.getText());
            double vuelto = Double.parseDouble(txtImporte.getText());
            double total = precio*cantidad;
            double vu= vuelto-total;
            txtTotal.setText(String.valueOf(total));
            txtVuelto.setText(String.valueOf(vu));
        try{
            PreparedStatement guardar = cn.prepareStatement("INSERT INTO comprar(orden,proveedores,entrega_requerida,ordenado,entrega,producto,importe,cantidad,precio,total,vuelto,comentario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            guardar.setString(1, txtOrden.getText());
            guardar.setString(2, comPro.getSelectedItem().toString());
            guardar.setString(3, txtEntrega.getText());
            guardar.setString(4, txtPersona.getText());
            guardar.setString(5, comAlm.getSelectedItem().toString());
            guardar.setString(6, comCosas.getSelectedItem().toString());
            guardar.setString(7, txtImporte.getText());
            guardar.setString(8, txtCantidad.getText());
            guardar.setString(9, txtPrecio.getText());
            guardar.setString(10, txtTotal.getText());
            guardar.setString(11, txtVuelto.getText());
            guardar.setString(12, txtComentario.getText());
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos");
        }
        //////////////////////////////////////////////
        txtOrden.setText("");
        txtEntrega.setText("");
        txtPersona.setText("");
        txtImporte.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtComentario.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.setVisible(false);
        Compras abrir = new Compras();
        abrir.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ordenar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordenar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordenar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordenar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordenar1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JComboBox<String> comAlm;
    private javax.swing.JComboBox<String> comCosas;
    private javax.swing.JComboBox<String> comPro;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label3;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtEntrega;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtOrden;
    private javax.swing.JTextField txtPersona;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtVuelto;
    // End of variables declaration//GEN-END:variables
}
