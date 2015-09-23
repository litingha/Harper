/**
@author:liting
@time:20150918
**/
public class SendTest{
 public static void main(String[] args){
  // SendFactory factory = new SendFactory();
  // Sender sEvent = factory.sendEvent("mail");
  // sEvent.send();
  //Added by liting in 20150923
  Sender sender = SendFactory.sendMail();
  sender.send();
 }
}

public interface Sender{
 public void send();
}

clas MailSender implements Sender{
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
 /**
 public Sender sendEvent(String str){
  if("email".equals(str)){
   return new MailSender();
  }else if("message".equals(str)){
   return new MessageSender();
  }
 }**/
 //Added by liting in 20150923
 public static Sender sendMail(){
  return new MailSender();
 }
 public static Sender sendMessage(){
  return new MessageSender();
 }
}
