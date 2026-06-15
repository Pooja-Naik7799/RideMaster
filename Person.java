public abstract class Person {
    private String name;
    private String pno;
    private int id;
    public Person(String name,String pno,int id){
        this.name=name;
        this.pno=pno;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return pno;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPhonenumber(String phno){
        this.pno=phno;
    }
}
