import java.io.*;
import java.net.*;

public class Server extends Thread {
	
	static ObjectOutputStream outUser1 = null;
	static ObjectInputStream inUser1 = null;
	static ObjectOutputStream outUser2 = null;
	static ObjectInputStream inUser2 = null;
	
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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) throws IOException {
		ServerSocket ss = new ServerSocket(2000);
        Socket css = ss.accept();     
		outUser1 = new ObjectOutputStream(css.getOutputStream());                   
		inUser1 = new ObjectInputStream(css.getInputStream());
		outUser1.writeObject("Wait For User 2 to connect");
		outUser1.flush();
		Thread s = new Server();
		s.start();
		
		Socket css2 = ss.accept();     
		outUser2 = new ObjectOutputStream(css2.getOutputStream());                   
		inUser2 = new ObjectInputStream(css2.getInputStream());
		outUser1.writeObject("Both User Connected. Start Now to Chat");
		outUser2.writeObject("Both User Connected. Start Now to Chat");
		outUser1.flush();
		outUser2.flush();
		
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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

