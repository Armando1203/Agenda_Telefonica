
package agenda;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import clases.Conexion;
import java.sql.PreparedStatement;

public class agregar extends javax.swing.JFrame {

    List<String> listaGrupos = new ArrayList<String>();
    Conexion con = new Conexion();
    Connection conexion = con.obtenerConexion();
    String grupo = "Ninguno";
    
    public agregar() {
        initComponents();
        this.setLocationRelativeTo(this); //Poner el JFrame en el centro de la pantalla
        this.getContentPane().setBackground(Color.white); //Color del JFrame
        
        mostrarGruposCombo();
    }
    
    public List<String> obtenerGrupos(Connection conexion)
    {
        String sql = "SELECT * FROM Grupos;";
        
        try 
        {
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next())
            {
                listaGrupos.add(rs.getString("Nombre"));
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al obtener los grupos");
        }
        return listaGrupos;
    }
    
    public void mostrarGruposCombo()
    {
        obtenerGrupos(conexion);
        
        for(int i = 0; i < listaGrupos.size(); i++)
        {
            cb_Grupos.addItem(listaGrupos.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_Telefono = new javax.swing.JTextField();
        tf_Nombre = new javax.swing.JTextField();
        cb_Grupos = new javax.swing.JComboBox<>();
        tf_Correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbl_Imagen = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR CONTACTO");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 53, 55));
        jLabel1.setText("Teléfono:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 53, 55));
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 53, 55));
        jLabel4.setText("Grupo*:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 53, 55));
        jLabel3.setText("Correo*:");

        tf_Telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_Telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 53, 55)));

        tf_Nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 53, 55)));

        cb_Grupos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_Grupos.setForeground(new java.awt.Color(55, 53, 55));
        cb_Grupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));
        cb_Grupos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cb_Grupos.setOpaque(true);
        cb_Grupos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_GruposItemStateChanged(evt);
            }
        });

        tf_Correo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_Correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 53, 55)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 53, 55));
        jLabel5.setText("* Datos no obligatorios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Nombre)
                            .addComponent(tf_Correo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_Grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 116, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_Grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        lbl_Imagen.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.jpg"))); // NOI18N
        lbl_Imagen.setOpaque(true);

        btn_Agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Agregar.setForeground(new java.awt.Color(55, 53, 55));
        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Agregar.setText("AGREGAR");
        btn_Agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Agregar.setFocusPainted(false);
        btn_Agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Agregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Agregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_cyan.jpg"))); // NOI18N
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        
        String telefono = tf_Telefono.getText();
        String nombre = tf_Nombre.getText();
        String correo = tf_Correo.getText();
        
        if("Ninguno".equals(grupo))
            grupo = null;
        if(correo.equals(""))
            correo = null;
        
        String sql = "INSERT INTO Contactos VALUES(?,?,?,?);";
        
        if(!telefono.isEmpty() && !nombre.isEmpty())
        {
            try 
            {
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1, telefono);
                statement.setString(2, nombre);
                statement.setString(3, grupo);
                statement.setString(4, correo);
                
                int contactoAgregado = statement.executeUpdate();
                
                if(contactoAgregado > 0)
                {
                    JOptionPane.showMessageDialog(null, "Contacto guardado");
                    tf_Telefono.setText("");
                    tf_Nombre.setText("");
                    tf_Correo.setText("");
                    cb_Grupos.setSelectedIndex(0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El contacto no pudo guardarse");
//                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El TELÉFONO y el NOMBRE son obligatorios.");
        }
        
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void cb_GruposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_GruposItemStateChanged
        
        grupo = (String)cb_Grupos.getSelectedItem();
        
    }//GEN-LAST:event_cb_GruposItemStateChanged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JComboBox<String> cb_Grupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Imagen;
    private javax.swing.JTextField tf_Correo;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Telefono;
    // End of variables declaration//GEN-END:variables
}
