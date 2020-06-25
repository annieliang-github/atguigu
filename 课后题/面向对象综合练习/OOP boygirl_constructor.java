    
public class Main {
    public static void main(String[] args) {    
        //new instance
        Boy boy = new Boy("Tom", 21);
        Girl girl = new Girl("Jerry", 18);
        Girl girl1 = new Girl("whatever", 35);
        
        boy.getName();
        girl.marry(boy);
        
        int res = girl.compare(girl1);
        String ans = res >= 0 ? girl1.getName() + " is younger." : girl1.getName() + " is older.";
        System.out.println(ans);
    }
}

class Boy {
    //field
    private String name;
    private int age;
    
    
    //constructor:
    public Boy() {
    }
    
    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //method:
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void marry(Girl girl) {
        System.out.println("I will marry " + girl.getName());
    }
    
    public void shout() {
        if (this.age >= 22) {
            System.out.println("This is legal.");
        } else {
            System.out.println("Go back to relationship.");
        }
        
    }
}


class Girl{
    private String name;
    private int age;
    
    
    //constructor
    public Girl() {
    }
    
    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void marry(Boy boy) {
        System.out.println("I want to marry " + boy.getName());
        boy.marry(this);
    }
    
    public int compare(Girl girl) {
        return this.age - girl.age;
    }
    
}



    

  



