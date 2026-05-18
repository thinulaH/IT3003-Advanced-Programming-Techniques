public class TestAccess {
    private int a = 10;
    protected int b = 10;
    public int c = 10;
    int d = 10;

   void display(){
       System.out.println("a"+a +"b"+b+"c"+c+"d"+d);
   }


    public static void main(String[] args) {
       TestAccess test = new TestAccess();
       test.display();
    }
}
