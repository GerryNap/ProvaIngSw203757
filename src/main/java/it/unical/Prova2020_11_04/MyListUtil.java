package it.unical.Prova2020_11_04;

import java.util.ArrayList;
import java.util.List;

public class MyListUtil {
	public ArrayList<Integer> ordina(int scelta, List<Integer> list) {
		switch(scelta) {
			case 1:
				return crescente(list);
			case 2:
				return decrescente(list);
			default:
				return new ArrayList<Integer>(list);
		}
	}
	
	public ArrayList<Integer> crescente(List<Integer> list) {
		ArrayList<Integer> tmp = new ArrayList<>(list);
		for(int i = 0; i < tmp.size() - 1; i++) {
			for(int j = i + 1; j < tmp.size(); j++) {
				if(tmp.get(i) > tmp.get(j)) {
					Integer n = tmp.get(i);
					tmp.set(i, tmp.get(j));
					tmp.set(j, n);
				}
			}
		}
		return tmp;
	}
	
	public ArrayList<Integer> decrescente(List<Integer> list) {
		ArrayList<Integer> tmp = new ArrayList<>(list);
		for(int i = 0; i < tmp.size() - 1; i++) {
			for(int j = i + 1; j < tmp.size(); j++) {
				if(tmp.get(i) < tmp.get(j)) {
					Integer n = tmp.get(i);
					tmp.set(i, tmp.get(j));
					tmp.set(j, n);
				}
			}
		}
		return tmp;
	}
}
