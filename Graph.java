import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Graph {
	// This is an adjacency list, implemented as a HashMap. Each vertex
	// is a String, and attached to each string is a list of other strings
	private HashMap<String, ArrayList<String>> list = new HashMap<>();
	
	/** This creates a new node in the graph with no edges on it.
	 * If the node already exists, it does nothing.
	 */
	public void add(String s) {
		if (list.containsKey(s) == false) {
			list.put(s, new ArrayList<String>());
		}
	}
	
	/**
	 * This adds an edge s,t to the graph. If the edge already exists,
	 * nothing happens. If either the two vertices do not exist, it does
	 * nothing.
	 */
	public void add(String s, String t) {
		if (list.containsKey(s) == false) {
			System.err.println("Cannot create edge " + s + "," + t + " when node " + s + " does not exist ");
		}
		else if (list.containsKey(t) == false) {
			System.err.println("Cannot create edge " + s + "," + t + " when node " + s + " does not exist ");
		}
		else if (list.get(s).contains(t) == false) {
			list.get(s).add(t);
			list.get(t).add(s);
		}
	}

	/** Outputs the graph in adjacency list format.
	 */
	public String toString() {
		String output = "";
		for (Entry<String, ArrayList<String>> e : list.entrySet()) {
			output += e.getKey() + ": " + e.getValue() + "\n";
		}
		return output;
	}

	/**
	 * Returns an arraylist of the neighbours of the given vertex v
	 */
	public ArrayList<String> getNbrs(String v) {
		return list.get(v);
	}
	
	/**
	 * Returns the degree of the given v
	 */
	public int degree(String v) {
		return getNbrs(v).size();
	}

	/**
	 * Determines whether the passed in s exists as a node in this graph 
	 */
	public boolean containsName(String s) {
		return list.containsKey(s);
	}
}
