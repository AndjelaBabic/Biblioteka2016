package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub
		if(knjiga==null || knjige.contains(knjiga)){
			throw new RuntimeException("Greska pri unosu!");
		}
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub
		if(knjiga==null || !knjige.contains(knjiga)){
			throw new RuntimeException("Greska pri brisanju!");
		}
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		// TODO Auto-generated method stub
		if(naslov==null){
			throw new RuntimeException("Naslov ne sme biti null!");
		}
		LinkedList<Knjiga> rezultat = new LinkedList<>();
		for (int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).getNaslov().equals(naslov)){
				rezultat.add(knjige.get(i));
			}
		}
		return rezultat;
	}

}
