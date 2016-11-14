import java.security.MessageDigest;

public class SimpleHash {

	public static void main(String[] args) throws Exception{
		String simple = "A String";
		
		MessageDigest md = MessageDigest.getInstance("MD5");
		
		byte[] ret = md.digest(simple.getBytes("UTF-8"));
		
		System.out.println("Length of Hash: " + ret.length);
		for(byte b: ret){
			System.out.print(b + ", ");
		}

	}

}
