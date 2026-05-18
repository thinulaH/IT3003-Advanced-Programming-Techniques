public class Cal {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a , int b, int c){
        System.out.println(a + b + c);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Cal calculator = new Cal();

        calculator.add(1,2);
        calculator.add(1,2,3);
        calculator.add(23.5,20.2);

    }

}
