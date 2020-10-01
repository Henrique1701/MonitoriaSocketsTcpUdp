package Udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Servidor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DatagramSocket serverSocket = new DatagramSocket(5000);
		byte[] receberDados = new byte[1024];
		// byte[] enviarDados;
		InetAddress ipCliente;
		int porta;
		
		System.out.println("Aguardando mensagem...");
		
		while(true) {
			DatagramPacket receberPacote = new DatagramPacket(receberDados, receberDados.length);
			serverSocket.receive(receberPacote);
			
			String msgDecodificada = new String(receberPacote.getData(), "UTF-8");
			
			System.out.print("Mensagem recebida: ");
			System.out.println(msgDecodificada);
			
			/*
			ipCliente = receberPacote.getAddress();
			porta = receberPacote.getPort();
			enviarDados = ("2").getBytes();
			DatagramPacket enviarPacotes = new DatagramPacket(enviarDados, enviarDados.length, ipCliente, porta);
			serverSocket.send(enviarPacotes);
			*/
		}

	}

}
