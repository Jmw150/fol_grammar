package assembly.instructions;

public class Halt extends Instruction {

    /**
     * Models the magic instruction HALT
     */
    public Halt() {
        super();
        this.oc = OpCode.HALT;
    }

    /**
     * @return "HALT"
     */
    public String toString() {
        return String.valueOf(this.oc);
    }
}