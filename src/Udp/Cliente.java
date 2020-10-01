package Udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int porta = 5000;
		String endereco = "localhost";
		
		System.out.print("Digite uma mensagem: ");
		Scanner in = new Scanner(System.in);
		String mensagem = in.nextLine();
		
		DatagramSocket clientSocket = new DatagramSocket();
		InetAddress ipServidor = InetAddress.getByName(endereco);
		byte[] enviarDados;
		enviarDados = mensagem.getBytes();
		DatagramPacket enviarPacote = new DatagramPacket(enviarDados, enviarDados.length, ipServidor, porta);
		
		// long tempInicial = System.nanoTime();
		clientSocket.send(enviarPacote);
		
		System.out.println("Mensagem envida.");
		/*
		byte[] receberDados = new byte[1];
		DatagramPacket receberPacote = new DatagramPacket(receberDados, receberDados.length);
		clientSocket.receive(receberPacote);
		System.out.println("RTT: " + (System.nanoTime() - tempInicial)/1000);
		*/
		clientSocket.close();
		
	}

}
