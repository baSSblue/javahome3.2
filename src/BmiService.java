public class BmiService {
    public int calculate(int mass, double height){
        double twoHeight = height * height;
        double bmi = mass / twoHeight;

        return (int) bmi;
    }
}
