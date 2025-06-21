public class Main {
    public static void main(String[] args) {
        double initialAmount = 10000;
        double growthRate = 0.10; 
        int years = 5;

        double futureValue = Forecast.predictValue(years, initialAmount, growthRate);
        System.out.printf("Future Value after %d years: Rs.%.2f\n", years, futureValue);
    }
}
