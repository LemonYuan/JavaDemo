package ServerSocket;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerListener extends Thread{
@Override
public void run() {
	try {
		ServerSocket s=new ServerSocket(23333);
		while (true){
			
			ChatSocket cs=new ChatSocket(s.accept());
			cs.start();
			ChatManager.getChatManager().add(cs);
		}

	
	
	} catch (IOException e) {
		e.printStackTrace();
	}
	while(true)
	{
		
	}
}
}
