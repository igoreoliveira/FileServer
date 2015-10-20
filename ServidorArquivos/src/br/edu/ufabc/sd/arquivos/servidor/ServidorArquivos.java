/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufabc.sd.arquivos.servidor;

/**
 *
 * @author Igor
 */

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.edu.ufabc.sd.arquivos.Requisicao;
import br.edu.ufabc.sd.arquivos.Resposta;
import java.io.ObjectOutputStream;


public class ServidorArquivos {
	
	public static void main(String args[]) {
		String IP_CLIENTE = "localhost";		
		
		try{ 
			ServerSocket server = new ServerSocket(20000);
			
			//Socket socketServer1;
			
			do{
				Socket client = server.accept();
				System.out.println("Connection accepted from " + client.getInetAddress().getHostAddress());
				
				ObjectInputStream inputClient = new ObjectInputStream(client.getInputStream());
				
				Resposta answer = new Resposta();
				Requisicao request = (Requisicao)inputClient.readObject();
                                
                                switch (answer.getMsg()){
                                    case Requisicao.READ_FILE:
                                        System.out.println("Receive Read File MSG");
                                    break;
                                    case Requisicao.LIST:
                                    break;
                                    case Requisicao.WRITE_FILE:
                                    break;
                                    case Requisicao.NEW_FILE:
                                    break;
                                    default:
                                    break;
                                }
                                
                                System.out.println("Sending response...");
                                // envio a resposta de volta ao cliente
                                 ObjectOutputStream output = new ObjectOutputStream(client.getOutputStream());
                                output.writeObject(answer);
                
                                output.close();
                                inputClient.close();
                                client.close();
				
				
			} while(true);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}