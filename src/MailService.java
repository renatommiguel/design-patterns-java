public class MailService {
    public void sendEmail(){
        this.connect(1);
        this.authenticate();
        this.disconnect();
    }

    private void connect(int timeout){
        System.out.println("Connect");
    }


    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
