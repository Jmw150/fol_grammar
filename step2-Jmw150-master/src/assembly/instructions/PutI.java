package assembly.instructions;

/**
 * Class for RISC-V instruction PUTI
 * 
 * Models: puti src # print(src)
 * 
 * Note that src is a register holding a value
 */
public class PutI extends InstructionPut {

    /**
     * Initialize a PUTI instruction that prints PUTI srcValue
     * 
     * @param srcValue register holding the value to print
     */
    public PutI(String srcValue) {
        super(srcValue);
        this.oc = OpCode.PUTI;
    }
}