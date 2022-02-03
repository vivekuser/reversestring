import java.util.*;
public class Reversestr{
    public static void main(String[] args) {
    	String str = "Nokia";
    	String reverseString = "";
    	for(int i= str.length()-1; i>=0;i--){
    		reverseString = reverseString + str.charAt(i);
    	}
    	System.out.println("Reverse of " +str +" is " +reverseString);
    }
}