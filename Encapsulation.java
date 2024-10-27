class Human{
    private int age;
    private String name;
    int wt = 65;
    public void setname(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public String getname(){
        return name;
    }
}
public class Encapsulation{
    public static void main(String[] args){
        Human hum = new Human();

        //System.out.println(hum.wt);
        hum.setname("SRVBY");
        hum.setAge(56);
        System.out.println(hum.getAge());
        System.out.println(hum.getname());


    }
}