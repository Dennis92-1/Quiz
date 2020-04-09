package quizbogen;

public abstract class Quizfragen {
	
	String frage;
	
	public Quizfragen(String frage){
		this.frage = frage;	
	}
	
	public abstract void ausgabe();
	
}
