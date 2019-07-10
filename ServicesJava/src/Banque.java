
import java.io.File;
import java.util.Date;
import javax.xml.bind.*;

public class Banque {
	public static void main (String[] args) throws Exception {
		JAXBContext context=JAXBContext.newInstance(Compte.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		Compte cp = new Compte(1,8000,new Date());
		marshaller.marshal(cp, new File("comptes.xml"));
	}
}
