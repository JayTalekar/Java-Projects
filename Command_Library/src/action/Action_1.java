package action;

import java.io.PrintWriter;

public class Action_1 implements Action {
    @Override
    public void execute(PrintWriter pw){
        pw.println("This is Action 1 at Your Service");
        for(int i = 0; i < 5 ; i++){
            pw.println("Hello User" + i);
        }
        pw.println("Service Ends");
    }    
}
