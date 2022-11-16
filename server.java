
import java.net.*;
import java.io.*;
import java.net.Socket;

public class server {

/*    private Socket clientSocket =null;
    private ServerSocket server=null;
    private DataInputStream in =null;

    public server(int port){
        try (
                this.server = new ServerSocket(port);
                System.out.println("Server started");
                System.out.println("waiting for client");
                clientSocket = serverSocket.accept();
                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String inputLine, outputLine;

            // Initiate conversation with client
            gfg kkp = new gfg();
            outputLine = kkp.processInput(null);
            out.println(outputLine);

            while ((inputLine = in.readLine()) != null) {
                outputLine = kkp.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye."))
                    break;
            }
    }
    */
public static void main(String[] args) throws IOException {

    if (args.length != 1) {
        System.err.println("Usage: java EchoServer <port number>");
        System.exit(1);
    }

    int portNumber = Integer.parseInt(args[0]);

    try (
            ServerSocket serverSocket =
                    new ServerSocket(Integer.parseInt(args[0]));
            Socket clientSocket = serverSocket.accept();
            PrintWriter out =
                    new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
    ) {
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            out.println(inputLine);
        }
    } catch (IOException e) {
        System.out.println("Exception caught when trying to listen on port "
                + portNumber + " or listening for a connection");
        System.out.println(e.getMessage());
    }
}

}