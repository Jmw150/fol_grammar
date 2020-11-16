package assembly.instructions;

/**
 * Absstract class for load store instructions. Used because they print the same way:
 */
public abstract class InstructionLS extends Instruction {
	

	InstructionLS(String reg1, String reg2, String offset) {
		super();

		this.dest = reg1;
		this.src1 = reg2;
		this.label = offset;
	}

	/**
	 * @return "op dest label(src1)"
	 */
	public String toString() {
		return this.oc + " " + this.dest + ", " + this.label + "(" + this.src1 + ")";
	}
}