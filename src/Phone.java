public class Phone {
    String model = "iPhone 8";
    int memory = 64;
    String color = "White";
    int weight = 245;
    double diagonal = 6.4;
    float cameraPixels = 12;

    public static void lockPhone() {
        Phone obj = new Phone();
        System.out.println("Your " + obj.model + " is locked");
    }

    public void makePhoto() {
        int x = 10;
        Main obj = new Main();
        Second obj1 = new Second();

        obj.unStaticMethod();
        obj.grow();
        obj1.method();

        System.out.println("Taking a photo stay still " + model + " " + color);
    }

    public void playVideo() {
        System.out.println("Playing a Video");
    }

    public void runningGame() {
        System.out.println("Running a video game");
    }
}
