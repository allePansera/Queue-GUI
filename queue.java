package code;

public interface queue<T> {
void dequeue();
void enqueue(T item);
T peek();
int size();
boolean isEmpty();
boolean isFull();
}
