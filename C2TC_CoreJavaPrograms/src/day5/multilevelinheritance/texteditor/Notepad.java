package day5.multilevelinheritance.texteditor;

public class Notepad {
	//Program to define class Notepad 
	
	    protected String content;

	    public Notepad() {
	        this.content = "";
	    }

	    public void write(String text) {
	        content += text;
	    }

	    public void displayContent() {
	        System.out.println("Notepad Content: " + content);
	    }
	

}
