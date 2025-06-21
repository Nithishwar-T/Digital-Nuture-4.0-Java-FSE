public class Forecast {

    
    public static double predictValue(int years, double initialAmount, double rate) {
        if (years == 0) {
            return initialAmount;
        }
        return predictValue(years - 1, initialAmount, rate) * (1 + rate);
    }
}
