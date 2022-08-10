package statepattern;

public class UIControls {
    //    public abstract void draw();
    private Tool currentTool;

    public UIControls(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mousedown() {
        currentTool.mouseDown();
    }

    public void mouseup() {
        currentTool.mouseUp();
    }

}
