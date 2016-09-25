import java.rmi.*;
import java.util.*;
import java.rmi.registry.*;
public class Client{
public static void main(String args[]){
try{
int x,y;
System.out.println("----------------------------------------------");
System.out.println("SIMPLE CALCULATOR APPLICATION");
System.out.println("----------------------------------------------");
System.out.println("Enter Two Integers :");
Scanner in =new Scanner (System.in);
x=in.nextInt();
y=in.nextInt();
Registry reg = LocateRegistry.getRegistry("192.168.43.3",1093);
AddServerInterface foo = (AddServerInterface) reg.lookup("Foo");
System.out.println("Addition is :"+foo.sum(x,y));
System.out.println("Subtraction is :"+foo.sub(x,y));
System.out.println("Multiplication is :"+foo.mul(x,y));
System.out.println("Division is :"+foo.div(x,y));
}catch(Exception e){System.out.println(e);}
}
}
