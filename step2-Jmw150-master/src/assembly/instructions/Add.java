package assembly.instructions;

/**
 * Class corresponding to RISC-V ADD instruction
 * 
 * Models: add dest src1 src2 #dest = src1 + src2
 * 
 * Uses the <code>toString</code> method of {@link Instruction3O} to emit code
 */
public class Add extends Instruction3O {

    /**
     * Initializes an ADD instruction that will print: ADD dest src1 src2
     * 
     * @param src1 source operand 1
     * @param src2 source operand 2
     * @param dest destination operand
     */
    public Add(String src1, String src2, String dest) {
        super(src1, src2, dest);
        this.oc = OpCode.ADD;
    }
    
}