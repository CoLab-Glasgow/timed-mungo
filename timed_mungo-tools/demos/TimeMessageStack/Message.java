public class Message{
    private String message;

    public Message(String message){
        this.message = message;
    }

    public String toString(){
        return "Message: " + message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}