package Command;

/**
 * Created by Karn on 2016/12/15.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        //do nothing
        System.out.println("I do nothing~");
    }

    @Override
    public void undo() {

    }
}
