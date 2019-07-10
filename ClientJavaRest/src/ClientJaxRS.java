import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
 
public class ClientJaxRS {

	public static void main(String[] args) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		URI uri = UriBuilder.fromUri("http://localhost:8080/LibraryRestWebService2/rest/").build();
		WebResource service = client.resource(uri);
		WebResource path = service.path("books");
		String res = path.get(String.class);
		System.out.println(res);
	}

}
