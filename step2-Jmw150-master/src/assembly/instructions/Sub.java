package assembly.instructions;

/**
 * Class corresponding to RISC-V SUB instruction
 * 
 * Models: sub dest src1 src2 #dest = src1 - src2
 * 
 * Uses the <code>toString</code> method of {@link Instruction3O} to emit code
 */
public class Sub extends Instruction3O {

    /**
     * Initializes a SUB instruction that will print: SUB dest src1 src2
     * 
     * @param src1 source operand 1
     * @param src2 source operand 2
     * @param dest destination operand
     */
    public Sub(String src1, String src2, String dest) {
        super(src1, src2, dest);
        this.oc = OpCode.SUB;
    }
    
}