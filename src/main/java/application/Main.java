package application;

public class Main {

    public static void main(String[] args) throws Exception {

        if(args != null && args.length != 0){
            if(args[0].equals("Main")) {
                new MyApplication().run(args);
            } else if(args[0].equals("Agent")) {
                new AgentLoader().run(args);
            }
        }
    }
}
