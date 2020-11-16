package assembly.instructions;

/**
 * Class for RISC-V instruction PUTS
 * 
 * Models: puts src # print(*src)
 * 
 * Note that src is a register holding an <i>address</i>
 */
public class PutS extends InstructionPut {

    /**
     * Initialize a PUTS instruction that prints PUTS srcAddress
     * 
     * @param srcAddress register holding address of string to print
     */
    public PutS(String srcAddress) {
        super(srcAddress);
        this.oc = OpCode.PUTS;
    }
}