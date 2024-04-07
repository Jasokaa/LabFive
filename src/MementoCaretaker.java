/**
 * The MementoCaretaker class is responsible for saving and restoring mementos.
 */
public class MementoCaretaker {
    private GraphicElementMemento memento;

    /**
     * Saves a memento.
     *
     * @param memento the memento to save
     */
    public void saveMemento(GraphicElementMemento memento) {
        this.memento = memento;
    }

    /**
     * Retrieves the saved memento.
     *
     * @return the saved memento
     */
    public GraphicElementMemento getMemento() {
        return memento;
    }
}