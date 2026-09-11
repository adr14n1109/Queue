public class QueueNode {

    public Object dato;
    int priority;
    public QueueNode next;

    public QueueNode() {
        this.dato = null;
        this.priority = 0;
        this.next = null;
    }


    public QueueNode(Object dato) {
        this.dato = dato;
        this.priority = 0;
        this.next = null;
    }

    public QueueNode(Object dato, int priority) {
        this.dato = dato;
        this.priority = priority;
        this.next = null;
    }
}