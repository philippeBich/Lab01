package it.polito.tdp.parole.Test;

import java.util.ArrayList;
import it.polito.tdp.parole.model.Parole;

public class TestClass {
	
	public void run() {
		Parole par = new Parole();
		double addTime=0.0;
		double removeTime=0.0;
		DAO dao = new DAO();
		
		ArrayList<String> elenco = new ArrayList<>(dao.getWords());
		
		for(String parola : elenco) {
			double start = System.nanoTime();
			par.addParola(parola);
			double end = System.nanoTime();
			addTime+=end-start;
		}
		
		addTime=addTime/elenco.size();
		
		for(String parola : elenco) {
			double start = System.nanoTime();
			par.removeParola(parola);
			double end = System.nanoTime();
			removeTime+=end-start;
		}
		
		removeTime=removeTime/elenco.size();
		
		System.out.println("TEMPO ADD (medio): " + addTime +" - TEMPO REMOVE (medio): " + removeTime +"\n");
	}
	
	

	public static void main(String[] args) {
		TestClass test = new TestClass();
        test.run();
    }
}
