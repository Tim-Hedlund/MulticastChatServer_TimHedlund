import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastChatServer {

    public static void main(String[] args) throws Exception {

        int portNumber = 5000;
        if (args.length >= 1) {

            portNumber = Integer.parseInt(args[0]);

        }

        MulticastSocket serverMulticastSocket = new MulticastSocket(portNumber);
        System.out.println("MulticastSocket is created at  port" + portNumber);

        InetAddress group = InetAddress.getByName("255.4.5.6");

        serverMulticastSocket.joinGroup(group);
        System.out.println("Joingropu method is called ");

    }

}
