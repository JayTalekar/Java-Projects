package action;

import java.io.PrintWriter;

public class Default_Action implements Action{

    @Override
    public void execute(PrintWriter out) {
       out.println("This is is Default Action");
       out.println("The action you desired is not yet implemented.");
       out.println("Sorry...");
       out.println("Default Action Ends");
    }
    
}

