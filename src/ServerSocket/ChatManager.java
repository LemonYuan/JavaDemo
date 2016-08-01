package ServerSocket;

import java.net.Socket;
import java.util.Vector;

public class ChatManager {
     private ChatManager(){}
     private static  final ChatManager cm=new ChatManager();
     public static ChatManager getChatManager()
     {
    	 return cm;
     }
     Vector<ChatSocket> vector=new Vector<ChatSocket>();
     public void add(ChatSocket s)
     {
    	 this.vector.add(s);
     }
     
     public  void speak(ChatSocket s,String out){
    	 for (int i=0;i<vector.size();i++)
    	 {
    		 ChatSocket cs=vector.get(i);
    		 if(!s.equals(cs))
    		 {
    			 cs.out(out);
    		 }
    	 }
     }
}
