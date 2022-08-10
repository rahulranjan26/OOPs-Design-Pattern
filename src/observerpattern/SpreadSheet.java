package observerpattern;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("Inside Spreadsheet");
    }
}
