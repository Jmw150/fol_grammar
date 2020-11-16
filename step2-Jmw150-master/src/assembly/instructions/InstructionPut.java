package assembly.instructions;

/**
 * Abstract class for put instructions, used for puts and puti
 */
public abstract class InstructionPut extends Instruction {

    InstructionPut(String src) {
        this.src1 = src;
    }

    /**
     * @return "op src1"
     */
    public String toString() {
        return this.oc + " " + src1;
    }
    
}