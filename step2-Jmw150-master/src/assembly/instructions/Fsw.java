package assembly.instructions;

/**
 * Class corresponding to RISC-V instruction FSW
 * 
 * Models sw src offset(baseAddress) # *(baseAddress + offset) = src
 */
public class Fsw extends InstructionLS {

    /**
     * Initializes FSW instruction that prints FSW src offset(baseAddress)
     * 
     * @param src source operand
     * @param baseAddress register holding base address
     * @param offset immediate holding address offset
     */
    public Fsw(String src, String baseAddress, String offset) {
        super(src, baseAddress, offset);
        this.oc = OpCode.FSW;
    }
    
}