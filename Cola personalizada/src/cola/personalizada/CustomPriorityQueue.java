
import java.util.List;


public class CustomPriorityQueue<T> {
    private List<T> queue;

    public CustomPriorityQueue() {
        this.queue = new ArrayList<>();
    }

  
    public void enqueue(T element) {
        queue.add(element);
    }

   
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return queue.remove(0);
    }


    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return queue.get(0);
    }

   
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return queue.size();
    }

  
    public void printQueue() {
        System.out.println("Contenido de la cola:");
        for (T element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
