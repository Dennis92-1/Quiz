package quizbogen;

public class Quizbogen {
	
	public static void main (String[]args){
		
		Quizfragen[] quiz = new Quizfragen[6];
		
		quiz[0] = new Textfragen("Wie groﬂ ist Manuel Neuer?");
		quiz[1] = new Textfragen("Wie viele Menschen hat Deutschland?");
		quiz[2] = new Textfragen("Welches Datum haben wir heute?");
		
		quiz[3] = new MultipleChoice("Wie groﬂ ist Manuel Neuer?", new String[]{"160 cm","190 cm", "193 cm", "177 cm"});
		quiz[4] = new MultipleChoice("Wie viele Menschen hat Deutschland?", new String[]{"82 Mio.","82,67 Mio", "83 Mio.", "12"});
		quiz[5] = new MultipleChoice("Welches Datum haben wir heute?", new String[]{"12.12.17","12.10.17", "13.10.17", "15.12.16"});
		
		
		for (int i = 0; i < quiz.length; i++){
			
			quiz[i].ausgabe();
			
			if(i+1 < quiz.length){						//Absatz nach der Frage
				System.out.println("\n\n\n");
			}	
		}	
	}
}
