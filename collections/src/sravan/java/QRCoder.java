package sravan.java;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCoder {
public static void main(String[] args) throws IOException {
	String string = "9922446233 - Sravan Kumar Addani";
	
	ByteArrayOutputStream out = QRCode.from(string).to(ImageType.PNG).stream();
	File f = new File("C:\\Users\\addkumar\\Desktop\\sravan\\practice\\QR codes\\Tumbu.jpg");
	FileOutputStream fos = new FileOutputStream(f);
	fos.write(out.toByteArray());
	fos.flush();
}
}
