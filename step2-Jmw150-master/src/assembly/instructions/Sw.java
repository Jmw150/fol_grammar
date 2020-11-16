package assembly.instructions;

/**
 * Class corresponding to RISC-V instruction SW
 * 
 * Models sw src offset(baseAddress) # *(baseAddress + offset) = src
 */
public class Sw extends InstructionLS {

    /**
     * Initializes SW instruction that prints SW src offset(baseAddress)
     * 
     * @param src source operand
     * @param baseAddress register holding base address
     * @param offset immediate holding address offset
     */
    public Sw(String src, String baseAddress, String offset) {
        super(src, baseAddress, offset);
        this.oc = OpCode.SW;
    }
    
}