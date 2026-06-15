public class Driver extends Person {
    private boolean isAvaliable;

    public Driver(String name,String pno,int id){
super(name,pno,id);
this.isAvaliable=true;

    }
    public boolean isAvaliable(){
        return isAvaliable;
    }
    public void setAvaliable(boolean avaliable){
this.isAvaliable=avaliable;
    }
    public String toString(){
        return "Driver: " +getName()+ "phone: " +getPhone()+ "Available: "+isAvaliable();
    }
}
