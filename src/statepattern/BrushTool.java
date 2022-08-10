package statepattern;

public class BrushTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Inside markdown of brushtool");
    }

    @Override
    public void mouseUp() {
        System.out.println("Inside markup of brushtool");
    }
}
