import java.io.*;
import javax.xml.bind.*;

public class Banque2 {
	public static void main (String[] args) throws Exception {
		JAXBContext jc=JAXBContext.newInstance(Compte.class);
		Unmarshaller unmarshaller=jc.createUnmarshaller();
		Compte cp = (Compte) unmarshaller.unmarshal(new File("comptes.xml"));
		System.out.println(cp.getCode()+"-"+cp.getSolde()+"-"+cp.getDateCreation());
	}
}
