class ExSuper{
    String parent_name = "Haris";

    void display(){
        System.out.println("Person:  "+this.parent_name+" ");

    }

    public ExSuper(String parent_name) {
        this.parent_name = parent_name;
    }
}
class Teacher extends ExSuper{
    String name;

    public Teacher(String parent_name) {
        super(parent_name);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Teacher : " + this.name);

    }
}

class Main{
    public static void main(String[] args){
        Teacher o1 = new Teacher("Harischandra");
        o1.display();


    }

}