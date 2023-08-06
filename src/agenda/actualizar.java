
package agenda;

import clases.Conexion;
import clases.Contacto;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class actualizar extends javax.swing.JFrame {

    String telefono;
    List<Contacto> listaContactos = new ArrayList<Contacto>();
    List<String> listaGrupos = new ArrayList<String>();
    Conexion con = new Conexion();
    Connection conexion = con.obtenerConexion();
    String grupo = "Ninguno";
    
    public actualizar() {
        initComponents();
    }
    
    public actualizar(String telefono)
    {
        initComponents();
        this.setLocationRelativeTo(this); //Poner el JFrame en el centro de la pantalla
        this.getContentPane().setBackground(Color.white); //Color del JFrame
        mostrarGruposCombo();
        
        this.telefono = telefono;
        mostrarContacto();
        tf_Telefono.setEnabled(false);
    }
    
    public List<Contacto> obtenerContactos(Connection conexion)
    {        
        String sql = "SELECT * FROM Contactos WHERE Telefono = '"+telefono+"';";
        
        try 
        {
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next())
            {
                listaContactos.add(new Contacto(
                rs.getString("Telefono"),
                rs.getString("Nombre"),
                rs.getString("Grupo"),
                rs.getString("Correo")));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los contactos");
        }
        
        return listaContactos;
    }
    
    public void mostrarContacto()
    {
        List<Contacto> contacto = obtenerContactos(conexion);
        String grupo = contacto.get(0).grupo;
        String correo = contacto.get(0).correo;
        
        if(grupo == null)
            grupo = " ---------- ";
        if(correo == null)
            correo = " ---------- ";
        
        lbl_Telefono.setText(contacto.get(0).telefono);
        lbl_Nombre.setText(contacto.get(0).nombre);
        lbl_Grupo.setText(grupo);
        lbl_Correo.setText(correo);
        
        tf_Telefono.setText(contacto.get(0).telefono);
        tf_Nombre.setText(contacto.get(0).nombre);
        
        if(" ---------- ".equals(correo))
            tf_Correo.setText("");
        else
            tf_Correo.setText(correo);
        
        for (int i = 0; i < cb_Grupos.getItemCount(); i++)
        {
            String opcion = cb_Grupos.getItemAt(i);
            if (opcion.equals(grupo)) {
                cb_Grupos.setSelectedIndex(i);
                break;
            }
        }
        
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

        jp_Datos_Actualizar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_Telefono = new javax.swing.JTextField();
        tf_Nombre = new javax.swing.JTextField();
        cb_Grupos = new javax.swing.JComboBox<>();
        tf_Correo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_Imagen = new javax.swing.JLabel();
        btn_Actualizar = new javax.swing.JButton();
        jp_Datos = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_Telefono = new javax.swing.JLabel();
        lbl_Grupo = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_Correo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACTUALIZACIÓN DE DATOS");
        setResizable(false);

        jp_Datos_Actualizar.setBackground(new java.awt.Color(255, 255, 255));

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
        cb_Grupos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_GruposItemStateChanged(evt);
            }
        });

        tf_Correo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_Correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 53, 55)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(55, 53, 55));
        jLabel9.setText("Ingresa los datos nuevos del contacto");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(55, 53, 55));
        jLabel11.setText("* Datos no obligatorios");

        javax.swing.GroupLayout jp_Datos_ActualizarLayout = new javax.swing.GroupLayout(jp_Datos_Actualizar);
        jp_Datos_Actualizar.setLayout(jp_Datos_ActualizarLayout);
        jp_Datos_ActualizarLayout.setHorizontalGroup(
            jp_Datos_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Datos_ActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Datos_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_Datos_ActualizarLayout.createSequentialGroup()
                        .addGroup(jp_Datos_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jp_Datos_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Nombre)
                            .addComponent(tf_Correo)
                            .addGroup(jp_Datos_ActualizarLayout.createSequentialGroup()
                                .addGroup(jp_Datos_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_Grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 116, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jp_Datos_ActualizarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Datos_ActualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(42, 42, 42))
        );
        jp_Datos_ActualizarLayout.setVerticalGroup(
            jp_Datos_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Datos_ActualizarLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Datos_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_Datos_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_Datos_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_Grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_Datos_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        lbl_Imagen.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.jpg"))); // NOI18N
        lbl_Imagen.setOpaque(true);

        btn_Actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Actualizar.setForeground(new java.awt.Color(55, 53, 55));
        btn_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Actualizar.setText("ACTUALIZAR");
        btn_Actualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Actualizar.setFocusPainted(false);
        btn_Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Actualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Actualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_cyan.jpg"))); // NOI18N
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        jp_Datos.setBackground(new java.awt.Color(255, 255, 255));

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(55, 53, 55));
        label1.setText("Teléfono:");

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(55, 53, 55));
        label2.setText("Nombre:");

        label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(55, 53, 55));
        label3.setText("Grupo:");

        label4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(55, 53, 55));
        label4.setText("Correo:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(55, 53, 55));
        jLabel10.setText("Datos del contacto seleccionado");

        lbl_Telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Telefono.setForeground(new java.awt.Color(0, 126, 127));

        lbl_Grupo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Grupo.setForeground(new java.awt.Color(0, 126, 127));

        lbl_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Nombre.setForeground(new java.awt.Color(0, 126, 127));

        lbl_Correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Correo.setForeground(new java.awt.Color(0, 126, 127));

        javax.swing.GroupLayout jp_DatosLayout = new javax.swing.GroupLayout(jp_Datos);
        jp_Datos.setLayout(jp_DatosLayout);
        jp_DatosLayout.setHorizontalGroup(
            jp_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_DatosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jp_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4)
                    .addComponent(label3)
                    .addComponent(label1)
                    .addComponent(label2))
                .addGap(18, 18, 18)
                .addGroup(jp_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_DatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(140, 140, 140))
        );
        jp_DatosLayout.setVerticalGroup(
            jp_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_DatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jp_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(lbl_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(lbl_Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(lbl_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jp_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jp_Datos_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jp_Datos_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        
        String telefono = tf_Telefono.getText();
        String nombre = tf_Nombre.getText();
        String correo = tf_Correo.getText();
        
        if("Ninguno".equals(grupo))
            grupo = null;
        if(correo.equals(""))
            correo = null;
        
        String sql = "UPDATE Contactos SET nombre=?, grupo=?, correo=? WHERE telefono=? ;";
        
        if(!tf_Telefono.toString().isEmpty() && !nombre.isEmpty())
        {
            try 
            {
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1, nombre);
                statement.setString(2, grupo);
                statement.setString(3, correo);
                statement.setString(4, telefono);
                
                int contactoAgregado = statement.executeUpdate();
                
                if(contactoAgregado > 0)
                {
                    String[] opciones = {"  Si  ", "  No  "};
                    int opcionSeleccionada = JOptionPane.showOptionDialog(
        null,
              "Contacto actualizado\n\n¿Deseas actualizar otro contacto?",
               "Actualizar",
           JOptionPane.YES_NO_OPTION,
           JOptionPane.QUESTION_MESSAGE,
                null,
              opciones,
                    opciones[0]);

                    if (opcionSeleccionada == JOptionPane.YES_OPTION){
                        b_contactos contactos = new b_contactos();
                        contactos.setVisible(true);
                        this.dispose();
                    }else if (opcionSeleccionada == JOptionPane.NO_OPTION)
                        this.dispose();
                    else
                        this.dispose();
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El contacto no se pudo actualizar");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El TELÉFONO y el NOMBRE son obligatorios.");
        }
        
    }//GEN-LAST:event_btn_ActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actualizar().setVisible(true);
            }
        });
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JComboBox<String> cb_Grupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jp_Datos;
    private javax.swing.JPanel jp_Datos_Actualizar;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel lbl_Correo;
    private javax.swing.JLabel lbl_Grupo;
    private javax.swing.JLabel lbl_Imagen;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Telefono;
    private javax.swing.JTextField tf_Correo;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Telefono;
    // End of variables declaration//GEN-END:variables
}
