public class ObserverPatternDemo {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp("Priya");
        Observer web = new WebApp("User1");

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStockPrice("TCS", 4200.50);

        stockMarket.deregisterObserver(web);

        stockMarket.setStockPrice("Infosys", 1800.75);
    }
}