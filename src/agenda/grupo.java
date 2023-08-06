
package agenda;

import clases.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class grupo extends javax.swing.JFrame {
    
    List<String> listaGrupos = new ArrayList<String>();
    Conexion con = new Conexion();
    Connection conexion = con.obtenerConexion();
        
    public grupo() {
        initComponents();
        this.setLocationRelativeTo(this); //Poner el JFrame en el centro de la pantalla
        this.getContentPane().setBackground(Color.white); //Color del JFrame
        
        mostrarLista();
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
    
    public void mostrarLista()
    {
        limpiarTabla();
        List<String> listaDeGrupos = obtenerGrupos(conexion);
        
        DefaultTableModel modelo = (DefaultTableModel) tbl_Grupos.getModel();
        
        Object[] ob = new Object[1];
        for(int i = 0; i < listaDeGrupos.size(); i++)
        {
            ob[0] = " "+listaDeGrupos.get(i);
            modelo.addRow(ob);
        }
        tbl_Grupos.setModel(modelo);
    }
    
    public void limpiarTabla()
    {
        listaGrupos = new ArrayList<String>();
        
        DefaultTableModel modelo = (DefaultTableModel) tbl_Grupos.getModel();
        
        for(int i = 0; i < modelo.getRowCount(); i++) //Siempre va a eliminar el renglón cero
        {
            modelo.removeRow(i);
            i--;
        }
        
        tbl_Grupos.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        btn_Agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Grupos = new javax.swing.JTable();
        btn_Eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GRUPOS");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 53, 55));
        jLabel1.setText("Nombre del grupo:");

        tf_Nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 53, 55)));

        btn_Agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Agregar.setForeground(new java.awt.Color(55, 53, 55));
        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white2.jpg"))); // NOI18N
        btn_Agregar.setText("AGREGAR");
        btn_Agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Agregar.setFocusPainted(false);
        btn_Agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Agregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Agregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_cyan2.jpg"))); // NOI18N
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        tbl_Grupos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbl_Grupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRUPOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Grupos.setRowHeight(30);
        jScrollPane1.setViewportView(tbl_Grupos);
        if (tbl_Grupos.getColumnModel().getColumnCount() > 0) {
            tbl_Grupos.getColumnModel().getColumn(0).setResizable(false);
        }

        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(55, 53, 55));
        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white2.jpg"))); // NOI18N
        btn_Eliminar.setText("ELIMINAR");
        btn_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Eliminar.setFocusPainted(false);
        btn_Eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_red2.jpg"))); // NOI18N
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Seleccione para eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        
        if(!tf_Nombre.getText().isEmpty())
        {
            String grupo = tf_Nombre.getText();
            String sql = "INSERT INTO Grupos VALUES(?)";
            try 
            {
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1, grupo);

                int registroAgregado = statement.executeUpdate();

                if(registroAgregado > 0)
                {
                    JOptionPane.showMessageDialog(null, "Grupo guardado");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Grupo no guardado");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Ingresa el nombre del nuevo grupo");
        }
        
        tf_Nombre.setText("");
        mostrarLista();
        
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        
        int seleccion =  tbl_Grupos.getSelectedRow();
        
        if(seleccion == -1)
        {
            JOptionPane.showMessageDialog(null, "Seleccione un grupo");
            
        }else{
            String grupo = tbl_Grupos.getValueAt(seleccion, 0).toString().replaceAll("\\s", "");
            String sql = "DELETE FROM Grupos WHERE Nombre='"+grupo+"'";

            try 
            {
                PreparedStatement statement = conexion.prepareStatement(sql);
                int registroAgregado = statement.executeUpdate();

                if(registroAgregado > 0)
                {
                    JOptionPane.showMessageDialog(null, "Grupo eliminado");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Grupo no eliminado"+e.toString());
            }
        }
        
        mostrarLista();
        
    }//GEN-LAST:event_btn_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grupo().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Grupos;
    private javax.swing.JTextField tf_Nombre;
    // End of variables declaration//GEN-END:variables
}
