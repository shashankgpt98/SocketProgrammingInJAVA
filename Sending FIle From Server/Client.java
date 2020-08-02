import java.io.*;
import java.net.*;

public class Client{
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\HP\\Desktop\\Distributed Lab\\Lab2\\Sending FIle From Server\\recived.txt";
		byte []b = new byte[10002];
		Socket sr = new Socket("localhost",4333);

		System.out.println("Reciving File.....");
		System.out.println("Complete");
		InputStream is=sr.getInputStream();
		FileOutputStream fr = new FileOutputStream(path);
		is.read(b,0,b.length);
		fr.write(b,0,b.length);
	}
}