package aboutStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestFileInputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("c.txt");
		BufferedOutputStream boStream = new BufferedOutputStream(fos);
		boStream.write(200);
		boStream.close();//need close() or flush()
		FileInputStream fiStream = new FileInputStream("c.txt");
		byte[] b = new byte[4];
		int index = fiStream.read(b);
		System.out.println(Arrays.toString(b));

	}
}
