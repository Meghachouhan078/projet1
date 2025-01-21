package oops;

class AnimalA{
    String name;
    int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;

    }
    public void setAge(int age){
        this.age = age;
    }
}
class TestAbc {
    public static void main (String[] args){
        AnimalA a = new AnimalA();
        a.setName("dog");
        a.setAge(2);
        System.out.println("name of firstprogram.animal is" +a.getName());
        System.out.println("age of firstprogram.animal is" +a.getAge());
    }
}