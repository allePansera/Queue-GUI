package code;

class Coda<T> implements queue
{
	private T arr[];         // array to store queue elements
	private int front;         // front points to front element in the queue
	private int rear;          // rear points to last element in the queue
	private int capacity;      // maximum capacity of the queue
	private int count;         // current size of the queue
	public static Object ciccio = null;
	
	Coda(int size)
	{
		arr = (T[]) new Object[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}
	@Override
	public void dequeue() {
		// check for queue underflow
				if (isEmpty())
				{
					System.out.println("UnderFlow\nProgram Terminated");
					System.exit(1);
				}
				
				System.out.print("VALORE = "+arr[front]);
				ciccio = (T) arr[front];
				
				

				front = (front + 1) % capacity;
				count --;
		
	}

	

	@Override
	public T peek() {
		if (isEmpty()) 
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return (size() == 0);
	}

	@Override
	public boolean isFull() {
		return (size() == capacity);
	}
	@Override
	public void enqueue(Object t) {
		
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Inserting " + (T)t);

		rear = (rear + 1) % capacity;
		arr[rear] = (T) t;
		count++;
	}
}