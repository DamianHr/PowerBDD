package view.diagram;

import java.awt.Dimension;
import java.awt.Point;

public class Anchor extends DiagramElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Point pos;
	private Dimension dim = new Dimension(7, 7);
	
	public Anchor(Point pos, Dimension dim) {
		this.pos = pos;
		this.dim = dim != null ? dim : this.dim;
	}
	
	public Point getCenterPoint() {
		return new Point(pos.x - dim.width / 2, pos.y - dim.height / 2);
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
	}
}
