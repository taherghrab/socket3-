package ClientProcess;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
public  class ClientProsses extends Thread {
    Socket socket;
    int num; // Un numéro d'identification pour le client.

    public ClientProsses(Socket socket,int num){
        super();
        this.socket = socket;// Initialise la socket pour ce client
        this.num = num;
    }
    public void num() throws IOException {
        // Obtient le flux de sortie de la socket pour envoyer des données au client
        OutputStream os = socket.getOutputStream();
        // Crée un PrintWriter pour écrire des données dans le flux de sortie
        PrintWriter pw = new PrintWriter(os,true);
        // Envoie un message au client contenant son numéro d'identification et son adresse IP.
        pw.println("client Num : "+num+" votre adr : "+socket.getRemoteSocketAddress());

    }
}
