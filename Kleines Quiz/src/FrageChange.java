
public class FrageChange {
	
	static String richtigeFrage = null;
	static String Option1 = null;
	static String Option2 = null;
	static String Option3 = null;
	static String Option4 = null;
	static int lösung = 0;
	
	static QuizFenster quiz;
	static Fragen frageKlasse;
	static String aktuelleFrage;
	
	
	public FrageChange() {
		
		quiz = new QuizFenster();
		neueFrage();
	}
	
	public static void neueFrage() {
		frageKlasse = new Fragen();
		aktuelleFrage = Fragen.frage;
		
		parser();
		aendereText();
	}

	public static void parser() {
		
		String[] frage = aktuelleFrage.split("\\$");
			
		for (int i = 0; i < frage.length; i++) {
			
			switch(i) {
			
			case 0 :
				richtigeFrage = frage[i];
				break;
			case 1 : 
				Option1 = frage[i];
				break;
			case 2 : 
				Option2 = frage[i];
				break;
			case 3 : 
				Option3 = frage[i];
				break;
			case 4 : 
				Option4 = frage[i];
				break;
			case 5:
				lösung = Integer.parseInt(frage[i]);
			}	
		}
		//Test
		//System.out.println(richtigeFrage);
		//System.out.println(Option1);
	}
	
	public static void aendereText() {
	
		quiz.aendereLabelText(richtigeFrage);
		quiz.loesung = lösung;
		quiz.aendereButtonText(1, Option1);
		quiz.aendereButtonText(2, Option2);
		quiz.aendereButtonText(3, Option3);
		quiz.aendereButtonText(4, Option4);
	}
}
