public class AbstractFactory{
  public static main(String[] args){
   Factory factory = new MailFactory();
   Sender sender = factory.Send();
   sender.send();
  }
}
public interface Factory{
 public void Send();
}
public interface Sender{
 public void send();
}
class MailFactory implements Factory{
 public Sender Send(){
  return new MailSender();
 }
}
class MessageFactory implements Factory{
 public Sender Send(){
  return new MessageSender();
 }
}
class MailSender implements Sender{
 public void send(){
  System.out.println("I am MailSender");
 }
}
class MessageSender implements Sender{
 public void send(){
  System.out.println("I am MessageSender");
 }
}
