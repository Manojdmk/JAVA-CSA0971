import java.util.*;
 class Powers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a floating point number: ");
        double number = scanner.nextDouble();
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);
        System.out.println("square:" +square);
        System.out.println("cube:" +cube);
        System.out.println("fourthpower:" +fourthPower);
    }
}