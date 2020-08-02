import java.io.*;
import java.net.*;

   
class Server{
	 public static void main(String[] args) throws Exception {
	 	DatagramSocket server_socket = new DatagramSocket(1234);
	 	InetAddress IP_add = InetAddress.getByName("localhost");
	 	byte in_data[]=new byte[10];
	 		DatagramPacket Packet2 = new DatagramPacket(in_data,in_data.length);
	 		server_socket.receive(Packet2);
	 		String Str=new String(Packet2.getData());
	 		System.out.println(Str);
	 	




	 		 byte out_data[]=new byte[100]; 
	 	 Process p;
    try {
      p = Runtime.getRuntime().exec("cmd /c dir");

      p.waitFor(); 
      BufferedReader reader=new BufferedReader(new InputStreamReader(
                  p.getInputStream())); 
      String line; 
      while((line = reader.readLine()) != null) { 
        // System.out.println(line);

       
 		// String Str = user_input.readLine();
 		int port =Packet2.getPort();
 		out_data = line.getBytes();
 		DatagramPacket Packet3 = new DatagramPacket(out_data,out_data.length,IP_add,port);
 		server_socket.send(Packet3);

      } 
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();}

      server_socket.close();
        
	}
}