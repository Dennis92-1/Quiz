package quizGUI;

public class Fragen {
	
	int zufall;
	String fragen[] = new String[5];
	static String frage;
	
	public Fragen() {
		
		fragen[0] = "Was ist die Hauptstadt von Deutschland?$München$Berlin$Hamburg$Nürnberg$2";
		fragen[1] = "Was hat Gandhi studiert?$Medizin$Jura$Journalismus$Nichts$2";
		fragen[2] = "Was ist am 21.12.2012 passiert?$Weltuntergang$Weltbibeltag$Nichts$Weihnachten$3";
		fragen[3] = "Was passiert am 24.12.2021=$Weltuntergang$Weltbibeltag$Nichts$Weihnachten$4";
		
		frage = fragen[zufall(1,2)];
	}
	
	public int zufall(int min, int max) {
		zufall = (int) (Math.random()*max) +1;
		
		return zufall;
	}
	

}
