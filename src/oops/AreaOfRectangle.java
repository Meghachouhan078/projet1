package oops;

public class AreaOfRectangle {
    private double width;
    private double height;

    public AreaOfRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public  void  setWidth( double width){
        this.width=width;
    }
    public  void  setHeight( double height){
        this.height=height;
    }
    public double getArea() {
        return width * height;
    }

}
class rectangle{
    public static void main(String[]args){
        AreaOfRectangle a=new AreaOfRectangle( 7,12);
        System.out.println("The area of the rectangle is " + a.getArea());
    }
}
