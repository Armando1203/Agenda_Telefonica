
package agenda;

import clases.Conexion;
import clases.Contacto;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import utilerias.TextPrompt;

public class contactos extends javax.swing.JFrame {

    List<Contacto> listaContactos = new ArrayList<Contacto>();
    Conexion con = new Conexion();
    Connection conexion = con.obtenerConexion();
    
    public contactos() {
        initComponents();
        this.setLocationRelativeTo(this); //Poner el JFrame en el centro de la pantalla
        this.getContentPane().setBackground(Color.white); //Color del JFrame
        TextPrompt holderTelefono = new TextPrompt("  Teléfono",tf_Telefono);
        TextPrompt holderNombre = new TextPrompt("  Nombre",tf_Nombre);
        
        List<Contacto> contactos = obtenerContactos(conexion);
        mostrarLista(contactos);
        
        lbl_Contactos_Reg.setText(lbl_Contactos_Reg.getText() + contactos.size());
    }
    
    public List<Contacto> obtenerContactos(Connection conexion)
    {
        String sql = "SELECT * FROM Contactos;";
        
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
    
    public void mostrarLista(List<Contacto> listaDeContactos)
    {
        limpiarTabla();
        
        DefaultTableModel modelo =  new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                // Hacer que todas las celdas no sean editables
                return false;
            }
        };
        
        modelo.addColumn(" TELÉFONO");
        modelo.addColumn(" NOMBRE");
        modelo.addColumn(" GRUPO");
        modelo.addColumn(" CORREO");
        
        for(int i = 0; i < listaDeContactos.size(); i++)
        {
            if(listaDeContactos.get(i).getGrupo() == null)
                listaDeContactos.get(i).setGrupo("");
            if(listaDeContactos.get(i).getCorreo() == null)
                listaDeContactos.get(i).setCorreo("");
           
            Object[] ob = {" "+listaDeContactos.get(i).getTelefono(),
                           " "+listaDeContactos.get(i).getNombre(),
                           " "+listaDeContactos.get(i).getGrupo(),
                           " "+listaDeContactos.get(i).getCorreo()};
           
           modelo.addRow(ob);
        }
        
        tbl_Contactos.setModel(modelo);
        
        TableColumnModel columnModel = tbl_Contactos.getColumnModel();

        TableColumn primeraColumna = columnModel.getColumn(0);
        primeraColumna.setPreferredWidth(70);
        
        TableColumn segundaColumna = columnModel.getColumn(1);
        segundaColumna.setPreferredWidth(200);
        
        TableColumn terceraColumna = columnModel.getColumn(2);
        terceraColumna.setPreferredWidth(60);
        
        TableColumn cuartaColumna = columnModel.getColumn(3);
        cuartaColumna.setPreferredWidth(200);
    }
    
    public void limpiarTabla()
    {
        listaContactos = new ArrayList<Contacto>();
        DefaultTableModel modelo = (DefaultTableModel) tbl_Contactos.getModel();
        
        for(int i = 0; i < modelo.getRowCount(); i++) //Siempre va a eliminar el renglón cero
        {
            modelo.removeRow(i);
            i--;
        }
        tbl_Contactos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Imagen = new javax.swing.JLabel();
        tf_Telefono = new javax.swing.JTextField();
        tf_Nombre = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        lbl_Contactos_Reg = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Contactos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONTACTOS");
        setResizable(false);

        lbl_Imagen.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contactos.jpg"))); // NOI18N
        lbl_Imagen.setOpaque(true);

        tf_Telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_Telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 53, 55)));

        tf_Nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 53, 55)));

        btn_Buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Buscar.setForeground(new java.awt.Color(55, 53, 55));
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Buscar.setText("BUSCAR");
        btn_Buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Buscar.setFocusPainted(false);
        btn_Buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Buscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_cyan.jpg"))); // NOI18N
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        lbl_Contactos_Reg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Contactos_Reg.setForeground(new java.awt.Color(55, 53, 55));
        lbl_Contactos_Reg.setText("Número de contactos registrados:  ");

        tbl_Contactos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_Contactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_Contactos.setRowHeight(25);
        jScrollPane2.setViewportView(tbl_Contactos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(lbl_Contactos_Reg)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(lbl_Contactos_Reg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        
        String telefono = tf_Telefono.getText();
        String nombre = tf_Nombre.getText();
        
        if(telefono.isEmpty())//Si está vacío el teléfono
        {
            if(nombre.isEmpty())//Si está vacío el nombre
            {
                //Buscar toda la lista
                mostrarLista(obtenerContactos(conexion));
                
            }else{ //Si el nombre no está vacío
                
                //Buscar por nombre
                String sql = "SELECT * FROM Contactos WHERE Nombre COLLATE Latin1_General_CI_AI LIKE '%"+nombre+"%';";
        
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
                    JOptionPane.showMessageDialog(null, "Error al obtener los contactos con el nombre");
                }
                
                mostrarLista(listaContactos);
                
            }
        }else{ //Si el teléfono no está vacío
            if(nombre.isEmpty()) //Si el nombre está vacío
            {
                //Buscar por teléfono
                String sql = "SELECT * FROM Contactos WHERE Telefono LIKE '%"+telefono+"%';";
        
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
                    JOptionPane.showMessageDialog(null, "Error al obtener los contactos con el telefono");
                }
                
                mostrarLista(listaContactos);
                
                
            }else{//Si el nombre no está vacío
                //Buscar por teléfono y nombre
                
                String sql = "SELECT * FROM Contactos WHERE Telefono LIKE '%"+telefono+"%' AND Nombre COLLATE Latin1_General_CI_AI LIKE '%"+nombre+"%';";
        
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
                    JOptionPane.showMessageDialog(null, "Error al obtener los contactos con el teléfono y el nombre");
                }
                
                mostrarLista(listaContactos);
            }
        }
        
    }//GEN-LAST:event_btn_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contactos().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Contactos_Reg;
    private javax.swing.JLabel lbl_Imagen;
    private javax.swing.JTable tbl_Contactos;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Telefono;
    // End of variables declaration//GEN-END:variables
}
