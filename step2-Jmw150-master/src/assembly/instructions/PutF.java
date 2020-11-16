package assembly.instructions;

/**
 * Class for RISC-V instruction PUTF
 * 
 * Models: putf src # print(src)
 * 
 * Note that src is a register holding a value
 */
public class PutF extends InstructionPut {

    /**
     * Initialize a PUTF instruction that prints PUTF srcValue
     * 
     * @param srcValue register holding the value to print
     */
    public PutF(String srcValue) {
        super(srcValue);
        this.oc = OpCode.PUTF;
    }
}