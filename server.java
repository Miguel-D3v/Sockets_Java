 import java.io.IOException;
 import java.net.ServerSocket;
 import java.net.Socket;
 import java.util.Scanner;

  public class server{
    public static void main(String[] args)throws IOException {
      ServerSocket Server = new ServerSocket(8080);
         System.out.println("Porta 8080 aberta");

      Socket Client = Server.accept();
         System.out.println("Nova conexao com o cliente "
         +Client.getInetAddress().getHostAddress());

      Scanner entrada = new Scanner(Client.getInputStream());
          while(entrada.hasNextLine()){
           System.out.println(entrada.nextLine());
       }

     entrada.close();
     Server.close();

  }
}
