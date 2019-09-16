package cliente;


;
import java.io.*;
import java.net.*;



/**
 *
 * @author Douglas Allan Braga
 */
public class Client {
 
    private int port = 6789;
    
    private DatagramSocket clientSocket = null;
    private DatagramPacket request;
    private DatagramPacket reply;
    private String mensagem;
    private String servidor = "172.16.38.93";
    private byte[] buffer;
    private InetAddress ipAddress;
    private boolean validar;
    
    public Client(String msg) throws SocketException, UnknownHostException, IOException{
        mensagem = msg;
        buffer = mensagem.getBytes();
        clientSocket = new DatagramSocket();

        ipAddress = InetAddress.getByName(this.servidor);
        request = new DatagramPacket(buffer, mensagem.length(),
                                            ipAddress, port);
        System.out.println("mensagem: " + mensagem);
        clientSocket.send(request);

        reply = new DatagramPacket(buffer, buffer.length);
        clientSocket.receive(reply);
        mensagem = null;
        mensagem = new String(reply.getData());
        
        
        
        if('1' == mensagem.charAt(0)){
            validar = true;
        }else validar = false;
        System.out.println("Pacote do servidor: " + mensagem);
        clientSocket.close();
    }
    
    public boolean getValidar(){
        return validar;
    }
}

