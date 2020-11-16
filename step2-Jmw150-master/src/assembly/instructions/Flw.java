package assembly.instructions;

/**
 * Class corresponding to RISC-V instruction FLW
 * 
 * Models: flw dest offset(baseAddress) #dest = *(baseAddress + offset)
 */

public class Flw extends InstructionLS {

    /**
     * Initializes a FLW instruction that prints FLW dest offset(baseAddress)
     * 
     * @param dest destination operand
     * @param baseAddress register operand holding base address
     * @param offset immediate offset
     */
    public Flw(String dest, String baseAddress, String offset) {
        super(dest, baseAddress, offset);
        this.oc = OpCode.FLW;
    }
    
}