package view.diagram;

import javax.swing.*;
import java.awt.*;

public class Table extends DiagramElement {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Dimension dim = new Dimension(90, 130);

    public Table(Point pos, Dimension dim, Color col) {
        this.setLocation(pos);
        this.setSize(this.dim);
        this.setBackground(col);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TableElementMouseListener mml = new TableElementMouseListener(this);
        addMouseListener(mml);
        addMouseMotionListener(mml);
    }

    @Override
    public void init() {
    	
    }
}

