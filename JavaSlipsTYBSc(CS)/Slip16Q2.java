import java.awt.*;
import java.awt.event.*;

class MenuExample {
    private Frame frame;

    public MenuExample() {
        frame = new Frame("Java Menu Example");
        frame.setSize(400, 300);

        // Create a menu bar
        MenuBar menuBar = new MenuBar();

        // Create File menu
        Menu fileMenu = new Menu("File");

        // Create File menu items
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem openMenuItem = new MenuItem("Open");
        MenuItem saveMenuItem = new MenuItem("Save");

        // Add File menu items to the File menu
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        
        // Add a separator
        fileMenu.addSeparator();

        // Create Show About menu item with a tick separator
        CheckboxMenuItem showAboutMenuItem = new CheckboxMenuItem("Show About");
        fileMenu.add(showAboutMenuItem);

        // Add a separator
        fileMenu.addSeparator();

        // Create Exit menu item
        MenuItem exitMenuItem = new MenuItem("Exit");
        fileMenu.add(exitMenuItem);
        
        // Create Edit menu
        Menu editMenu = new Menu("Edit");

        // Create Edit menu items (you can add more if needed)
        MenuItem cutMenuItem = new MenuItem("Cut");
        MenuItem copyMenuItem = new MenuItem("Copy");
        MenuItem pasteMenuItem = new MenuItem("Paste");

        // Add Edit menu items to the Edit menu
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        // Create About menu
        Menu aboutMenu = new Menu("About");

        // Create About menu item
        MenuItem aboutMenuItem = new MenuItem("About");

        // Add About menu item to the About menu
        aboutMenu.add(aboutMenuItem);

        // Add File, Edit, and About menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);

        // Set the menu bar to the frame
        frame.setMenuBar(menuBar);

        // Add a WindowListener to handle the exit operation
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}

public class Slip16Q2 {
    public static void main(String[] args) {
        new MenuExample();
    }
}