import java.awt.*;

/**
 * The GraphicElementMemento class represents a memento object that stores
 * the state of a GraphicElement at a particular point in time.
 */
public class GraphicElementMemento {
    private Color color;
    private Point position;
    private int size;

    /**
     * Constructs a new GraphicElementMemento with the specified color, position, and size.
     *
     * @param color    the color of the graphic element
     * @param position the position of the graphic element
     * @param size     the size of the graphic element
     */
    public GraphicElementMemento(Color color, Point position, int size) {
        this.color = color;
        this.position = position;
        this.size = size;
    }

    /**
     * Gets the color stored in the memento.
     *
     * @return the color stored in the memento
     */
    public Color getColor() {
        return color;
    }

    /**
     * Gets the position stored in the memento.
     *
     * @return the position stored in the memento
     */
    public Point getPosition() {
        return position;
    }

    /**
     * Gets the size stored in the memento.
     *
     * @return the size stored in the memento
     */
    public int getSize() {
        return size;
    }
}
