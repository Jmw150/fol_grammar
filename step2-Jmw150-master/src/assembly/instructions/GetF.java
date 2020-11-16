package assembly.instructions;

/**
 * Class for magic instruction to read float from user
 * 
 * Models getf dest #dest = [read from console]
 */
public class GetF extends Instruction {

    /**
     * Initializes a GETF instruction that will print getf dest
     * 
     * @param dest Destination register
     */
    public GetF(String dest) {
        super();
        this.dest = dest;
        this.oc = OpCode.GETF;
    }

    /**
     * @return "GETF dest"
     */
    public String toString() {
        return this.oc + " " + this.dest;
    }
}