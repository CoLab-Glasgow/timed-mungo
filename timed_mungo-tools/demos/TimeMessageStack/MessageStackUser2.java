import java.util.ArrayList;
import java.util.Collections;

class MessageStackUser2{
    public String getResponse(){
        tsDelay(3);
        return "42";
    }

    public void sortMessages(ArrayList<String> messages){
        Collections.sort(messages);
        tsDelay(5);
    }

    public void doWork(){
        // Do Work here
        tsDelay(3);
    }

    public void doLotsOfWork(){
        // Do lots of work here
        tsDelay(7);
    }

    public static void tsDelay(int n){}

    public MessageStackUser2(){}
    
    public static void main(String[] args){
        ArrayList<String> messages = new ArrayList<>();
        MyStack stack = new MyStack();
        MessageFiller.fillMessages(stack);
        Message messagePointer = new Message("");
        MessageStack ms = new MessageStack(stack, messagePointer);
        MessageStackUser2 msu = new MessageStackUser2();
        loop : do{
            switch(ms.checkForMessage()){
                case RECEIVED:
                    Message m = ms.getMessage();

                    messages.add(m.toString());
                    msu.sortMessages(messages);
                    // msu.doWork();
                    String response = msu.getResponse();

                    ms.answerMessage(response);
                    continue loop;
                case EMPTY:
                    ms.shutdownStack();
                    break loop;
            }
        } while(true);
    }
}