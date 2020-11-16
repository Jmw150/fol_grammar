package compiler;

public class GlobalScope extends Scope {
	
	private int globalBase;
	private int stringBase;
	
	public GlobalScope(int stringBase, int globalBase) {
		this(null, stringBase, globalBase);	
	}
	
	public GlobalScope(Scope parent, int stringBase, int globalBase) {
		super(parent);
		name = "GLOBAL";
		this.globalBase = globalBase;
		this.stringBase = stringBase;
	}

	@Override
	protected SymbolTableEntry genSymbol(compiler.Scope.Type type, String name) {
		int addr = globalBase;
		SymbolTableEntry ste = new SymbolTableEntry(type, name, addr, false);
		globalBase += 4;
		return ste;
	}

	@Override
	protected StringSymbolTableEntry genStringSymbol(compiler.Scope.Type type, String name, String value) {
		int addr = stringBase;
		StringSymbolTableEntry ste = new StringSymbolTableEntry(type, name, value, addr, false);
		stringBase += 4;
		return ste;
	}

	@Override
	protected SymbolTableEntry searchLocalScope(String name) {
		return table.get(name);
	}
	
}