@Typestate("MessageStackProtocol")
public class MessageStack{
    private MyStack stackPointer;
    Message outputMessage;

    MessageStack(MyStack stackPointer, Message messagePointer) {
        this.stackPointer = stackPointer;
        this.outputMessage = messagePointer;
    }

    Check checkForMessage(){
        return this.stackPointer.status;
    }

    void answerMessage(String response){
        this.outputMessage.setMessage(response);
    }

    Message getMessage(){
        return new Message(this.stackPointer.pop());
    }

    void ignoreMessage(){
        this.outputMessage.setMessage("Message ignored");
    }

    void shutdownStack(){}
}