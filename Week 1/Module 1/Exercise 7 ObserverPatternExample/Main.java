public class Main {
    public static void main(String[] args) {
        StockMarket reliance = new StockMarket("RELIANCE", 2800.00);

        Observer mobileObserver = new MobileApp("Groww");
        Observer webObserver = new WebApp("Zerodha");

        reliance.registerObserver(mobileObserver);
        reliance.registerObserver(webObserver);

        reliance.setStockPrice(2850.00); 
        
        reliance.removeObserver(webObserver); 
        reliance.setStockPrice(2900.00);  
    }
}
