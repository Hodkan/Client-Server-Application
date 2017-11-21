import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class ClientClass {

   public static void main(String [] args) {
      String serverName = args[0];                  // gets host name
      int port = Integer.parseInt(args[1]);         // gets port number
      try {
         System.out.println("Connecting to " + serverName + " on port " + port);        // Displays message before connection
         Socket client = new Socket(serverName, port);          // creates socket for connection
         
         System.out.println("Just connected to " + client.getRemoteSocketAddress());        // Displays message after connection
         OutputStream outToServer = client.getOutputStream();                       // get input/output streams
         DataOutputStream out = new DataOutputStream(outToServer);
         
         out.writeUTF("Hello from " + client.getLocalSocketAddress() + ", I hope you are fine!");
         InputStream inFromServer = client.getInputStream();
         DataInputStream in = new DataInputStream(inFromServer);
         
         System.out.println("Server says " + in.readUTF());
         client.close();                          //Closes connection
      }catch(IOException e) {           //Error handling
         e.printStackTrace();
      }
   }
}
