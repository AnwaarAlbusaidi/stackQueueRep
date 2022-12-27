package stackQueue;

import java.util.ArrayList;
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
		while (!myStack.empty())
			System.out.println(myStack.pop());
		System.out.println();
		rev("something"); // call the method rev to reverse the word something
		System.out.println();
		System.out.println(openClose("{{int x=0;}}"));
		System.out.println(openClose("{{{ }}"));
		System.out.println(openClose("{"));
		System.out.println(openClose("{"));
		System.out.println();
		revSent("reverse me if you can");
		System.out.println();
		System.out.println(spilt("reverse me if you can", ' '));
	}// End of main class

	public static void rev(String str) {
		Stack<Character> revString = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			revString.push(str.charAt(i));
		}
		while (!revString.empty())
			System.out.print(revString.pop());
	}

	// This method well return true if all {} are equal and false if not equal
	public static boolean openClose(String str) {
		Stack<Character> openClosePar = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{')
				openClosePar.push(str.charAt(i));
			else if (str.charAt(i) == '}') {
				if (!openClosePar.empty())
					openClosePar.pop();
				else
					return false;
			}
		}
		if (openClosePar.empty())
			return true;
		else
			return false;
	}

	// this method reverse a string using stack and .split method
	public static void revSent(String str) {
		Stack<String> revString = new Stack<String>();
		for (String res : str.split(" ")) {
			revString.push(res);
		}
		while (!revString.empty())
			System.out.print(revString.pop() + " ");
	}

	// This is a re-implementation of split method
	public static ArrayList<String> spilt(String str, char ch) {

		ArrayList<String> spiltArrayList = new ArrayList<String>();

		String wordString = "";
		for (int i = 0; i < str.length(); i++) {
			wordString = wordString + str.charAt(i);
			if (str.charAt(i) == ch || i == str.length() - 1) {
				spiltArrayList.add(wordString);
				wordString = "";
			}
		}
		return spiltArrayList;
	}

}// End of stackWorld class
