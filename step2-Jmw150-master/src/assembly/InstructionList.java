package assembly;

import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import assembly.instructions.Instruction;

public class InstructionList implements Collection<Instruction> {

	
	List<Instruction> nodes;
	
	InstructionList() {
		nodes = new LinkedList<Instruction>();
	}
		
	@Override
	public Iterator<Instruction> iterator() {
		return nodes.iterator();
	}

	@Override
	public int size() {
		return nodes.size();
	}

	@Override
	public boolean isEmpty() {
		return nodes.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return nodes.contains(o);
	}

	@Override
	public Object[] toArray() {
		return nodes.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return nodes.toArray(a);
	}

	@Override
	public boolean add(Instruction i) {
		return nodes.add(i);
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return nodes.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Instruction> c) {
		boolean retval = false;
		for (Instruction i : c) {
			retval |= add(i);
		}
		return retval;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		
		StringWriter sw = new StringWriter();
		
		for (Instruction ir : nodes) {
			sw.write(ir.toString());
			sw.write("\n");
		}

		return sw.toString();
	}
	
}
