package quizbogen;

public class MultipleChoice extends Quizfragen {
	
	String[] antworten = new String[4];

	public MultipleChoice(String frage, String[] antworten) {
		super(frage);
		this.antworten = antworten;
	}

	@Override
	public void ausgabe() {
		
		System.out.println("MultipleChoice: \n\n" + frage + "\n\nAntworten:\nA: " + antworten[0] + "\nB: " + antworten[1] + "\nC: " + antworten[2] + "\nD: " + antworten[3] );	
	}
}
