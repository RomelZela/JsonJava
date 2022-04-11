package com.kreitek.editor;

import java.util.Scanner;

public class EditorFactory {
    public Editor getEditor() throws ExitException {
    	
    	Scanner in = new Scanner(System.in);

    	System.out.println("Press \"J\" for JSON. Or"
    			+ " Press \"C\" for Console");
       	String letterOptionPrint = in.next();
       	
       	letterOptionPrint = letterOptionPrint.toUpperCase();
       	
        return switch (letterOptionPrint) {
        case "J" -> JsonEditor();
        case "C" -> ConsoleEditor();
        default -> throw new ExitException();
    };
    }

	private Editor JsonEditor() {
		// TODO Auto-generated method stub
		return new JsonEditor();
	}

	private Editor ConsoleEditor() {
		// TODO Auto-generated method stub
		return new ConsoleEditor();
	}
}
