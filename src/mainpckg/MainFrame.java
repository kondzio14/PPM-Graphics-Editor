//Reading file methods compared - http://nadeausoftware.com/articles/2008/02/java_tip_how_read_files_quickly
package mainpckg;

import other.PpmPanel;
import imgtransform.EditPictureFrame;
import histogram.HistogramFrame;
import histogram.HistogramEdit;
import basicshapes.BasicShapeDrawFrame;
import imagefilter.ImageFilterFrame;
import binaryzation.BinaryzationFrame;
import beziere.BeziereCurveFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileFilter;
import morfology.MorfologyJFrame;
import transformation.ShapeTransformDrawFrame;

public class MainFrame extends javax.swing.JFrame {

    final JFileChooser fChooser;
    EditPictureFrame editPicFrame;
    ImageFilterFrame imgFilterFrame;
    BinaryzationFrame binaryFrame;
    PpmPanel imagePanel;
    HistogramFrame hist;
    HistogramEdit he;
    BeziereCurveFrame beziereCurveFrame;
    BasicShapeDrawFrame shapePainterFrame;
    ShapeTransformDrawFrame shapeTransformDrawFrame;
    MorfologyJFrame morfologyFrame;

    public MainFrame() {
        initComponents();
        setTitle("PPM File Editor");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        String userPictureDirPath = System.getProperty("user.home") + "/Pictures";
        fChooser = new JFileChooser(userPictureDirPath);
        FileFilter jpgFilter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
        FileFilter ppmFilter = new FileNameExtensionFilter("Ppm file", "ppm");
        fChooser.addChoosableFileFilter(jpgFilter);
        fChooser.addChoosableFileFilter(ppmFilter);

        JMenuItem openMI = new JMenuItem("Otwórz");
        JMenuItem saveMI = new JMenuItem("Zapisz");
        JMenuItem exitMI = new JMenuItem("Wyjdz");
        JMenuItem ppMI = new JMenuItem("Przekształcenia punktowe");
        JMenuItem filterMI = new JMenuItem("Filtry obrazu");
        JMenuItem histogramMI = new JMenuItem("Histogram");
        JMenuItem changeHistMI = new JMenuItem("Przekształcenia histogramu");
        JMenuItem binaryzationMI = new JMenuItem("Binaryzacja");
        JMenuItem beziereCurveMI = new JMenuItem("Krzywe Beziere");
        JMenuItem shapeDrawMI = new JMenuItem("Prymitywy graficzne oraz kanwa");
        JMenuItem shapeTransformMI = new JMenuItem("Przekszatalcenia 2D");
        JMenuItem morfoloryTransformMI = new JMenuItem("Przekszałcenia morfologiczne");

        openMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });
        saveMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });
        exitMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        ppMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openEditPicFrame();
            }
        });
        filterMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFilterFrame();
            }
        });
        histogramMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openHistogramFrame();
            }
        });
        changeHistMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openHistogramEditFrame();
            }
        });
        binaryzationMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openBinaryzationFrame();
            }
        });
        beziereCurveMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openBeziereCurveDrawPanel();
            }
        });
        shapeDrawMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openShapePainterFrame();
            }
        });
        shapeTransformMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openShapeTransformFrame();
            }
        });
        morfoloryTransformMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openMorfologyFrame();
            }
        });

        fileMenu.add(openMI);
        fileMenu.add(saveMI);
        fileMenu.add(exitMI);
        pointCalculationMenu.add(ppMI);
        filterMenu.add(filterMI);
        histogramMenu.add(histogramMI);
        histogramMenu.add(changeHistMI);
        binaryzationMenu.add(binaryzationMI);
        otherMenu.add(beziereCurveMI);
        otherMenu.add(shapeDrawMI);
        otherMenu.add(shapeTransformMI);
        otherMenu.add(morfoloryTransformMI);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PpmPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        pointCalculationMenu = new javax.swing.JMenu();
        filterMenu = new javax.swing.JMenu();
        histogramMenu = new javax.swing.JMenu();
        binaryzationMenu = new javax.swing.JMenu();
        otherMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 33));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        fileMenu.setText("Plik");
        jMenuBar1.add(fileMenu);

        pointCalculationMenu.setText("Przekształcenia punktowe");
        jMenuBar1.add(pointCalculationMenu);

        filterMenu.setText("Filtry obrazu");
        jMenuBar1.add(filterMenu);

        histogramMenu.setText("Histogram");
        jMenuBar1.add(histogramMenu);

        binaryzationMenu.setText("Binaryzacja");
        jMenuBar1.add(binaryzationMenu);

        otherMenu.setText("Inne");
        jMenuBar1.add(otherMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private boolean isImageLoaded() {
        if (imagePanel != null && imagePanel.getPixels() != null) {
            return true;
        } else {
            return false;
        }
    }

    private void openMorfologyFrame() {
        if (isImageLoaded()) {
            if (morfologyFrame == null) {
                morfologyFrame = new MorfologyJFrame(imagePanel);
            }
            morfologyFrame.setVisible(true);
        } else {
            displayGuiMessage("Musisz otworzyć plik PPM z menu Plik -> Otworz", "", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void openEditPicFrame() {
        if (isImageLoaded()) {
            editPicFrame.setVisible(true);
        } else {
            displayGuiMessage("Musisz otworzyć plik PPM z menu Plik -> Otworz", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void openFilterFrame() {
        if (isImageLoaded()) {
            imgFilterFrame.setVisible(true);
        } else {
            displayGuiMessage("Musisz otworzyć plik PPM z menu Plik -> Otworz", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void openHistogramFrame() {
        if (isImageLoaded()) {
            createHistogram();
        } else {
            displayGuiMessage("Musisz otworzyć plik PPM z menu Plik -> Otworz", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void createHistogram() {
        int[][] pixels = imagePanel.getPixels();
        hist = new HistogramFrame(pixels); //Creates and display histogram for currently displayed image
    }

    public HistogramFrame getHistogram(boolean isVisible) {
        if (hist == null) {
            createHistogram();
            hist.setVisible(isVisible);
        }

        return hist;
    }

    private void openHistogramEditFrame() {
        if (isImageLoaded()) {
            createHistogramEditFrame();
        } else {
            displayGuiMessage("Musisz otworzyć plik PPM z menu Plik -> Otworz", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void createHistogramEditFrame() {
        if (hist != null) {
            he = new HistogramEdit(imagePanel, hist);
            he.setVisible(true);
        }
    }

    private void openBinaryzationFrame() {
        if (isImageLoaded()) {
            if (binaryFrame == null) {
                binaryFrame = new BinaryzationFrame(imagePanel, this);
                binaryFrame.setVisible(true);
            } else {
                binaryFrame.setVisible(true);
            }
        } else {
            displayGuiMessage("Musisz otworzyć plik PPM z menu Plik -> Otworz", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void openBeziereCurveDrawPanel() {
        if (beziereCurveFrame == null) {
            beziereCurveFrame = new BeziereCurveFrame();
            beziereCurveFrame.setVisible(true);
        } else {
            beziereCurveFrame.setVisible(true);
        }
    }

    private void openShapePainterFrame() {
        if (shapePainterFrame != null) {
            shapePainterFrame.setVisible(true);
        } else {
            shapePainterFrame = new BasicShapeDrawFrame();
            shapePainterFrame.setVisible(true);
        }
    }

    private void openShapeTransformFrame() {
        if (shapeTransformDrawFrame == null) {
            shapeTransformDrawFrame = new ShapeTransformDrawFrame();
        }
        shapeTransformDrawFrame.setVisible(true);
    }

    public void loadAndDisplayImage(String location) {
        imagePanel = ((PpmPanel) jPanel1);

        if (imagePanel.loadImage(location)) {
            if (imagePanel.displayImage()) {
                System.out.println("Displaying image of size:" + imagePanel.getImageWidth() + "x" + imagePanel.getImageHeight());
                this.setSize(imagePanel.getImageWidth() + 70, imagePanel.getImageHeight() + 30);
                setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Plik jest uszkodzony.", "Błąd", JOptionPane.ERROR_MESSAGE);
                dispose();
            }
        }
        editPicFrame = new EditPictureFrame(imagePanel);
        //editPicFrame.setVisible(true);
        imgFilterFrame = new ImageFilterFrame(imagePanel, this);
        this.resize2();
        //imgFilterFrame.setVisible(true);
    }

    public void loadAndDisplayJPGImage(String location) {
        PpmPanel imagePanel = ((PpmPanel) jPanel1);
        imagePanel.loadAndDisplayJPG(location);
        //System.out.println("Displaying image of size:" + width + "x" + height);

        //this.setSize(imagePanel.getImageWidth(), imagePanel.getImageHeigth());
        this.resize2();
        setVisible(true);
    }

    private String getFileExtension(String location) {
        int extStartIndex = location.length() - 4;
        return location.substring(extStartIndex);
    }

    private void resize2() {
        int width = ((PpmPanel) jPanel1).getImageWidth() + 10;
        int height = ((PpmPanel) jPanel1).getImageHeight() + jMenuBar1.getHeight() + 30;
        this.setSize(width, height);
    }

    private void displayGuiMessage(String message, String windowTitle, int jOptionPaneMessageType) {
        JOptionPane.showMessageDialog(this, message, windowTitle, jOptionPaneMessageType);
    }

    private void openFile() {
        int openState = fChooser.showOpenDialog(this);

        if (openState == JFileChooser.APPROVE_OPTION) {
            File file = fChooser.getSelectedFile();
            String location = file.getAbsolutePath();
            String fileExt = getFileExtension(location);
            if (fileExt.compareTo(".ppm") == 0) {
                loadAndDisplayImage(location);
            } else {
                loadAndDisplayJPGImage(location);
            }
        }
    }

    private void saveFile() {
        if (isImageLoaded()) {
            int saveState = fChooser.showSaveDialog(this);

            if (saveState == JFileChooser.APPROVE_OPTION) {
                File file = fChooser.getSelectedFile();
                String location = file.getAbsolutePath();
                try {
                    imagePanel.saveImage(location);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } else {
            displayGuiMessage("Musisz otworzyć plik PPM z menu Plik -> Otworz", "", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu binaryzationMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu filterMenu;
    private javax.swing.JMenu histogramMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu otherMenu;
    private javax.swing.JMenu pointCalculationMenu;
    // End of variables declaration//GEN-END:variables

}
