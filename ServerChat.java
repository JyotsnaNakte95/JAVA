/*ServerChat.java
 * 
 */
import java.io.*;
import java.net.*;

/**
 * 
 * This class acts as the Server that allows two clients to chat with each other
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */
public class ServerChat extends Thread {
	
	/**
	 * ObjectOutputStream Object used to send output stream for User1
	 * and User 2
	 * 
	 * ObjectInputStream  Object used for input Stream for User1
	 * and User 2
	 */
	static ObjectOutputStream outUser1 = null;
	static ObjectInputStream inUser1 = null;
	static ObjectOutputStream outUser2 = null;
	static ObjectInputStream inUser2 = null;
	
	/**
	 * method that executes when thread starts running
	 * Method that reads from User 1 and send to User 2
	 */
	public void run() {
		Object inputLine;
        try {
			while ((inputLine = inUser1.readObject()) != null) {
				if (outUser2 == null) {
					outUser1.writeObject("Wait For User 2 to connect");
					outUser1.flush();
				} else {
					outUser2.writeObject("User 1: " + inputLine);
					outUser2.flush();
				}
			}
		} catch (Exception e) {
			System.out.println("User 1 Disconnected");
			try {
				outUser2.writeObject("User 1 Disconnected");
			} catch (IOException e1) {}
		} 
	}
	
	/**
	 * Main Method that creates socket for connection with clients
	 * and initiate chat between clients
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		//Create Socket connection
		ServerSocket ss = new ServerSocket(2000);
		//accept the client 1 connection
        Socket css = ss.accept();    
		outUser1 = new ObjectOutputStream(css.getOutputStream());                   
		inUser1 = new ObjectInputStream(css.getInputStream());
		outUser1.writeObject("Wait For User 2 to connect");
		outUser1.flush();
		
		//Thread object created
		Thread s = new ServerChat();
		s.start();
		
		//accept the client 2 connection
		Socket css2 = ss.accept();     
		outUser2 = new ObjectOutputStream(css2.getOutputStream());                   
		inUser2 = new ObjectInputStream(css2.getInputStream());
		
		outUser1.writeObject("---------------------------------------------------------");
		outUser1.writeObject("Both User Connected. Start Now to Chat");
		outUser1.writeObject("---------------------------------------------------------");

		outUser2.writeObject("---------------------------------------------------------");
		outUser2.writeObject("Both User Connected. Start Now to Chat");
		outUser2.writeObject("---------------------------------------------------------");

		outUser1.flush();
		outUser2.flush();
		
		// Takes input from User 2 and sends output to User 1
		Object inputLine;
        try {
			while ((inputLine = inUser2.readObject()) != null) {
				if (outUser1 == null) {
					outUser2.writeObject("Wait For User 2 to connect");
					outUser2.flush();
				} else {
					outUser1.writeObject("User 2: " + inputLine);
					outUser1.flush();
				}
			}
		} catch (Exception e) {
			System.out.println("User 2 Disconnected");
			try {
				outUser1.writeObject("User 2 Disconnected");
			} catch (IOException e1) {}
		}
	}
}

