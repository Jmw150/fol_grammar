package assembly.instructions;

/**
 * Class corresponding to RISC-V FADDS instruction
 * 
 * Models: fadd.s dest src1 src2 #dest = src1 + src2
 * 
 * Uses the <code>toString</code> method of {@link Instruction3O} to emit code
 */
public class FAdd extends Instruction3O {

    /**
     * Initializes an FADD instruction that will print: FADD.S dest src1 src2
     * 
     * @param src1 source operand 1
     * @param src2 source operand 2
     * @param dest destination operand
     */
    public FAdd(String src1, String src2, String dest) {
        super(src1, src2, dest);
        this.oc = OpCode.FADDS;
    }
    
}