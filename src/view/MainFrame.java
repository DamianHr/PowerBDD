package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainFrame()
	{
			Runnable r = new Runnable() {
			
			@Override
			public void run() {
				launch();
			}
		};
		SwingUtilities.invokeLater(r);
	}
	
	private void launch()
	{
		this.setSize(800, 600);
		this.setTitle("Power DataBase");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.WHITE);
		//invoke the components of the window
		this.setJMenuBar(new MainMenuBar());
		this.add(new DrawingToolbar());
		this.setLayout(null);

		this.setVisible(true);

		DiagramFactory d = new DiagramFactory(this.getLayeredPane());
        this.setContentPane(d);
		d.init(this);
	}
}
