package com.kreitek.editor;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws ExitException {
    	
    	Scanner in = new Scanner(System.in);
    	
        EditorFactory editorFactory = new EditorFactory();
        Editor editor = editorFactory.getEditor();
        editor.run();
    }

}
