package assembly.instructions;

/**
 * Class for magic instruction to read integer from user
 * 
 * Models geti dest #dest = [read from console]
 */
public class GetI extends Instruction {

    /**
     * Initializes a GETI instruction that will print geti dest
     * 
     * @param dest Destination register
     */
    public GetI(String dest) {
        super();
        this.dest = dest;
        this.oc = OpCode.GETI;
    }

    /**
     * @return "GETI dest"
     */
    public String toString() {
        return this.oc + " " + this.dest;
    }
}