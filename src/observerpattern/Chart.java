package observerpattern;

public class Chart implements Observer {

    @Override
    public void update() {
        System.out.println("Inside Chart");
    }
}
