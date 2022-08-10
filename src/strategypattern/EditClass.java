package strategypattern;

public class EditClass {
    Compressor compress;

    Filter filter;

    public EditClass(Compressor compress, Filter filter) {
        this.compress = compress;
        this.filter = filter;
    }
    public void store(String filename){
        compress.compress(filename);
        filter.apply(filename);
    }
}
