import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class TestMain {

	public static void main(String[] args) throws FileNotFoundException {

		Graph[] g = new Graph[6];
		g[0] = readGraph("small1");
		g[1] = readGraph("small2");
		g[2] = readGraph("medium1");
		g[3] = readGraph("medium2");
		g[4] = readGraph("medium3");
		g[5] = readGraph("medium4");
		
		// This will view the adjacency list of a graph
		System.out.println(g[0]);
		
		for (int i=0; i<6; i++)
			System.out.println(isEulerian(g[i]));

	}
	
	private static boolean isEulerian(Graph graph) {
		ArrayList<String> array1 = new ArrayList();
		ArrayList<String> array2 = new ArrayList();
		return false;
	}
	/**
	 * This function reads a list of edges from a given filename
	 * and returns a simple Graph.
	 */
	public static Graph readGraph(String filename) throws FileNotFoundException {

		FileReader f = new FileReader(filename);
		Scanner sc = new Scanner(f);

		Graph g = new Graph();
		while (sc.hasNext()) {
			String u = sc.next();
			String v = sc.next();
			g.add(u);
			g.add(v);
			g.add(u,v);
		}
		sc.close();
		return g;
	}
}
