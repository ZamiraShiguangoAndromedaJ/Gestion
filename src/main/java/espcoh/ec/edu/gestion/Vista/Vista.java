/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package espcoh.ec.edu.gestion.Vista;

/**
 *
 * @author anthony
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBoton = new javax.swing.ButtonGroup();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        txtAgregarT = new javax.swing.JMenu();
        mnAgregarT = new javax.swing.JMenuItem();
        mnListaTP = new javax.swing.JMenuItem();
        mnListaTC = new javax.swing.JMenuItem();
        mnSalir = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        txtAgregarT.setText("Titulo");

        mnAgregarT.setText("Agregar Tareas");
        mnAgregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregarTActionPerformed(evt);
            }
        });
        txtAgregarT.add(mnAgregarT);

        mnListaTP.setText("Lista de Tareas Pendientes");
        mnListaTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListaTPActionPerformed(evt);
            }
        });
        txtAgregarT.add(mnListaTP);

        mnListaTC.setText("Lista de Tareas Completadas");
        mnListaTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListaTCActionPerformed(evt);
            }
        });
        txtAgregarT.add(mnListaTC);

        mnSalir.setText("Salir");
        txtAgregarT.add(mnSalir);

        jMenuBar1.add(txtAgregarT);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnAgregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregarTActionPerformed
     AgregarTarea verventana = new AgregarTarea();
     escritorio.add(verventana);
     verventana.show();
    }//GEN-LAST:event_mnAgregarTActionPerformed

    private void mnListaTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListaTPActionPerformed
      TareasPendientes verventana = new TareasPendientes();
      escritorio.add(verventana);
     verventana.show();
    }//GEN-LAST:event_mnListaTPActionPerformed

    private void mnListaTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListaTCActionPerformed
       TareasCompletadas verventana = new TareasCompletadas();
       escritorio.add(verventana);
       verventana.show();
    }//GEN-LAST:event_mnListaTCActionPerformed

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgBoton;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem mnAgregarT;
    private javax.swing.JMenuItem mnListaTC;
    private javax.swing.JMenuItem mnListaTP;
    private javax.swing.JMenuItem mnSalir;
    private javax.swing.JMenu txtAgregarT;
    // End of variables declaration//GEN-END:variables
}
