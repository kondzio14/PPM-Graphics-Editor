/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morfology;

import other.PpmPanel;

/**
 *
 * @author honzik
 */
public class MorfologyJFrame extends javax.swing.JFrame {

    Morfology morfology;
    PpmPanel imgPanel;
    
    public MorfologyJFrame(PpmPanel imgPanel) {
        initComponents();
        this.imgPanel = imgPanel;
        morfology = new Morfology(imgPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dilationButton = new javax.swing.JButton();

        dilationButton.setText("Dilation - dylacja");
        dilationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dilationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dilationButton)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dilationButton)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dilationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dilationButtonActionPerformed
        int[][] structEl = morfology.get3x3StructEl();
        int[][]newPixels = morfology.dilation(structEl);
        setNewPixelsToDisplay(newPixels);
    }//GEN-LAST:event_dilationButtonActionPerformed

    public void setNewPixelsToDisplay(int[][] newPixels) {
        imgPanel.setPixels(newPixels);
        imgPanel.displayImage();
        imgPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dilationButton;
    // End of variables declaration//GEN-END:variables
}