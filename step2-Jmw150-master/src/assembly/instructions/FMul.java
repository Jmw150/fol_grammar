package assembly.instructions;

/**
 * Class corresponding to RISC-V FMUL instruction
 * 
 * Models: fmul.s dest src1 src2 #dest = src1 * src2
 * 
 * Uses the <code>toString</code> method of {@link Instruction3O} to emit code
 */
public class FMul extends Instruction3O {

    /**
     * Initializes a FMUL instruction that will print: FMUL.S dest src1 src2
     * 
     * @param src1 source operand 1
     * @param src2 source operand 2
     * @param dest destination operand
     */
    public FMul(String src1, String src2, String dest) {
        super(src1, src2, dest);
        this.oc = OpCode.FMULS;
    }
    
}