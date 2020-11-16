package assembly.instructions;

/**
 * Class corresponding to RISC-V DIV instruction
 * 
 * Models: div dest src1 src2 #dest = src1 / src2
 * 
 * Uses the <code>toString</code> method of {@link Instruction3O} to emit code
 */
public class Div extends Instruction3O {

    /**
     * Initializes a DIV instruction that will print DIV dest src1 src2
     * 
     * @param src1 source operand 1
     * @param src2 source operand 2
     * @param dest destination operand
     */
    public Div(String src1, String src2, String dest) {
        super(src1, src2, dest);
        this.oc = OpCode.DIV;
    }
    
}