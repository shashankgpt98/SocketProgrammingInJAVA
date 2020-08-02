import java.io.*;
import java.net.*;

public class Server{
	 public static void main(String[] args) throws Exception{
	 	String path = "C:\\Users\\HP\\Desktop\\Distributed Lab\\Lab2\\Sending FIle From Server\\sending.txt";
		ServerSocket s = new ServerSocket(4333);
		Socket sr=s.accept();
		System.out.println("Connected !!");
		System.out.println("Sending File.....");
		System.out.println("Complete");
		FileInputStream fr=new FileInputStream(path);
		byte b[]=new byte[1002];
		fr.read(b,0,b.length);
		OutputStream Os = sr.getOutputStream();
		Os.write(b,0,b.length);
	}
}