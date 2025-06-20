public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    public void update(String stockName, double newPrice) {
        System.out.println(appName + " Mobile App - " + stockName + " updated to Rs:" + newPrice);
    }
}
