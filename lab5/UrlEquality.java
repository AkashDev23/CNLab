package lab5;
import java.net.*;
public class UrlEquality {
	public static void main(String[] args) {
try {
	URL www= new URL ("http://www.ibiblio.com");
	URL ibiblio=new URL("http://ibiblio.com");
	if (ibiblio.equals(www)) {
		System.out.println(ibiblio+"is the same as"+www);
	}else {
		System.out.println(ibiblio+"is not the same as"+www);
		
	}
}catch(MalformedURLException ex) {
	System.err.println(ex);
}
	}

}
