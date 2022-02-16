public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double height = 1.67D;
        double weight = 56.0D;
        double bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}