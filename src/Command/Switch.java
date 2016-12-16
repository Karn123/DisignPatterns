package Command;

/**
 * Created by Karn on 2016/12/15.
 */
public class Switch {
    private Command[] flipUpSlotCommand;
    private Command[] flipDownSlotCommand;
    private Command undoCommand;

    public Switch() {
        flipUpSlotCommand = new Command[2];
        flipDownSlotCommand = new Command[2];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 2; i++) {
            flipUpSlotCommand[i] = noCommand;
            flipDownSlotCommand[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command flipUpSlotCommand, Command flipDownSlotCommand) {
        this.flipUpSlotCommand[slot] = flipUpSlotCommand;
        this.flipDownSlotCommand[slot] = flipDownSlotCommand;
    }

    public void flipUpSlotWasPressed(int slot) {
        flipUpSlotCommand[slot].execute();
        undoCommand = flipUpSlotCommand[slot];
    }

    public void flipDownSlotWasPressed(int slot) {
        flipDownSlotCommand[slot].execute();
        undoCommand = flipDownSlotCommand[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
}