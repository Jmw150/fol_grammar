package assembly.instructions;

/**
 * Class corresponding to RISC-V FMV instruction
 * 
 * Models: fmvs dest src #dest = src
 */
public class FMv extends Instruction {

    /**
     * Initializes a FMOV instruction that will print: FMV.S dest src
     * 
     * @param src source operand 1
     * @param dest destination operand
     */

    public FMv(String src, String dest) {
        super();
        this.src1 = src;
        this.dest = dest;
        this.oc = OpCode.FMVS;
    }

    /**
     * @return "FMV.S dest src"
     */
    public String toString() {
        return this.oc + " " + this.dest + ", " + this.src1;
    }
}