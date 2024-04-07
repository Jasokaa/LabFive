import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create originator
        GraphicElement graphicElement = new GraphicElement(Color.RED, new Point(10, 10), 20);

        // Create caretaker
        MementoCaretaker caretaker = new MementoCaretaker();

        // Save initial state
        caretaker.saveMemento(graphicElement.saveState());

        // Change state
        graphicElement.setColor(Color.BLUE);
        graphicElement.setPosition(new Point(20, 20));
        graphicElement.setSize(30);

        // Restore initial state
        graphicElement.restoreState(caretaker.getMemento());

        // Output current state
        System.out.println("Color: " + graphicElement.getColor());
        System.out.println("Position: " + graphicElement.getPosition());
        System.out.println("Size: " + graphicElement.getSize());
    }
}