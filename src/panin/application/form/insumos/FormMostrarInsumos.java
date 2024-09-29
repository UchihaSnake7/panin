/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panin.application.form.insumos;

import java.awt.Scrollbar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import panin.application.utilities.ScrollBar;
import panin.application.utilities.WrapLayout;
import panin.model.Model_Card;

/**
 *
 * @author USUARIO
 */
public class FormMostrarInsumos extends javax.swing.JPanel {

    /**
     * Creates new form FormMostrarInsumos
     */
    public FormMostrarInsumos() {
        initComponents();
        init();
    }

    private void init() {
        panel.setLayout(new WrapLayout(WrapLayout.LEADING));
        jScrollPane1.setVerticalScrollBar(new ScrollBar());

//        ImageIcon icon = new ImageIcon((getClass().getResource("/PANIN/src/panin/imagenes/insumos"))); 
//        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), "Stock Total", "$200000", "Increased by 60%"));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/1.png"))), "Harina de Trigo", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/3.png"))), "Huevos", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/1.png"))), "Harina de Trigo", "", "Descripcion"), getBackground()));
         panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/3.png"))), "Huevos", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/1.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
 panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/1.png"))), "Harina de Trigo", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/3.png"))), "Huevos", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/1.png"))), "Harina de Trigo", "", "Descripcion"), getBackground()));
         panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/3.png"))), "Huevos", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/1.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
         panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/1.png"))), "Harina de Trigo", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/3.png"))), "Huevos", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/1.png"))), "Harina de Trigo", "", "Descripcion"), getBackground()));
         panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/3.png"))), "Huevos", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/1.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.add(new Card(new Model_Card(new ImageIcon((getClass().getResource("/panin/imagenes/insumos/2.png"))), "Mantequilla", "", "Descripcion"), getBackground()));
        panel.revalidate();
        panel.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        jScrollPane1.setBorder(null);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
