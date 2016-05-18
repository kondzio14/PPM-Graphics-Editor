/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikak2;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

/**
 *
 * @author honzik
 */
public class ShapePainterFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame2
     */
    public ShapePainterFrame() {
        initComponents();

        //Line gui options components
        x1LineLabel = new JLabel("X1:");
        x2LineLabel = new JLabel("X2:");
        y1LineLabel = new JLabel("Y1:");
        y2LineLabel = new JLabel("Y2:");

        x1LineText = new JTextField(3);
        x2LineText = new JTextField(3);
        y1LineText = new JTextField(3);
        y2LineText = new JTextField(3);

        //Rectangle gui options components
        x1RectLabel = new JLabel("X1:");
        x2RectLabel = new JLabel("X2:");
//        x3RectLabel = new JLabel("X3:");
//        x4RectLabel = new JLabel("X4:");
        y1RectLabel = new JLabel("Y1:");
        y2RectLabel = new JLabel("Y2:");
//        y3RectLabel = new JLabel("Y3:");
//        y4RectLabel = new JLabel("Y4:");

        x1RectText = new JTextField(3);
        x2RectText = new JTextField(3);
//        x3RectText = new JTextField(3);
//        x4RectText = new JTextField(3);
        y1RectText = new JTextField(3);
        y2RectText = new JTextField(3);
//        y3RectText = new JTextField(3);
//        y4RectText = new JTextField(3);

        //Circle gui options components
        xCircleLabel = new JLabel("X:");
        yCircleLabel = new JLabel("Y:");
        xCircleText = new JTextField(3);
        yCircleText = new JTextField(3);
        radiusLabel = new JLabel("Promień:");
        radiusText = new JTextField(3);

        //Sets of gui components
        GridLayout gridLayout = new GridLayout(0, 2);
        lineComponentsSet = new JPanel(gridLayout);
        lineComponentsSet.add(x1LineLabel);
        lineComponentsSet.add(x1LineText);
        lineComponentsSet.add(y1LineLabel);
        lineComponentsSet.add(y1LineText);
        lineComponentsSet.add(x2LineLabel);
        lineComponentsSet.add(x2LineText);
        lineComponentsSet.add(y2LineLabel);
        lineComponentsSet.add(y2LineText);

        GridLayout rectOptionsGridLayout = new GridLayout(0, 4);
        rectangleComponentsSet = new JPanel(rectOptionsGridLayout);
        rectangleComponentsSet.add(x1RectLabel);
        rectangleComponentsSet.add(x1RectText);
        rectangleComponentsSet.add(y1RectLabel);
        rectangleComponentsSet.add(y1RectText);
        rectangleComponentsSet.add(x2RectLabel);
        rectangleComponentsSet.add(x2RectText);
        rectangleComponentsSet.add(y2RectLabel);
        rectangleComponentsSet.add(y2RectText);
//        rectangleComponentsSet.add(x3RectLabel);
//        rectangleComponentsSet.add(x3RectText);
//        rectangleComponentsSet.add(y3RectLabel);
//        rectangleComponentsSet.add(y3RectText);
//        rectangleComponentsSet.add(x4RectLabel);
//        rectangleComponentsSet.add(x4RectText);
//        rectangleComponentsSet.add(y4RectLabel);
//        rectangleComponentsSet.add(y4RectText);

        circleComponentsSet = new JPanel();
        circleComponentsSet.add(xCircleLabel);
        circleComponentsSet.add(xCircleText);
        circleComponentsSet.add(yCircleLabel);
        circleComponentsSet.add(yCircleText);
        circleComponentsSet.add(radiusLabel);
        circleComponentsSet.add(radiusText);

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
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new grafikak2.BasicShapeDrawPanel();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brak", "Linia", "Prostokąt", "Koło" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });

        jButton1.setText("Rysuj");
        jButton1.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton1.setMinimumSize(new java.awt.Dimension(5, 5));
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 0, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setMaximumSize(null);
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        jButton2.setText("Pomoc");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Zaznacz");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Paint");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        BasicShapeDrawPanel dp = ((BasicShapeDrawPanel) jPanel3);
        String mouseMode = dp.getMouseMode();
        if (mouseMode.compareTo("Drag") == 0) {
            dp.setMouseMode("Paint");
            jTextField1.setText("Paint");
        } else {
            dp.setMouseMode("Drag");
            jTextField1.setText("Drag");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Obiekty rysowane przemieszcza się za pomocą myszki (przytrzymania). W przypadku lini samo przytrzymanie modyfikuje jeden punkt. Aby zmodyfikować drugi należy użyc klawisza CTRL + przesunięcie.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

        BasicShapeDrawPanel dp = ((BasicShapeDrawPanel) jPanel3);

        if (dp.getMouseMode().compareTo("Paint") == 0) {
            String shapeToPaint = dp.getShapeToPaint();

            if (shapeToPaint.compareTo("Brak") != 0) {
                Point clickPoint = evt.getPoint();
                List<Point> drawPoints = dp.getDrawPoints();
                if (drawPoints.size() >= 2) {
                    drawPoints.clear();
                }
                drawPoints.add(clickPoint);

                if (drawPoints.size() == 2) {
                    jPanel3.removeAll();
                    jPanel3.repaint();
                }
            }
        }
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        BasicShapeDrawPanel dp = ((BasicShapeDrawPanel) jPanel3);
        if (dp.getMouseMode().compareTo("Drag") == 0) {
            String selectedDrawItem = (String) jComboBox1.getSelectedItem();
            List<Point> drawPointsList = dp.getDrawPoints();

            //if (drawPointsList.size() == 2) {
                int index = 0;

                if (selectedDrawItem.compareTo("Linia") == 0) {
                    if (evt.isControlDown()) {
                        index = 1;
                    }
                }

                drawPointsList.set(index, evt.getPoint());
                ((BasicShapeDrawPanel) jPanel3).repaint();
//            } else {
//                System.out.println("drawPointsList nie ma rozmiaru 2!");
//            }
        }
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jToggleButton1.setSelected(false);
        JPanel userInputPanel = (JPanel) jPanel2.getComponent(0);
        Component[] userInputComponents = userInputPanel.getComponents();

        if (checkUserInput(userInputComponents)) {
            String selectedDrawItem = (String) jComboBox1.getSelectedItem();
            BasicShapeDrawPanel dp = ((BasicShapeDrawPanel) jPanel3);
            dp.setMouseMode("TextFieldInputPaint");
            jTextField1.setText("TextFieldInputPaint");
            List<Point> drawPoints = dp.getDrawPoints();

            if (drawPoints.size() >= 2) {
                drawPoints.clear();
            }

            if (selectedDrawItem.compareTo("Koło") == 0) {
                addInputValuesForCircle(userInputComponents);
            }else{
                addInputValues(userInputComponents);
            }

            ((BasicShapeDrawPanel) jPanel3).setShapeToPaint(selectedDrawItem);
            ((BasicShapeDrawPanel) jPanel3).repaint();

        } else {
            JOptionPane.showMessageDialog(this, "Nie podano danych wejściowych!", "Uwaga", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange

    }//GEN-LAST:event_jComboBox1PropertyChange

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectedDrawItem = (String) jComboBox1.getSelectedItem();
        setOptionsForShape(selectedDrawItem);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void addInputValuesForCircle(Component[] userInputComponents) {
        BasicShapeDrawPanel dp = ((BasicShapeDrawPanel) jPanel3);
        String xStr = ((JTextField) userInputComponents[1]).getText();
        String yStr = ((JTextField) userInputComponents[3]).getText();
        String diameterStr = ((JTextField) userInputComponents[5]).getText();
        
        double diameter = Double.parseDouble(diameterStr);
        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);
        Point p = new Point(x, y);
        dp.getDrawPoints().add(p);
        dp.setDiameter(diameter);
    }

    public void addInputValues(Component[] userInputComponents) {
        BasicShapeDrawPanel dp = ((BasicShapeDrawPanel) jPanel3);
        for (int i = 0; i < userInputComponents.length; i = i + 4) {
            if (userInputComponents[i + 1].getClass().equals(JTextField.class) && userInputComponents[i + 3].getClass().equals(JTextField.class)) {
                String xStr = ((JTextField) userInputComponents[i + 1]).getText();
                String yStr = ((JTextField) userInputComponents[i + 3]).getText();
                int x = Integer.parseInt(xStr);
                int y = Integer.parseInt(yStr);
                Point p = new Point(x, y);
                dp.getDrawPoints().add(p);
            }
        }
    }

    //Return false if user input is blank
    private boolean checkUserInput(Component[] userInputComponentsP) {
        Component[] userInputComponents = userInputComponentsP;

        for (int i = 0; i < userInputComponents.length; i++) {
            if (userInputComponents[i].getClass().equals(JTextField.class)) {
                if (((JTextField) userInputComponents[i]).getText().isEmpty() == true) {
                    return false;
                }
            }
        }

        return true;
    }

    private void setOptionsForShape(String shape) {
        jPanel2.removeAll();
        ((BasicShapeDrawPanel) jPanel3).setShapeToPaint(shape);
        if (shape.compareTo("Linia") == 0) {
            jPanel2.add(lineComponentsSet);
        } else if (shape.compareTo("Prostokąt") == 0) {
            jPanel2.add(rectangleComponentsSet);
        } else if (shape.compareTo("Koło") == 0) {
            jPanel2.add(circleComponentsSet);
        } else {
            jPanel2.removeAll();
        }

        jPanel2.validate();
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    //Linie
    private JLabel x1LineLabel;
    private JLabel x2LineLabel;
    private JLabel y1LineLabel;
    private JLabel y2LineLabel;
    private JTextField x1LineText;
    private JTextField x2LineText;
    private JTextField y1LineText;
    private JTextField y2LineText;

    //Square (including line objects)
    private JLabel x1RectLabel;
    private JLabel x2RectLabel;
    //private JLabel x3RectLabel;
    //private JLabel x4RectLabel;
    private JLabel y1RectLabel;
    private JLabel y2RectLabel;
    //private JLabel y3RectLabel;
    //private JLabel y4RectLabel;
    private JTextField x1RectText;
    private JTextField x2RectText;
    //private JTextField x3RectText;
    //private JTextField x4RectText;
    private JTextField y1RectText;
    private JTextField y2RectText;
    //private JTextField y3RectText;
    //private JTextField y4RectText;

    //Circle (including x1, y1 points /w text + label)
    private JLabel xCircleLabel;
    private JLabel yCircleLabel;
    private JTextField xCircleText;
    private JTextField yCircleText;
    private JLabel radiusLabel;
    private JTextField radiusText;

    //Sets of dynamically changed gui
    private JPanel lineComponentsSet;
    private JPanel rectangleComponentsSet;
    private JPanel circleComponentsSet;
}
