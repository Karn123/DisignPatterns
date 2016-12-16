package Command;

/**
 * Created by Karn on 2016/12/15.
 */
public class FanOnCommand implements Command {
    private Fan fan;
    public FanOnCommand(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.startRotate();
    }

    @Override
    public void undo() {
        fan.stopRotate();
    }
}