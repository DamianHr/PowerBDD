package view.diagram;

import javax.swing.JPanel;

public abstract class DiagramElement extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DiagramElement(){}
	
	public abstract void init();
}
