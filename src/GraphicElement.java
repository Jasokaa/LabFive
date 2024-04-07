import java.awt.*;

/**
 * The GraphicElement class represents a graphic element in a vector editor.
 * It encapsulates attributes such as color, position, and size.
 */
public class GraphicElement {
    private Color color;
    private Point position;
    private int size;

    /**
     * Constructs a new GraphicElement with the specified color, position, and size.
     *
     * @param color    the color of the graphic element
     * @param position the position of the graphic element
     * @param size     the size of the graphic element
     */
    public GraphicElement(Color color, Point position, int size) {
        this.color = color;
        this.position = position;
        this.size = size;
    }

    /**
     * Saves the current state of the graphic element.
     *
     * @return a GraphicElementMemento object representing the current state
     */
    public GraphicElementMemento saveState() {
        return new GraphicElementMemento(color, position, size);
    }

    /**
     * Restores the state of the graphic element from a memento.
     *
     * @param memento the memento containing the state to restore
     */
    public void restoreState(GraphicElementMemento memento) {
        this.color = memento.getColor();
        this.position = memento.getPosition();
        this.size = memento.getSize();
    }

    /**
     * Sets the color of the graphic element.
     *
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Sets the position of the graphic element.
     *
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * Sets the size of the graphic element.
     *
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Gets the color of the graphic element.
     *
     * @return the color of the graphic element
     */
    public Color getColor() {
        return color;
    }

    /**
     * Gets the position of the graphic element.
     *
     * @return the position of the graphic element
     */
    public Point getPosition() {
        return position;
    }

    /**
     * Gets the size of the graphic element.
     *
     * @return the size of the graphic element
     */
    public int getSize() {
        return size;
    }

    /**
     * Renders the graphic element.
     */
    public void render() {
        // Placeholder method for rendering
        System.out.println("Rendering graphic element...");
    }

    /**
     * Translates the graphic element by the specified amount.
     *
     * @param dx the amount to translate along the x-axis
     * @param dy the amount to translate along the y-axis
     */
    public void translate(int dx, int dy) {
        // Placeholder method for translation
        System.out.println("Translating graphic element by (" + dx + ", " + dy + ")...");
    }
}

