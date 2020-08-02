import java.io.*;  
import java.net.*;  
public class Client {  
public static void main(String[] args) {  
try{      
	Socket s=new Socket("127.0.0.1",6666);  
	
	        System.out.println("Connected to Server"); 
  
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String input = reader.readLine();
             
           DataOutputStream out = new DataOutputStream(s.getOutputStream()); 
       	    out.writeUTF(input);

	
	 String str;
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		while(bufferedReader != null)
			System.out.println(bufferedReader.readLine());



		s.close();  
	}catch(Exception e){System.out.println(e);}  
  }  
}  