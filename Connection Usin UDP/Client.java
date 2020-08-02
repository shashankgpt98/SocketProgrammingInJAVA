import java.io.*;
import java.net.*;
class Client{
	 public static void main(String[] args) throws Exception{
		BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));
 		DatagramSocket client_socket=new DatagramSocket();
 		InetAddress IP_add = InetAddress.getByName("localhost");
 		byte out_data[]=new byte[1024]; 
 		String Str = user_input.readLine();
 		out_data = Str.getBytes();
 		DatagramPacket Packet1 = new DatagramPacket(out_data,out_data.length,IP_add,1234);
 		client_socket.send(Packet1);


 		

 		if(Str.equals("1")){
 			Process p = Runtime.getRuntime().exec("cmd /c date");
	
        BufferedReader pRead = new BufferedReader(new InputStreamReader(p.getInputStream()));

                String line;
                while ((line = pRead.readLine()) != null) {
                     System.out.println(line);
                    
                    
                }
 		}

 		else if(Str.equals("0"))
 		{

	 	 while(true){

	 	 	byte in_data[]=new byte[50];
	 		DatagramPacket Packet4 = new DatagramPacket(in_data,in_data.length);
	 		client_socket.receive(Packet4);
	 		String abc=new String(Packet4.getData());
	 		System.out.println(abc);
	 		}
		}

		client_socket.close();

 		
	}
}