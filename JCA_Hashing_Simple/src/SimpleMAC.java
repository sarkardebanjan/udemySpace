import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

public class SimpleMAC {

	public static void main(String[] args) throws Exception{
		String simple = "A String";
		
		Mac mac = Mac.getInstance("HMACSHA256");
		
		mac.init(new SecretKeySpec("Password ".getBytes("UTF-8"), ""));
		
		byte[] ret = mac.doFinal(simple.getBytes("UTF-8"));
		
		System.out.println("Length of MAC: " + ret.length);
		for(byte b: ret){
			System.out.print(b + ", ");
		}
		
		String tobeverified = Hex.encodeHexString(ret);
		System.out.println();
		System.out.println(tobeverified);

	}

}
