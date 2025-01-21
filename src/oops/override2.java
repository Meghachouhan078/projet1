package oops;

  class shape{
      void draw()
      {
          System.out.println("cant say shape type");
      }
}
class square extends shape{
      void draw()
      {
          System.out.println("square shape");
      }
}
class demo
{
    public static void main(String []args){
        square r= new square();
                r.draw();
    }
}
