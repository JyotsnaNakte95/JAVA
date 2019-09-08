/*ClientChat.java
 * 
 */
import java.io.*;
import java.net.*;

/**
 * 
 * This class acts as the Client that creates socket connection
 *  that allows two clients to chat with each other
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */
public class ClientChat extends Thread {
	
	/**
	 * ObjectOutputStream Object used to send output stream for User1
	 * and User 2
	 * 
	 * ObjectInputStream  Object used for input Stream for User1
	 * and User 2
	 */
	static ObjectOutputStream outputStream = null;
	static ObjectInputStream inputStream = null;

	/**
	 * method that executes when thread starts running
	 * Receiving data from Server and prints on User Screen
	*/
	public void run() {
		Object inputLine;
        try {
			while ((inputLine = inputStream.readObject()) != null) {
				System.out.println(inputLine);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Main Method that creates socket for connection with server
	 * to initiate chat between Clients
	 * @param args
	 */
	public static void main(String args[]){
		// hostname String used to declare the hostname
		String hostname="localhost";
		//Socket Connection to Server
		try {
			Socket cs = new Socket(hostname,2000);
			//input/ output from the server
			outputStream = new ObjectOutputStream(cs.getOutputStream());
			inputStream = new ObjectInputStream(cs.getInputStream());
		    BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			String userInput;
		
			//Creating thread for receiving data from Server
			Thread c = new ClientChat();
			c.start();
			
			//loop that sends data to the Server
            while ((userInput = stdIn.readLine()) != null) {
            	outputStream.writeObject(userInput);
            	outputStream.flush();
            }
            cs.close();
		}
		catch ( Exception e ) {
			System.out.println( e );
		}
	}
}

