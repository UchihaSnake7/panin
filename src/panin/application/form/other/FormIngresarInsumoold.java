package panin.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import panin.application.utilities.*;

/**
 *
 * @author Raven
 */
public class FormIngresarInsumoold extends javax.swing.JPanel {

	public FormIngresarInsumoold() {
		initComponents();
		lb.putClientProperty(FlatClientProperties.STYLE, "" + "font:$h1.font");
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        sheader = new panin.application.utilities.SearchHeader();
        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Ingresar Insumo2");
        sheader.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
//                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(sheader, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
//                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addComponent(sheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel lb;
	private panin.application.utilities.SearchHeader sheader;
	// End of variables declaration//GEN-END:variables
}
