package view.diagram;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

public class Link extends DiagramElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Point positionStart  = new Point(2, 2);
	private Point positionEnd  = new Point(4, 4);
	
	public Link() {
		
	}
	
	public Link(Point positionStart) {
        this.setBackground(Color.BLACK);
		this.positionStart = positionStart != null ? positionStart : this.positionStart;
		this.positionEnd = positionEnd != null ? positionEnd : this.positionEnd;
	}
	
	public Link(Point positionStart , Point positionEnd) {
		this.positionStart = positionStart != null ? positionStart : this.positionStart;
		this.positionEnd = positionEnd != null ? positionEnd : this.positionEnd;
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		Line2D lin = new Line2D.Float(positionStart.x, positionStart.y, positionEnd.x, positionEnd.y);
	    g2d.draw(lin);
	}
	
	@Override
	public void init() {}
}
