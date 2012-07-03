package view.query;

import javax.swing.*;

public class QueryFrame extends JFrame{

    private static final long serialVersionUID = 1L;

    public QueryFrame()
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
        /*this.setTitle("Requêtes");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);
        //this.add(new QueryEditor(), BorderLayout.NORTH);
        this.add(new JSplitPane(JSplitPane.VERTICAL_SPLIT), BorderLayout.EAST);
        //this.add(new QueryResultTable(),  BorderLayout.SOUTH);
        this.add(new QueryTableTree(),  BorderLayout.WEST);  */




        JSplitPane splitH = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        JSplitPane splitV = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        this.add(splitH);

        splitH.setLeftComponent(new QueryTableTree());
        splitH.setRightComponent(splitV);

        splitV.setLeftComponent(new QueryEditor("Lol"));
        splitV.setRightComponent(new QueryResultTable());

        this.setVisible(true);
    }
}
