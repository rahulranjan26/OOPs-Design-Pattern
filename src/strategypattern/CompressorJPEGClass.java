package strategypattern;


public class CompressorJPEGClass implements Compressor {

    @Override
    public void compress(String filename) {
        System.out.println("Compressing using JPEG");
    }
}

