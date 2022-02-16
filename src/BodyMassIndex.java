public class BodyMassIndex {
    public double calculate (double height, double weight) {
        double bmi = weight / height / height;
        System.out.println(bmi);
        return bmi;
    }
}
