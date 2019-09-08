import java.io.*;
import java.net.*;

public class Client extends Thread {
	
	static ObjectOutputStream outputStream = null;
	static ObjectInputStream inputStream = null;
	
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
	
	public static void main(String args[]){
		String hostname="localhost";
		try {
			@SuppressWarnings("resource")
			Socket cs = new Socket(hostname,2000);
			outputStream = new ObjectOutputStream(cs.getOutputStream());
			inputStream = new ObjectInputStream(cs.getInputStream());
		    BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			String userInput;
			Thread c = new Client();
			c.start();
            while ((userInput = stdIn.readLine()) != null) {
            	outputStream.writeObject(userInput);
            	outputStream.flush();
            }
		}
		catch ( Exception e ) {
			System.out.println( e );
		}
	}
}

