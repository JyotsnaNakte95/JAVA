/*ClientChat.java
 * 
 */
import java.io.*;
import java.net.*;
import java.util.Date;

/**
 * 
 * This class acts as the Client that creates socket connection
 *  that allows two clients to chat with each other and share
 *  text files
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */
public class ClientFile extends Thread {
	
	/**
	 * ObjectOutputStream 	Object used to send output stream for User1
	 *					    and User 2
	 * 
	 * ObjectInputStream    Object used for input Stream for User1
	 * 						and User 2
	 * Date 				To guarantee everytime unique file is downloaded
	 * 						by user so we append date to it
	 */
	static ObjectOutputStream outputStream = null;
	static ObjectInputStream inputStream = null;
	static FileInputStream in = null;
    static FileOutputStream out = null;
	static Date date = new Date();
	
	/**
	 * Method that executes when thread starts running
	 * Receiving data from Server and prints on User Screen
	*/
	public void run() {
		Object inputLine;
        try {
        	boolean fileIncoming = false;
			while ((inputLine = inputStream.readObject()) != null) {
				
				//condition that checks there is any incoming file
				if(inputLine.toString().contains("*File Incoming*")) {
					System.out.println("********************File Incoming*****************");
					//filename String that saves file name with date
					String filename = "output" + date.getTime() + ".txt";
					System.out.println("File Saving in " + filename);
					out = new FileOutputStream(filename);
					fileIncoming = true;
					continue;
				}
				
				//condition if file received and sets file incoming false
				if(inputLine.toString().contains("*Done File*")) {
					System.out.println("***********************File Recived*************************");
					fileIncoming = false;
					continue;
				}
				
				//condition that checks if boolean value of fileIncoming true and
				//stores file in user space
				if(fileIncoming) {
					//temp stores incoming data in file
					String temp = inputLine.toString().substring(8);
					Integer inp = Integer.parseInt(temp);
					out.write(inp);
				} else {
					//if all above condition do not match it 
					//prints normally messages of the user
					System.out.println(inputLine);
				}
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
		    // userInput 
			String userInput;
			//Creating thread for receiving data from Server
			
			Thread c = new ClientFile();
			c.start();
            
			while ((userInput = stdIn.readLine()) != null) {
            	if(userInput.equalsIgnoreCase("file")) {
					System.out.println("**************** Enter Full Path of txt File: *************************** ");
					//input String to store file directory path
					String input = stdIn.readLine();
				    try{
				    	in = new FileInputStream(input);
				    } catch (IOException e) {
				         System.out.print("Please Input Proper File Name, Type File to again to input file");
				         continue;
				    }	
				    //cc   Integer value to read file
				    int cc;
				    outputStream.writeObject("*File Incoming*");
				  //loop that sends data to the Server
			         while ((cc = in.read()) != -1) {
			        	 outputStream.writeObject(cc);
			             outputStream.flush();
			        }
			        outputStream.writeObject("*Done File*");
            	} else {
	            	outputStream.writeObject(userInput);
	            	outputStream.flush();
            	}
            }
		}
		catch ( Exception e ) {
			System.out.println( e );
		}
	}
}

