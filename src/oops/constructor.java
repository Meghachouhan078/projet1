package oops;

public class constructor {
    private String name;
    private String age;

    public constructor(){
        this.name="megha";
        this.age="11";
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public static void main(String args[]){
    constructor c=new constructor();
    System.out.println("cat name :" + c.getName());
    System.out.println("cat name :" + c.getAge());

}}