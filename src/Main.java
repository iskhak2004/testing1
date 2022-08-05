public class Main {
    public static void main(String[] args) {
        Phone myObj = new Phone();

        myObj.color = "Black";

        method();
        grow();


        System.out.println(" " + myObj.color);
    }
    public static void method() {
        Phone myObj = new Phone();

        System.out.println(myObj.model + " " + myObj.color);

        myObj.makePhoto();
        myObj.lockPhone();
    }

    public void unStaticMethod() {
        System.out.println("Un Static method running from Phone class's makePhoto method");
    }

    public static void grow() {
        System.out.println("asdfasdfasdf");
    }
}

