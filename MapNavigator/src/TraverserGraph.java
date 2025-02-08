public class TraverserGraph {
    private Graph testGraph;

    public TraverserGraph(){
        this.testGraph = new Graph(true, false);
        Vertex startNode = testGraph.addVertex("Main_Gate");
        Vertex cs = this.testGraph.addVertex("CS_Building");
        Vertex ee = this.testGraph.addVertex("EE_Building");
        Vertex newB = this.testGraph.addVertex("New_Building");
        Vertex fut = this.testGraph.addVertex("Futsal_Ground");
        Vertex game = this.testGraph.addVertex("Games_Room");
        Vertex badmintonCourt = this.testGraph.addVertex("Badminton_Court");
        Vertex basketBallCourt = this.testGraph.addVertex("BasketBall_Court");
        Vertex newBC = this.testGraph.addVertex("NewBuilding_Cafe");
        Vertex cd = this.testGraph.addVertex("Chai_Dhabba");
        Vertex m = this.testGraph.addVertex("Mosque");
        Vertex eec = this.testGraph.addVertex("EE_Cafe");


        this.testGraph.addEdge(startNode, cs, null);
        this.testGraph.addEdge(startNode, ee, null);

        this.testGraph.addEdge(startNode, newB, null);
        this.testGraph.addEdge(cs, basketBallCourt, null);
        this.testGraph.addEdge(cs, newB, null);

        this.testGraph.addEdge(cs, ee, null);
        this.testGraph.addEdge(cs, cd, null);
        this.testGraph.addEdge(cs, m, null);
        this.testGraph.addEdge(newB, fut, null);

        this.testGraph.addEdge(newB, newBC, null);
        this.testGraph.addEdge(fut, badmintonCourt, null);
        this.testGraph.addEdge(fut, game, null);
        this.testGraph.addEdge(newBC, game, null);

        this.testGraph.addEdge(cd, newBC, null);
        this.testGraph.addEdge(m, cd, null);
        this.testGraph.addEdge(eec, m, null);
        this.testGraph.addEdge(ee, eec, null);
    }

    public Vertex getStartingVertex(){
        return this.testGraph.getVertices().get(0);
    }
}
