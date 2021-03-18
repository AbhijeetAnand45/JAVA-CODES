public class ConstructorOverloading {
    int id;
    String name;
    public ConstructorOverloading(){
        System.out.println("\nThis is a default constuctor");
    }
    public ConstructorOverloading(int i, String n){
        id = i;
        name = n;

    }
    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        System.out.println("Default constructor Values\n");
        System.out.println("Employee ID : "+ obj.id +"\nEmployee Name : " + obj.name);

        System.out.println("\nOverloaded constructor Values: \n");
        ConstructorOverloading s = new ConstructorOverloading(19103001,"Abhijeet Anand");
        System.out.println("Employee ID : "+ s.id + "\nEmployee Name : "+ s.name);

        
    }
}
