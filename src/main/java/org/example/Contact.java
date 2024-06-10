package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class Contact implements Editable, Serializable {
    private String name;
    private String relationship;

    public ItemEditor getEditor() {
        return new ContactEditor();
    }

    private class ContactEditor implements ItemEditor, Serializable {
        private transient JPanel panel;
        private transient JTextField nameField;
        private transient JTextField relationshipField;

        public JComponent getGUI() {
            if(panel == null) {
                panel = new JPanel();
                nameField = new JTextField(name);
                relationshipField = new JTextField(relationship);

                panel.setLayout(new GridLayout(2,2));
                panel.add(new JLabel("Name:"));
                panel.add(nameField);
                panel.add(new JLabel("Relationship"));
                panel.add(relationshipField);
            } else {
                nameField.setText(name);
                relationshipField.setText(relationship);
            }
            return panel;
        }

        public void commitChanges() {
            if(panel != null) {
                name = nameField.getText();
                relationship = relationshipField.getText();
            }
        }

        public String toString() {
            return "\nContact:\n" +
                    "   Name: " + name + "\n" +
                    "   Relationship: " + relationship;
        }
    }
}
