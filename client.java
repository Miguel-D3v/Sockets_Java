  import java.io.IOException;
  import java.io.PrintStream;
  import java.net.Socket;
  import java.net.UnknownHostException;
  import java.util.Scanner;

    public class client {
        public static void main(String[] args)
                        throws UnknownHostException, IOException {
            Socket Client = new Socket("127.0.0.1", 8080);
            System.out.println("O cliente se conectou ao servidor!");

            Scanner teclado = new Scanner(System.in);
            PrintStream saida = new PrintStream(Client.getOutputStream());

            while (teclado.hasNextLine()) {
                saida.println(teclado.nextLine());
            }

            saida.close();
            teclado.close();
        }
    }
