import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class URL_Open {


	public static void main(String[] a) {
	    try {
	      URI uri = new URI("www.google.com");
	      Desktop desktop = null;
	      if (Desktop.isDesktopSupported()) {
	        desktop = Desktop.getDesktop();
	      }

	      if (desktop != null)
	        desktop.browse(uri);
	    } catch (IOException ioe) {
	      ioe.printStackTrace();
	    } catch (URISyntaxException use) {
	      use.printStackTrace();
	    }

	  }

}
