
/*public class CircularQ {
	private final int SIZE;
	private int rear;
	private int front;
	private int arr[];
	
	public CircularQ(int size) {
		this.SIZE = size;
		this.rear=-1;
		this.front=-1;
		arr=new int[this.SIZE];
		
	}
	public void push(int data) {
		rear=(rear+1) % SIZE;
		arr[rear]=data;
	}
	public void pop() {
		front=(front+1)%SIZE;
		if(front==rear) {
			front=rear=-1;
		}
	}
	public int peek() {
		return arr[(front +1)%SIZE];
	}
	public boolean isFull() {
        return (front==-1&&rear==SIZE-1) || (front==rear && rear!=-1);
	}
	public boolean isEmpty() {
        return (front==rear&& rear==-1) ;
	}
}*/
public class CircularQ{
	
	private final int SIZE;
	private int rear;
	private int front;
	private int arr[];
	private int cnt;
	
	public CircularQ(int size) {
		this.SIZE = size;
		this.rear=-1;
		this.front=-1;
		this.cnt=0;
		arr=new int[this.SIZE];
	}
	public void push(int data) {
		front=(front+1)%SIZE;
		arr[cnt]=data;
		cnt++;
	}
	public void pop() {
		front=(front+1)%SIZE;
		cnt--;
	}
	public int peek() {
		return arr[(front +1)%SIZE];
	}
	public boolean isFull() {
		if(cnt==SIZE) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
        if(cnt==0) {
        	return true;
        }
        return false;
	}
}





