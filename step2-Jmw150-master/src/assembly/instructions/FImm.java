package assembly.instructions;

/**
 * Class corresponding to RISC-V pseudo instruction FIMM.S
 * 
 * Models: fiim.s dest value #dest = value
 */
public class FImm extends Instruction {

    /**
     * Initializes an FIMM instruction that will print FIMM.S dest value
     * 
     * @param dest destination operand
     * @param value value to put in destination
     */
    public FImm(String dest, String value) {
        super();
        this.dest = dest;
        this.label = value;
        this.oc = OpCode.FIMMS;
    }

    /**
     * @return "fimm.s dest label" with label printed as decimal
     */
    public String toString() {
        return this.oc + " " + this.dest + ", " + this.label;
    }
}