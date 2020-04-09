package quizGUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class QuizFenster implements ActionListener{
	
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	JLabel frage;
	JButton ant[] = new JButton[4];
	
	//Fennster
	JFrame w1;
	JProgressBar progressBar;
	
	int loesung, richtig;
	
	public static void main(String[]args) {
		
		new FrageChange();	
	}
	
	public QuizFenster() {
		
		w1 = new JFrame();
		w1.setSize(400,400);
		//mittig setzen
		w1.setLocation( (int) ((dim.getWidth()-400))/2, (int) ((dim.getHeight()-300)/2) ) ;
		w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w1.setVisible(true);
		w1.setLayout(null);
		
		//Buttons
		ant[0] = new JButton("   ");
		ant[0].setBounds(52,90,120,40);
		ant[0].addActionListener(this);
		
		ant[1] = new JButton("   ");
		ant[1].setBounds(52,160,120,40);
		ant[1].addActionListener(this);
		
		ant[2] = new JButton("   ");
		ant[2].setBounds(220,90,120,40);
		ant[2].addActionListener(this);
		
		ant[3] = new JButton("   ");
		ant[3].setBounds(220,160,120,40);
		ant[3].addActionListener(this);
		
		//Buttons dem Fenster hinzufügen
		w1.add(ant[0]);
		w1.add(ant[1]);
		w1.add(ant[2]);
		w1.add(ant[3]);
		
		frage = new JLabel("Hier steht die Frage!");
		frage.setBounds(52, 15, 250, 40);
		w1.add(frage);
		
		progressBar = new JProgressBar(0,100);
		progressBar.setBounds(120,220,140,25);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		w1.add(progressBar);
	}
	
	public void aendereButtonText(int button, String text) {
		
		ant[button-1].setText(text);
	}
	
	public void aendereLabelText(String text) {
		frage.setText(text);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		for (int i = 0; i < ant.length; i++) {
		
			if(e.getSource() == ant[i]) {
				if(loesung == (i+1)) {
					nachricht("Richtig!", "Weiter so!");
					prozent();
					FrageChange.neueFrage();
				}else {
					nachricht("Falsch","Nicht so ...");
				}
			}
		}
	
	}
	
	public void nachricht(String aussage, String info) {
		
		Object[] options = { "OK"};
		JOptionPane.showOptionDialog(null, aussage, info, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		
	}
	
	public void prozent() {
		if(richtig <= Fragen.frage.length()) {
			richtig +=1;
			prozentrechnung(richtig, (Fragen.frage.length() +1));
		}else {
			nachricht("Super!", "Herzlichen GLückwunsch!");
			System.exit(0);
		}
	}
	
	public void prozentrechnung(int richtigBeantworteteFragen, int gesamt) {
		
		///???
		System.out.println(richtigBeantworteteFragen + "   " + gesamt);
		System.out.println(100/gesamt*richtigBeantworteteFragen);
		progressBar.setValue((int) 100/gesamt*richtigBeantworteteFragen);
	}

}
