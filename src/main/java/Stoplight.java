import java.util.ArrayList;

public class Stoplight {

    public enum Colors {
        green, yellow, red
    }

    //ArrayList because values have to be addressable by index
    private ArrayList<Colors> colors;
    private boolean state;
    private int colorIndex;

    public Stoplight(){
        this.state = false;
        colors = new ArrayList<>();
        colors.add(Colors.green);
        colors.add(Colors.yellow);
        colors.add(Colors.red);
    }

    public void toggleState(){
        this.state = !this.state;
    }

    public void toggleColor(){
        if (!state){
            throw new IllegalStateException("Trying to switch colors on a stoplight that's off!");
        } else {
//            System.out.println(colorIndex);
//            System.out.println(Colors.values().length-1);
            colorIndex = (colorIndex + 1) % Colors.values().length;

        }
    }

    @Override
    public String toString(){
        if (!state) {
            return "Stoplight is off.";
        } else {
            System.out.println(colorIndex);
            return "Color: " + colors.get(colorIndex);
        }
    }
}
