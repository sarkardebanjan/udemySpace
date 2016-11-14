import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class Helper {
	public static byte[] read(InputStream is) throws Exception{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] buf = new byte[1024 * 16];
		int len = 0;
		
		while(true){
			len = is.read(buf);
			if(len < 0) break;
			baos.write(buf, 0, len);
		}
		
		is.close();
		
		return baos.toByteArray();
	}
}
