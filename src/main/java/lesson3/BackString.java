package lesson3;

public class BackString {
    MyStack<Character> stack;
    String str;

    BackString(String str) {
        this.str = str;
        stack = new MyStack<Character>(str.length());
    }

    public String printBackString() {
        fillingStack();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s = s + stack.pop();
        }
        return s;
    }
    private void  fillingStack() {
        for (int i = 0; i < str.length() ; i++) {
            Character s = str.charAt(i);
            stack.push(s);
        }
    }


}
