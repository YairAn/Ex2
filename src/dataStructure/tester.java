package dataStructure;

import algorithms.Graph_Algo;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DNode n = new DNode();
		DNode n1 = new DNode();
		DNode n2 = new DNode();
		//DNode n3 = new DNode();


		DGraph DGrahp1 = new DGraph();
		DGrahp1.addNode(n);
		DGrahp1.addNode(n1);
		DGrahp1.addNode(n2);
		//DGrahp1.addNode(n3);

		System.out.println("Edges before conect "+n.EdgesString());
		System.out.println("this is the VErtex "+DGrahp1.getVErtex().toString());
		DGrahp1.connect(0, 1, 2);
		System.out.println("edgesSize "+DGrahp1.edgeSize());
		System.out.println("NodeSize "+DGrahp1.nodeSize());
		System.out.println("n0 Edges after conect "+n.EdgesString());
		
		

		System.out.println("******************");
		//DGrahp1.connect(0, 1, 2);
		DGrahp1.connect(0, 2, 2);
		System.out.println("n0 Edges after conect "+n.EdgesString());

		DGrahp1.connect(1, 0, 2);
		
		
		DGrahp1.connect(1, 2, 2);
		DGrahp1.connect(2, 0, 2);
		DGrahp1.connect(2, 1, 2);
		
		Graph_Algo g = new  Graph_Algo();
		g.init(DGrahp1);
		System.out.println(g.isConnected());
		
	}





}
