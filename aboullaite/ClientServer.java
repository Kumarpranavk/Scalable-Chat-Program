package aboullaite;

import java.util.Scanner;
import javax.swing.*;

//Class to precise who is connected : Client or Server
public class ClientServer {

	
	public static void main(String [] args){
		
                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Enter mode: server or client");
                String selection = scanner.nextLine();
                
		if(selection.equals("server")){
                   String[] arguments = new String[] {};
			new MultiThreadChatServerSync().main(arguments);
		}else if(selection.equals("client")){
                        System.out.println("Enter the server ip address:");
			String IPServer = scanner.nextLine();
                        String[] arguments = new String[] {IPServer};
			new ChatClient().main(arguments);
		}
		
	}

}
