package org.example;

/*
    RunPattern - Runs this code by creating a Contact and an EditorGui object.
 */
public class RunPattern {
    public static void main(String[] args) {
        System.out.println("Example showing use of Factory Pattern");
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Creating a Contact Object");
        Contact someone = new Contact();
        System.out.println("Creating a GUI Editor for Contact");
        EditorGui runner = new EditorGui(someone.getEditor());
        runner.createGui();
        System.out.println("---- ---- ---- ---- ----");
    }
}