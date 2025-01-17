public class Main {
    // data member variable
    int age;
    String name;
    
    // local age
    void setAge(int age){
        // this is used to store data member age
        this.age = age;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    int getAge(){
        return this.age;
    }
    
    String getName(){
        return this.name;
    }
    
    public static void main(String[] args) {
        Main m1 = new Main();
        m1.setName("Hello name");
        m1.setAge(18);
        System.out.println(m1.getName() + " "+m1.getAge());
    }
}
