import java.net.*;
public class GetName{
public static void main(String args[]) throws Exception{
 InetAddress host = null ;
 host = InetAddress.getLocalHost();
 System.out.println("Nama komputer Anda :" +
host.getHostName());
}
}