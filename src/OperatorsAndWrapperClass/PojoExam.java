package OperatorsAndWrapperClass;

 class PojoClass {

    private double price = 87594.5;

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
    public class PojoExam {
    public static void main(String[] args)
    {
        PojoClass obj = new PojoClass();
        System.out.println("result is:" + obj.getPrice());
    }
}
