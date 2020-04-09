package lesson3;

public class BackString {
    MyStack<Character> stack;
    String str;

    BackString(String str) {
        this.str = str;
        stack = new MyStack<Character>(str.length());
        fillingStack();
    }

    private void  fillingStack() {
        for (int i = 0; i < str.length() ; i++) {
            Character s = str.charAt(i);
            stack.push(s);
        }
    }

    public void printBackString() {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stack.pop());
        }
    }


}
