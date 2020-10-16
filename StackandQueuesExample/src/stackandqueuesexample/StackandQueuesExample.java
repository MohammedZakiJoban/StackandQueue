/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueuesexample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author User
 */
public class StackandQueuesExample {

     Stack<Character> stack = new Stack<>();
     Queue<Character> queue = new LinkedList<>();

void pushCharacter(char ch) {
    stack.push(ch);
}

void enqueueCharacter(char ch) {
    queue.add(ch);
}

char popCharacter() {
    return stack.pop();
}

char dequeueCharacter() {
    return queue.remove();
}
     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

       
        char[] s = input.toCharArray();

      
        StackandQueuesExample p = new StackandQueuesExample();

        
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

       
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
    
}
