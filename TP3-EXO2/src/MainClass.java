public class MainClass {
    public static void main(String[] args) {
        Natural n = new Natural(6);

        System.out.println("Inverse: " + n.inverse());
        System.out.println("Power of 3: " + n.power(3));
        System.out.println("Is Prime: " + n.isPrime());
        System.out.println("Factorial: " + n.factorial().value);
        System.out.println("Absolute Value of -6 : " + n.absoluteValue().value);
    }
}
