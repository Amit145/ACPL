import java.rmi.*;
public interface AddServerInterface extends Remote
{
public int sum(int a,int b) throws RemoteException;
public int sub(int a,int b) throws RemoteException;
public int mul(int a,int b) throws RemoteException;
public double div(int a,int b) throws RemoteException;
}
