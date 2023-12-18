package main.java.com.codewars.sixth;

import java.util.LinkedList;

public class BraceChecker {
    public boolean isValid(String braces) {

        if(braces.length() %2 !=0 || braces.length() <2){
            return false;
        }

        LinkedList<Character> parentheses = new LinkedList<>();
        char[] chars = braces.toCharArray();

        for (char ch: chars) {
            if (ch == '{' || ch == '(' || ch == '[') {
                parentheses.add(ch);
            }
            else if (ch == '}' || ch == ')' || ch == ']'){
                if(parentheses.isEmpty()){
                    return false;
                }
                switch(ch){
                    case '}':
                        if(parentheses.getLast()!='{'){
                            return false;
                        }
                        else{
                            parentheses.removeLast();
                        }

                        break;

                    case ')':
                        if(parentheses.getLast()!='('){
                            return false;
                        }
                        else{
                            parentheses.removeLast();
                        }
                        break;

                    case ']':
                        if(parentheses.getLast()!='['){
                            return false;
                        }
                        else{
                            parentheses.removeLast();
                        }
                        break;

                    default:
                        break;
                }
            }
        }
        if(parentheses.isEmpty()){
            return true;
        }
        return false;
    }
}
