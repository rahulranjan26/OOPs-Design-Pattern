package strategypattern;

public class CompressorPNGClass implements Compressor {
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using PNG");
    }
}
