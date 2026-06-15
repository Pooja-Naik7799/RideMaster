public class Passenger extends Person {
public Passenger(String name,String phn,int id){
    super(name,phn,id);
}
 public String toString(){
    return "passenger: "+getName() +"Phone: "+getPhone();
 }   
}
