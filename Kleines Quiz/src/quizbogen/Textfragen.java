package quizbogen;

public class Textfragen extends Quizfragen {

	public Textfragen(String frage) {
		super(frage);	
	}

	@Override
	public void ausgabe() {
		System.out.println("Textfrage: \n\n" + frage);
		
	}
	
}
