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
       rev("something"); //call the method rev to reverse the word something
       
	}//End of main class
	
   public static void rev(String str)
   {
	   Stack<Character> revString = new Stack<Character>();
       
       for(int i = 0; i < str.length(); i++)
       {
    	   revString.push(str.charAt(i));
       }
       while(!revString.empty())
		   System.out.print(revString.pop());
   }
}//End of stackWorld class
