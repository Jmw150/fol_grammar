package assembly.instructions;

/**
 * Class corresponding to RISC-V instruction LW
 * 
 * Models: lw dest offset(baseAddress) #dest = *(baseAddress + offset)
 */

public class Lw extends InstructionLS {

    /**
     * Initializes a LW instruction that prints LW dest offset(baseAddress)
     * 
     * @param dest destination operand
     * @param baseAddress register operand holding base address
     * @param offset immediate offset
     */
    public Lw(String dest, String baseAddress, String offset) {
        super(dest, baseAddress, offset);
        this.oc = OpCode.LW;
    }
    
}