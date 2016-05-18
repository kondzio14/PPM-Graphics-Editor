/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikak2;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author honzik
 */
public class HistogramEdit extends javax.swing.JFrame {

    PpmPanel imagePanel;
    HistogramFrame histogram;
    ArrayList<Integer> eqLut;

    public HistogramEdit(PpmPanel imagePanel, HistogramFrame hist) {
        this.imagePanel = imagePanel;
        histogram = hist;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Rozszerzenie histogramu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Wyrównanie histogramu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int[][] pixels = imagePanel.getPixels();
        int[][] newGrayPixels = new int[pixels.length][pixels[0].length];
        int min = getMinimumGrayValue(pixels);
        int max = getMaximumGrayValue(pixels);
        Color c;

        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                c = new Color(pixels[i][j]);
                int grayV = c.getRGB();
                int out = (255 / (max - min)) * (grayV - min);
                newGrayPixels[i][j] = out;
            }
        }

        System.out.println("Rozszerzenie histogramu zrobione!");
        imagePanel.setPixels(newGrayPixels);
        imagePanel.displayImage();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        calculateEqualizationLut();
        updateImage();
    }//GEN-LAST:event_jButton2ActionPerformed

    private int getMinimumGrayValue(int[][] pixels) {
        int minimum = pixels[0][0];

        for (int[] pixel : pixels) {
            for (int j = 0; j < pixel.length; j++) {
                if (pixel[j] < minimum) {
                    minimum = pixel[j];
                }
            }
        }

        Color c = new Color(minimum);
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        System.out.println("Minimalna jasnosc obrazu wynosci " + r + " Skladowe rgb = " + r + ", " + g + ", " + b);
        return c.getRed();
    }

    private int getMaximumGrayValue(int[][] pixels) {
        int maximum = pixels[0][0];

        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                if (pixels[i][j] > maximum) {
                    maximum = pixels[i][j];
                }
            }
        }

        Color c = new Color(maximum);
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        System.out.println("Maxymalna jasnosc obrazu wynosci " + r + " Skladowe rgb = " + r + ", " + g + ", " + b);
        return c.getRed();
    }

    private void updateImage() {
        int[][] pixel = imagePanel.getPixels();
        for (int[] pixelRow : pixel) {
            for (int i = 0; i < pixelRow.length; i++) {
                int color = pixelRow[i];
                Color c = new Color(color);
                int gray = c.getRed();
                int newGray = eqLut.get(gray);
                Color c2 = new Color(newGray, newGray, newGray);
                pixelRow[i] = c2.getRGB();
            }
        }

        imagePanel.displayImage();
    }

    //Wyrownanie histogramu - LUT
    private void calculateEqualizationLut() {
        ArrayList<Float> cumDist = calculateCumulativeDistribution();
        eqLut = new ArrayList(cumDist.size());
        int nOfBrightnessLevels = calcNumberOfBrightnessLevels();

        float currLutValue;
        float d0 = cumDist.get(0);
        for (Float currCumDist : cumDist) {
            currLutValue = ((currCumDist - d0) * (nOfBrightnessLevels - 1)) / (1 - d0);
            int roundedLutVal = Math.round(currLutValue);
            eqLut.add(roundedLutVal);
        }
    }

    private int calcNumberOfBrightnessLevels() {
        int nOfLevels = 0;
        int[] grayLevels = histogram.getGrayValue();

        for (int i = 0; i < grayLevels.length; i++) {
            if (grayLevels[i] > 0) {
                nOfLevels++;
            }
        }

        return nOfLevels;
    }

    private int calcImgPointsNuber() {
        int[] grayLevels = histogram.getGrayValue();

        int sum = 0;
        for (int i = 0; i < grayLevels.length; i++) {
            sum += grayLevels[i];
        }
        
        return sum;
    }

    //Dystrybuanta
    private ArrayList<Float> calculateCumulativeDistribution() {
        int[] grayLevels = histogram.getGrayValue();
        ArrayList<Float> cumDistribution = new ArrayList(grayLevels.length);
        int numberOfPicPoints = imagePanel.getOryginalHeight() * imagePanel.getOryginalWidth();
        int n2 = calcImgPointsNuber();
        
        float lastDi = 0;
        for (int i = 0; i < grayLevels.length; i++) {
            float di = lastDi + ((float) grayLevels[i] / (float) numberOfPicPoints);
            lastDi = di;
            cumDistribution.add(di);
        }
        return cumDistribution;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
