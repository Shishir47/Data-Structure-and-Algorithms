
public class Main {

	public static void main(String[] args) {
		Graph graph= new Graph(5);
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		//0 is A, 1 is B, 2 is C, 3 is D and 4 is E
		graph.addEdge(0, 1); //Edge between A and B
		graph.addEdge(2, 3); //Edge between C and D
		graph.addEdge(2, 1);
		graph.addEdge(4, 0);
		graph.addEdge(0, 4); //Edge between A and E
		graph.printGraph();
		System.out.println(graph.checkEdge(2, 3));

	}

}
