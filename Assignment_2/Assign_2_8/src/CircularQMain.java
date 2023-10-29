import java.util.Scanner;

public class CircularQMain {

	public static void main(String[] args) {
		CircularQ cq=new CircularQ(5);
		int choice;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(cq.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					cq.push(data);
				}
				break;
			case 2:
				if(cq.isEmpty())
					System.out.println("Queue is Empty");
				else
					cq.pop();
				break;
			case 3:
				if(cq.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Peeked Data : " + cq.peek());
				break;
			}
		}while(choice != 0);
		

		sc.close();
	}

}
