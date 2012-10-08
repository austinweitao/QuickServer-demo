

import org.quickserver.net.*;
import org.quickserver.net.server.*;


public class EchoServer {
	public static void main(String s[]) {
		QuickServer myServer = new QuickServer("EchoCommandHandler");
		myServer.setPort(12345);
		myServer.setName("EchoServer v 1.0");
		myServer.setTimeoutMsg("timeout----!!!!!!");
		try {
			myServer.startServer();
		} catch (AppException e) {
			System.err.println("Error in server : " + e);
		}
	}
}
