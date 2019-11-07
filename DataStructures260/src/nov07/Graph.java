package nov07;

//Vickie Wu
//11/7/19

//displayVertices() & displayEdges() line 42

class Graph {
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; // list of vertices
	private int adjMat[][]; // adjacency matrix
	private int nVerts; // current number of vertices

	// -----------------------------------------------------------
	public Graph() // constructor
	{
		vertexList = new Vertex[MAX_VERTS];
		// adjacency matrix
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for (int j = 0; j < MAX_VERTS; j++) // set adjacency
			for (int k = 0; k < MAX_VERTS; k++) // matrix to 0
				adjMat[j][k] = 0;
	} // end constructor
		// -----------------------------------------------------------

	public void addVertex(char lab) {
		vertexList[nVerts++] = new Vertex(lab);
	}

	// -----------------------------------------------------------
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
	}

	// ------------------------------------------------------------
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label);
	}

	// -------------------------------------------------------------------------------------------------------------
	public void displayVertices() {
		for (int i = 0; i < nVerts; i++) {
			//System.out.print(vertexList[i].label + " ");
			displayVertex(i);
		}

	}

	public void displayEdges() {
		for (int r = 0; r < adjMat.length; r++) {
			for (int c = 0; c < adjMat[0].length; c++) {
				if (adjMat[r][c] == 1) {
					System.out.println(vertexList[r].label + "--" + vertexList[c].label);
				}
			}
		}
	}

	// ------------------------------------------------------------
} // end class G