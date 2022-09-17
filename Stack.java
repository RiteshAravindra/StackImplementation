import java.util.Scanner;

public class Stack {

	
	static Scanner sc =new Scanner(System.in);
	
	static int stack[];
	static int top =-1;
	static int size;

	static {
		
		Stack.create();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		int ch,item;
		while(true) {
			
			System.out.println("1 Push");
			System.out.println("2 Pop");
			System.out.println("3 Peek");
			System.out.println("4 travrese");
			System.out.println("5 Quit");
			
			System.out.println("Enter your choice");
			
			 ch = sc.nextInt();
			 
			 
			 switch(ch) {
			 
			 case 1 :System.out.println("Enter element to push");
			 		item= sc.nextInt();
			 		Stack.push(item);
			 	break;
			 case 2 : item=Stack.pop();
			 		if(item==0) {
			 			System.out.println("Stack is underflow");
			 		}else {
			 			System.out.println("poped item" + item);
			 		}
			 	break;
			 case 3 : item=Stack.peek();
		 		if(item==0) {
		 			System.out.println("Stack is underflow");
		 		}else {
		 			System.out.println("poped item" + item);
		 		}
			 	break;
			 case 4 : Stack.traverse();
			 	break;
			 case 5 : System.exit(1);
			 default :System.out.println("Invalid choice");
			 
			 
			 }
			
			
			
			
		}
	}
	
	static void create() {
		
		
		
		System.out.println("Enter size of stack");
		
		size=Stack.sc.nextInt();
		
		
		Stack.stack =new int[size];
		
		System.out.println("Stack created with the size "+ size);
		
	}
	
	static void push(int item) {
		
		if(Stack.isFull()) {
			System.out.println("Stack is overflow");
		}else {
			++top;
			Stack.stack[top]=item;
		}
	
		
		
	}
	
	static boolean isFull() {
		
		if(top==size-1) {
			return true;
	}else {
		return false;
	}
	}
	
	static int pop() {
		if(Stack.isEmpty()) {
			return 0;
		}else {
			return stack[top--];
			
		}
	}
	static boolean isEmpty() {
		
		if(top==-1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	static int peek() {
		if(Stack.isEmpty()) {
			return 0;
		}else {
			return stack[top];
			
		}
	}
	
	static void traverse() {
		if(Stack.isEmpty()) {
			System.out.println("No elements are present,stack is empty");
		}else {
			for(int i=top; i>=0;i--) {
				System.out.println(stack[i]);
			}
		}
	}
}
