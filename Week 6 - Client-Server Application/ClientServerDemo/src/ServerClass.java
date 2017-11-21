
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServerClass extends Thread {
   private ServerSocket serverSocket;
   
   public ServerClass(int port) throws IOException {
      serverSocket = new ServerSocket(port);
      serverSocket.setSoTimeout(10000);
   }

   public void run() {
      while(true) {
         try {
            System.out.println("Waiting for client on port " +                  // Prints message before connection
               serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();                              //// wait, listen and accept connection
            
            System.out.println("Just connected to " + server.getRemoteSocketAddress());     // Prints message after connection
            DataInputStream in = new DataInputStream(server.getInputStream());              // Receives message from client
            
            System.out.println(in.readUTF());
            DataOutputStream out = new DataOutputStream(server.getOutputStream());
            out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()        // sends message to client
               + "\nI am fine. You are very kind stranger! Goodbye for now!");
            server.close();                                                         //Disconnects
            
         }catch(SocketTimeoutException s) {
            System.out.println("Socket timed out!");
            break;
         }catch(IOException e) {
            e.printStackTrace();
            break;
         }
      }
   }
   
   public static void main(String [] args) {
      int port = 1234;                      // server is on port 1234
      try {
         Thread t = new ServerClass(port);
         t.start();
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
}
