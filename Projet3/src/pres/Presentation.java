package pres;

import java.io.*;
import java.lang.reflect.*;
import java.util.Scanner;

import metier.IMetier;
import dao.IDao;

public class Presentation {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(new File("ressources/config.txt"));
			String daoClassname = scanner.next();
			String metierClassName = scanner.next();
			Class cdao = Class.forName(daoClassname);
			IDao dao = (IDao) cdao.newInstance();
			Class cmetier = Class.forName(metierClassName);
			IMetier metier = (IMetier) cmetier.newInstance();
			Method meth = cmetier.getMethod("setDao",
					new Class[] { IDao.class });
			meth.invoke(metier, new Object[] { dao });
			System.out.println(metier.calcul());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}