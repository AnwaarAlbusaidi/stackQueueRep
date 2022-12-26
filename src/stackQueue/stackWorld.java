package stackQueue;
import java.util.Stack;

public class stackWorld {

	public static void main(String[] args) {

       Stack<String> myStack = new Stack<String>();
       
       myStack.push("Student 1");
       myStack.push("Student 2");
       myStack.push("Student 3");
       myStack.push("Student 4");
       myStack.push("Student 5");
       myStack.push("Student 6");
       while(!myStack.empty())
    		   System.out.println(myStack.pop());
       System.out.println();
       rev();
       
	}//End of main class
	
   public static void rev()
   {
	   Stack<Character> revString = new Stack<Character>();
       String myString = "anwaar";
       
       for(int i = 0; i < myString.length(); i++)
       {
    	   revString.push(myString.charAt(i));
       }
       while(!revString.empty())
		   System.out.print(revString.pop());
   }
}//End of stackWorld class
