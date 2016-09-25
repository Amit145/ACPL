import java.rmi.*;
import java.rmi.registry.*;

public class AddServer{
public static void main(String args[]){
try{
//AddServerInterface addService=new Adder();
System.setProperty("java.rmi.server.hostname", "192.168.43.3");  
Registry reg = LocateRegistry.createRegistry(1093);  
AddServerInterface foo = new Adder();       
reg.rebind("Foo", foo); 
//Naming.rebind("AddService",addService);	
//addService object is hosted with name AddService. 

}catch(Exception e){System.out.println(e);}
}
}
