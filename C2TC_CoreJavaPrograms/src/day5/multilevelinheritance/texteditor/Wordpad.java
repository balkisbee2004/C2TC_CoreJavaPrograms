package day5.multilevelinheritance.texteditor;

public class Wordpad extends Notepad{
	//Program to define child class Wordpad with formatting text feature

	    private boolean isBold;

	    public Wordpad() {
	        super();
	        this.isBold = false;
	    }

	    public void formatText(boolean bold) {
	        if (bold) {
	            content = "<b>" + content + "</b>";
	        }
	        isBold = bold;
	    }

	    public boolean isBold() {
	        return isBold;
	    }
	}


