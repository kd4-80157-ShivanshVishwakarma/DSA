
public class LinearQ {

		private int arr[];
		private int rear, front;
		private final int SIZE;
		public LinearQ(int size) {
			SIZE = size;
			arr = new int[SIZE];
			front = 0;
			rear = 0;
		}
		public void push(int data) {
			arr[rear] = data;
			rear++;
		}
		
		public void pop() {
			front++;
		}
		
		public int peek() {
			return arr[front];
		}
		
		public boolean isFull() {
			return rear == SIZE -1;
		}
		
		public boolean isEmpty() {
			return (front == rear) || rear==0;
		}
}
