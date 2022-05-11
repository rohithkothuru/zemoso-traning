/*
 * S - Single Responsibility Principle - A class should have one and only one reason to change.
 * O - Open Closed Principle- Objects or entities should be open for extensions but closed for modification.
 * L - Liskov Substitution Principles
                  Objects of super class shall be replaced with objects of subclasses.
 * I - Interface Segregation Principle
                  A client never be forced to implement an interface that it does not use.
 * D - Dependency Inversion Principle
                  High level modules should not directly depend on low level modules , instead they should depend
                  on abstraction.
 */
package solid;
interface ProtocolHandler{
    void sendMessage(String message);
}
class MyMessenger{
    ProtocolHandler handler ;
    MyMessenger(String protocol){
        handler = ProtocolHandlerFactory.getProtocolHandler(protocol);
    }
    public void send(String to,String message){
        handler.sendMessage("message to - "+to+", message - "+message);
    }
}
class TCPProtocolHandler implements ProtocolHandler{
    public void sendMessage(String message){
        System.out.println("TCPProtocolHandler sending message  - "+message);
    }
}
class UDPPProtocolHandler implements ProtocolHandler{
    public void sendMessage(String message){
        System.out.println("UDPProtocolHandler sending message  - "+message);
    }
}
class ProtocolHandlerFactory{
    public static ProtocolHandler getProtocolHandler(String protocol) {
        if ("TCP".equalsIgnoreCase(protocol)) {
            return new TCPProtocolHandler();
        }
        if ("UDP".equalsIgnoreCase(protocol)) {
            return new UDPPProtocolHandler();
        }
        return null;
    }
}
public class DependencyInversionEx1 {
    public static void main(String[] args) {
        MyMessenger messenger = new MyMessenger("TCP");
        messenger.send("a","SOLID is easy");
    }
}
