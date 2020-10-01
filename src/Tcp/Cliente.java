package Tcp;

import java.io.DataOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int porta = 3001;
		String endereco = "localhost";
		
		System.out.print("Digite uma mensagem: ");
		Scanner in = new Scanner(System.in);
		String mensagem = in.nextLine();
		
		try {
			
			Socket socket = new Socket(endereco, porta);
			DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
			saida.write(mensagem.getBytes());
			
			System.out.println("Mensagem enviada.");
			socket.close();
			
		} catch (ConnectException e) {
			System.out.println("Não foi possível chegar ao destinatario");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
