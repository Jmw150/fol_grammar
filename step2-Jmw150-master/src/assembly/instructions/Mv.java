package assembly.instructions;

/**
 * Class corresponding to RISC-V MV instruction
 * 
 * Models: mv dest src #dest = src
 */
public class Mv extends Instruction {

    /**
     * Initializes a MV instruction that will print: MV dest src
     * 
     * @param src source operand 1
     * @param dest destination operand
     */

    public Mv(String src, String dest) {
        super();
        this.src1 = src;
        this.dest = dest;
        this.oc = OpCode.MV;
    }

    /**
     * @return "MV dest src"
     */
    public String toString() {
        return this.oc + " " + this.dest + ", " + this.src1;
    }
}