package assembly.instructions;

/**
 * Class corresponding to RISC-V MUL instruction
 * 
 * Models: mul dest src1 src2 #dest = src1 * src2
 * 
 * Uses the <code>toString</code> method of {@link Instruction3O} to emit code
 */
public class Mul extends Instruction3O {

    /**
     * Initializes a MUL instruction that will print: MUL dest src1 src2
     * 
     * @param src1 source operand 1
     * @param src2 source operand 2
     * @param dest destination operand
     */
    public Mul(String src1, String src2, String dest) {
        super(src1, src2, dest);
        this.oc = OpCode.MUL;
    }
    
}