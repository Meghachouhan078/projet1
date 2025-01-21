package oops;

public class paraconstructor { private String name;
    private String color;

    public paraconstructor(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        paraconstructor myDog = new paraconstructor("Bailey", "Black");

        System.out.println("Dog's Name: " + myDog.name);
        System.out.println("Dog's Color: " + myDog.color);
    }
}
