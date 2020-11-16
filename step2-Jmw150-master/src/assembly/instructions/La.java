package assembly.instructions;

/**
 * Class corresponding to RISC-V pseudo-instruction LA
 * 
 * Models: la dest address #dest = address
 */
public class La extends Instruction {

    /**
     * Initializes an LA instruction that will print LA dest 0xaddrr
     * 
     * @param dest destination operand
     * @param address address to put in destination
     */
    public La(String dest, String address) {
        super();
        this.dest = dest;
        this.label = address;
        this.oc = OpCode.LA;
    }

    /**
     * @return "LA dest address" with address in hex
     */
    public String toString() {
        return this.oc + " " + this.dest + ", " + String.format("0x%x",  Integer.parseInt(this.label));
    }
}