package InitializationLab1;

/**
 * Created by evanhitchings on 9/10/16.
 */
public class ColorfulThing {


    private Color color;


    public ColorfulThing(Color color) {
        this.color = color;

    }

    public Color getColor(){
        return this.color;
    }

    public enum Color {PINK, PURPLE, BLACK};


}
