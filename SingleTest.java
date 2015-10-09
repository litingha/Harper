/**
@author:liting
@time:20151009
**/
class SingleTest{
 private static SingleTest instance = null;
 public Vector properties = null;
 private SingleTest(){
 }
 public Vector getProperty(){
  return properties;
 }
 private static synchronized void getInit(){
  if(instance == null){
   instance = new SingleTest();
  }
 }
 public static SingleTest getInstance(){
  if(instance == null){
   getInit();
  }
  return instance;
 }
 public void updateProperties(){
  SingleTest test = new SingleTest();
  properties = test.getProperty();
 }
}
