import java.util.Stack;

public class MyStack {
    private Stack<String> st;
    public Check status = Check.EMPTY;

    public MyStack(){
        this.st = new Stack<String>();
    }
    public void push(String message){
        this.st.push(message);
        this.status = Check.RECEIVED;
    }
    public String pop(){
        String ret = st.pop();
        if(st.empty()){
            this.status = Check.EMPTY;
        }
        return ret;
    }
}
