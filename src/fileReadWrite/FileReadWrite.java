package fileReadWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("abc");
		writer.write("abcccddd");
		writer.close();
		FileReader reader = new FileReader("abc");
		BufferedReader br = new BufferedReader(reader);
		char[] cbuf = new char[254];
		StringBuilder sb = new StringBuilder();
		while (true) {
			int index = br.read(cbuf);
			if (index < 0) {
				break;
			}
			sb.append(cbuf, 0, index);
		}
		br.close();

		System.out.println(sb.toString());
		writer = new FileWriter("abc");
		writer.append("abc");
		writer.close();
		reader = new FileReader("abc");
		br = new BufferedReader(reader);
		cbuf = new char[254];
		sb = new StringBuilder();
		while (true) {
			int index = br.read(cbuf);
			if (index < 0) {
				break;
			}
			sb.append(cbuf, 0, index);
		}
		br.close();
		System.out.println(sb.toString());
	}
}
