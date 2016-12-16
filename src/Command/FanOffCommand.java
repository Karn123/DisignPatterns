package Command;

/**
 * Created by Karn on 2016/12/15.
 */
public class FanOffCommand implements Command {
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stopRotate();
    }

    @Override
    public void undo() {
        fan.startRotate();
    }
}