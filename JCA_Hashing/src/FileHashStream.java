import java.io.FileInputStream;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;

public class FileHashStream {

	public static void main(String[] args) throws Exception{
		String path = "C:\\Users\\user\\Downloads\\commons-codec-1.10-bin.zip";

		MessageDigest md = MessageDigest.getInstance("MD5");

		byte[] buf = new byte[1024 * 16];
		int len = 0;

		FileInputStream is = new FileInputStream(path);
		
		while(true){
			len = is.read(buf);
			if(len < 0) break;
			md.update(buf, 0, len);
		}
		
		is.close();
		
		byte[] ret = md.digest();
		
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
