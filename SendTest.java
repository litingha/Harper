public class SendTest{
 public static void main(String[] args){
  SendFactory factory = new SendFactory();
  Sender sEvent = factory.sendEvent("mail");
  sEvent.send();
 }
}

public interface Sender{
 public void send();
}

class MailSender implements Sender{
 public void send(){
  System.out.println("Mail sends!");
 }
}

class MessageSender implements Sender{
 public void send(){
  System.out.println("Message sends!");
 }
}

class SendFactory{
 public Sender sendEvent(String str){
  if("email".equals(str)){
   return new MailSender();
  }else if("message".equals(str)){
   return new MessageSender();
  }
 }
}
