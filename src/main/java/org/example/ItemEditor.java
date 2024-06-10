package org.example;

import javax.swing.*;

/*
    ItemEditor interface - provides 2 methods
        (i)  getGUI() method - another factory method that returns JComponent that provides a Swing GUI to edit current item
        (ii) commitChanges() - allows UI to tell editor that user wants to finalize changes
 */
public interface ItemEditor {
    public JComponent getGUI();
    public void commitChanges();
}
