package assembly.instructions;

/**
 * Class corresponding to RISC-V pseudo instruction LI
 * 
 * Models: li dest value #dest = value
 */
public class Li extends Instruction {

    /**
     * Initializes an LI instruction that will print LI dest value
     * 
     * @param dest destination operand
     * @param value value to put in destination
     */
    public Li(String dest, String value) {
        super();
        this.dest = dest;
        this.label = value;
        this.oc = OpCode.LI;
    }

    /**
     * @return "li dest label" with label printed as decimal
     */
    public String toString() {
        return this.oc + " " + this.dest + ", " + this.label;
    }
}