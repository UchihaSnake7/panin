package panin.application.utilities;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

public class SearchHeader extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public SearchHeader() {
		setBackground(new Color(255, 0, 255));
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);
		g2.setColor(getBackground());
		g2.fillRoundRect(0, 0, getWidth(), 200, 200, 200);
		g2.fillRect(0, 0, 25, getHeight());
		g2.fillRect(getWidth()-50, getHeight()-200, getWidth(), getHeight());
		// TODO Auto-generated method stub
		super.paintComponent(g);
	}

}
