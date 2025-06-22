public class WebApp implements Observer {
    private String appName;

    public WebApp(String appName) {
        this.appName = appName;
    }

    public void update(String stockName, double newPrice) {
        System.out.println(appName + " Web App - " + stockName + " updated to Rs:" + newPrice);
    }
}
