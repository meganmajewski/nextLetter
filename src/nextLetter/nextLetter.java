package nextLetter;

import java.util.Scanner;

public class nextLetter {
	public static String LetterChanges(String str){
	    str = str.toLowerCase();
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < str.length(); i++){
	        char c = str.charAt(i);
	        if ('a' <= c && c <= 'z'){
	        	if(c=='z'){
	        		c='a';
	        	}else{
	        		c=(char)(c+1);
	        	}
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
	                c = Character.toUpperCase(c);
	            }
	        }
	        sb.append(c);
	    }
	    return sb.toString();
	}
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter a sentence");
	 System.out.print(LetterChanges(s.nextLine())); 
}
}
