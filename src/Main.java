public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 98;
        double height = 1.87;

        int myBmi = service.calculate(mass, height);

        System.out.println(myBmi);
    }
}