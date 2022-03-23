class MessageStackUser{
    public String getResponse(){
        tsDelay(3);
        return "42";
    }

    public MessageStackUser(){}
    
    public static void main(String[] args){
        MyStack stack = new MyStack();
        MessageFiller.fillMessages(stack);
        Message messagePointer = new Message("");
        MessageStack ms = new MessageStack(stack, messagePointer);
        MessageStackUser msu = new MessageStackUser();
        loop : do{
            switch(ms.checkForMessage()){
                case RECEIVED:
                    Message m = ms.getMessage();
                    tsDelay(2);
                    System.out.println(m.toString());
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