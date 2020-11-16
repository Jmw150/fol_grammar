package assembly.instructions;

/**
 * Superclass for 3-operand instructions
 * 
 * Models: op dest src1 src2 #dest = src1 op src2
 */
public abstract class Instruction3O extends Instruction {
	
	protected Instruction3O(String src1, String src2, String dest) {
		super();

		this.src1 = src1;
		this.src2 = src2;
		this.dest = dest;
	}

	/**
	 * @return "op dest src1 src2"
	 */
	public String toString() {
		return this.oc + " " + this.dest + ", " + this.src1 + ", " + this.src2;
	}
}