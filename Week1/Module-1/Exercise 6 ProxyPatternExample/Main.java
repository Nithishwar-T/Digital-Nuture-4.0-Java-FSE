public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("sunrise.jpg");
        Image image2 = new ProxyImage("mountains.jpg");

        System.out.println("First call to image1:");
        image1.display(); 

        System.out.println("\nSecond call to image1:");
        image1.display();  

        System.out.println("\nNow calling image2:");
        image2.display(); 
    }
}
