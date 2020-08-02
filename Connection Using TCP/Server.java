import java.io.*;  
import java.net.*;  
public class Server {  
public static void main(String[] args){  
try{  
	ServerSocket ss=new ServerSocket(6666);

	System.out.println("Server started"); 
    System.out.println("Waiting for a client ...");  
	
	Socket s=ss.accept();//establishes connection 
	System.out.println("Connected to Client !!");  
	
	DataInputStream dis=new DataInputStream(s.getInputStream());  
	String  str=(String)dis.readUTF();  
	// System.out.println("message= "+str); 
	String command;
	if(str.equals("0"))
		command = "cmd /c dir";
	else command = "cmd /c date"; 

	DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	

		Process p = Runtime.getRuntime().exec(command);
		command="";
        BufferedReader pRead = new BufferedReader(new InputStreamReader(p.getInputStream()));

                String line;
                while ((line = pRead.readLine()) != null) {
                     // System.out.println(line);
                    dos.writeUTF(line + "\n");
                    dos.flush();
                    
                }

	 ss.close();  
	}catch(Exception e){System.out.println(e);}  
	}	  
}