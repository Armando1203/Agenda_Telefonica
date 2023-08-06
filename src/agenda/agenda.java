
package agenda;

import java.awt.Color;

public class agenda extends javax.swing.JFrame {

    public agenda() {
        initComponents();
        this.setLocationRelativeTo(this); //Poner el JFrame en el centro de la pantalla
        this.getContentPane().setBackground(Color.white); //Color del JFrame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Imagen = new javax.swing.JLabel();
        jp_Botones = new javax.swing.JPanel();
        btn_Contactos = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Grupos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGENDA TELEFÓNICA ");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        lbl_Imagen.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agenda.jpg"))); // NOI18N
        lbl_Imagen.setOpaque(true);

        jp_Botones.setBackground(new java.awt.Color(255, 255, 255));

        btn_Contactos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Contactos.setForeground(new java.awt.Color(55, 53, 55));
        btn_Contactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Contactos.setText("CONTACTOS");
        btn_Contactos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Contactos.setFocusPainted(false);
        btn_Contactos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Contactos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Contactos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_cyan.jpg"))); // NOI18N
        btn_Contactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ContactosActionPerformed(evt);
            }
        });

        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(55, 53, 55));
        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Eliminar.setText("ELIMINAR");
        btn_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Eliminar.setFocusPainted(false);
        btn_Eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_cyan.jpg"))); // NOI18N
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

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

        btn_Grupos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Grupos.setForeground(new java.awt.Color(55, 53, 55));
        btn_Grupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Grupos.setText("GRUPOS");
        btn_Grupos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Grupos.setFocusPainted(false);
        btn_Grupos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Grupos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_white.jpg"))); // NOI18N
        btn_Grupos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_cyan.jpg"))); // NOI18N
        btn_Grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GruposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_BotonesLayout = new javax.swing.GroupLayout(jp_Botones);
        jp_Botones.setLayout(jp_BotonesLayout);
        jp_BotonesLayout.setHorizontalGroup(
            jp_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_BotonesLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jp_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Contactos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Grupos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jp_BotonesLayout.setVerticalGroup(
            jp_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_BotonesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btn_Contactos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ContactosActionPerformed
        
        contactos contactos = new contactos();
        contactos.setVisible(true);
        
    }//GEN-LAST:event_btn_ContactosActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        
        agregar agregar = new agregar();
        agregar.setVisible(true);
        
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        
        b_contactos contactos = new b_contactos();
        contactos.setVisible(true);
        
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        
        eliminar eliminar = new eliminar();
        eliminar.setVisible(true);
        
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_GruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GruposActionPerformed
        
        grupo grupos = new grupo();
        grupos.setVisible(true);
        
    }//GEN-LAST:event_btn_GruposActionPerformed

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
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Contactos;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Grupos;
    private javax.swing.JPanel jp_Botones;
    private javax.swing.JLabel lbl_Imagen;
    // End of variables declaration//GEN-END:variables
}
