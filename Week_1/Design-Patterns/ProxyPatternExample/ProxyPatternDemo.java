public class ProxyPatternDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("profile_photo.jpg");

        image.display();
        image.display();
    }
}