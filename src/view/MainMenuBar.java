package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainMenuBar extends JMenuBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4352341802466235417L;

	public MainMenuBar()
	{
		setMenuFile();
		setMenuEdit();
		setMenuHelp();
	}
	
	private void setMenuFile()
	{
		JMenu menuFile = new JMenu("Fichier");
		this.add(menuFile);
		JMenuItem menuItemNew = new JMenuItem("Nouveau");
		menuFile.add(menuItemNew);
		JMenuItem menuItemOpen = new JMenuItem("Ouvrir");
		menuFile.add(menuItemOpen);
		JMenuItem menuItemSave = new JMenuItem("Enregistrer");
		menuFile.add(menuItemSave);
		JMenuItem menuItemSaveAs = new JMenuItem("Enregistrer sous");
		menuFile.add(menuItemSaveAs);
		JMenuItem menuItemExit = new JMenuItem("Quitter");
		menuFile.add(menuItemExit);
	}
	private void setMenuEdit()
	{
		JMenu menuEdit = new JMenu("Edition");
		this.add(menuEdit);
		JMenuItem menuItemCopy = new JMenuItem("Copier");
		menuEdit.add(menuItemCopy);
		JMenuItem menuItemCut = new JMenuItem("Couper");
		menuEdit.add(menuItemCut);
		JMenuItem menuItemPast = new JMenuItem("Coller");
		menuEdit.add(menuItemPast);
	}
	private void setMenuHelp()
	{
		JMenu menuHelp = new JMenu("Aide");
		this.add(menuHelp);
		
		JMenuItem menuItemAbout = new JMenuItem("A propos");
		menuHelp.add(menuItemAbout);
		
		JMenuItem menuItemHelp = new JMenuItem("Aide");
		menuHelp.add(menuItemHelp);
	}
}
