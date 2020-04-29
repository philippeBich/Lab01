package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.*;

public class Parole {
		
	List<String> lista;
	
	public Parole() {
		lista = new LinkedList<String>();
		//lista = new ArrayList<String>(1);
	}
	
	public void addParola(String p) {
		lista.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(lista);
		return lista;
	}
	
	public void reset() {
		lista.clear();
	}
	
	public void removeParola(String string) {
		lista.remove(string);
	}

}
