package pres;

import metier.MetierImpl;
import dao.DaoImpl;

public class Presentation {

	public static void main(String[] args) {
		DaoImpl dao = new DaoImpl();
		MetierImpl metier = new MetierImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());
	}
}
