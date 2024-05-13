package question2;
public class stackimplement {
	int[] numArray;
	int top;
	int size;
	
	public stackimplement(int size) {
		   this.size=size;
			numArray = new int[size];
			top = -1;
			        }
	void push(int value) {
			if (top < numArray.length - 1) {
			      numArray[++top] = value;
			}
			else {
			      System.out.println("Full");
			}
	}
	 public int pop() {
			if (top >= 0) {
			    int data = numArray[top--];
			     size--;
			     return data;
			}
			return -1;
			}
	 public int peek() {
		 if(top>0) {
			 return numArray[top];
		 }
		 return -1;
	 }
	 public boolean isFull() {
		 return size==numArray.length;
	 }
	 public boolean isEmpty() {
		 return size==0;
	 }
	 
		public static void main(String[] args) {
			stackimplement numStack = new stackimplement(5);
			      numStack.push(11);
			      numStack.push(20);
			       numStack.push(30);
			       numStack.push(40);
			      numStack.pop();
			      numStack.pop();
			       
			for (int i = 0; i < numStack.size; i++) {
			System.out.println(numStack.numArray[i]);
			}
	}
		


}
