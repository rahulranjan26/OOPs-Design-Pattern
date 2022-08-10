package statepattern;


public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Inside slectiontool class mousedown");
    }

    @Override
    public void mouseUp() {
        System.out.println("Inside slectiontool class mouseup");

    }
}

