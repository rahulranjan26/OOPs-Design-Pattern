package strategypattern;

public class FilterBAndWClass implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println("Filtering using B&W filter");
    }
}
