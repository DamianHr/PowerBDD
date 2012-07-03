package view;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.*;

import view.diagram.Link;

import view.diagram.DiagramElement;
import view.diagram.Table;

public class DiagramFactory extends JPanel{

	private ArrayList<DiagramElement> drawingLinks;
	private ArrayList<DiagramElement> drawingBoxs;

    private JLayeredPane layeredPane;
	private Boolean displayBackgroundGrid = false;
    private int ZIndex = 0;

	public DiagramFactory(JLayeredPane layeredPane)
	{
        this.layeredPane = layeredPane;
		drawingLinks = new ArrayList<DiagramElement>();
		drawingBoxs = new ArrayList<DiagramElement>();
	}
	
	public void init(JFrame frame) {
        this.setBackground(Color.WHITE);
		drawBackground(frame.getGraphics());

		Table table0 = new Table(new Point(0, 0), null, Color.RED);
        addToDiagram(table0);
		Table table1 = new Table(new Point(120, 120), null, Color.BLUE);
        addToDiagram(table1);
		Table table2 = new Table(new Point(320, 20), null, Color.YELLOW);
        addToDiagram(table2);

		Link link0 = new Link(new Point(5, 5));
        addToDiagram(link0);
		Link link1 = new Link(new Point(60, 60));
        addToDiagram(link1);
	}

    private void addToDiagram(DiagramElement element) {
        //Correct the position
        element.setLocation(element.getLocation().x, element.getLocation().y+23);

        layeredPane.add(element, new Integer(ZIndex));
        if(element instanceof Table)   drawingBoxs.add(element);
        else  drawingLinks.add(element);

        ZIndex ++;
    }

	private void drawBackground(Graphics g) {
		int hSpacing = 20;
		int vSpacing = 20;
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
		for (int x = 0; x < this.getWidth(); x+=vSpacing) {
			for (int y = 0; y < this.getHeight(); y+=hSpacing) {
				g2d.draw(new Line2D.Double(x, y, x, y));
			}
		}
	}
}
