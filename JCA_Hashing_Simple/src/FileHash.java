import java.io.FileInputStream;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;

public class FileHash {

	public static void main(String[] args) throws Exception{
		String path = "C:\\Users\\user\\Downloads\\commons-codec-1.10-bin.zip";
		
		byte[] file = Helper.read(new FileInputStream(path));
		
		MessageDigest md = MessageDigest.getInstance("MD5");
		
		byte[] ret = md.digest(file);
		
		System.out.println("Length of Hash: " + ret.length);
		for(byte b: ret){
			System.out.print(b + ", ");
		}
		
		
		String compare = "59b6046b8cb5bf48c3b2e63bb4424779";
		
		String tobeverified = Hex.encodeHexString(ret);
		
		System.out.println();
		System.out.println("===");
		System.out.println(tobeverified);
		System.out.println("Equals? " + tobeverified.equals(compare));

	}

}
