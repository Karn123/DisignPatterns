package Command;

/**
 * Created by Karn on 2016/12/15.
 */
public class Main {
    public static void main(String[] args){
        Switch aSwitch = new Switch();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        Fan fan = new Fan();
        Command fanOnCommand = new FanOnCommand(fan);
        Command fanOffCommand = new FanOffCommand(fan);

        aSwitch.setCommand(0,lightOnCommand,lightOffCommand);
        aSwitch.setCommand(1,fanOnCommand,fanOffCommand);

        aSwitch.flipUpSlotWasPressed(0);
        aSwitch.flipDownSlotWasPressed(0);
        aSwitch.undoButtonWasPressed();

        aSwitch.flipUpSlotWasPressed(1);
        aSwitch.flipDownSlotWasPressed(1);
        aSwitch.undoButtonWasPressed();
        //If we don't set the switch with respective command,
        //then it does nothing.
        Switch bSwitch = new Switch();
        bSwitch.flipUpSlotWasPressed(0);
        bSwitch.flipDownSlotWasPressed(0);
    }
}