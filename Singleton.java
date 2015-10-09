/**
@author:liting
@time:20151009
**/
class Singleton implements Serializable{
  private static Singleton singleton = null;
  private Singleton(){

  }
  public static Singleton getInitSingle(){
   if (singleton == null){
     singleton = new Singleton ();
   }
   return singleton;
  }
  public Object readResolve(){
   return singleton;
  }
}
