public class Edge {
    private Vertex startVertex;
    private Vertex endVertex;
    private Integer weight;

    public Edge(Vertex startVertex, Vertex endVertex, Integer weight){
        this.startVertex = startVertex;
        this.endVertex = endVertex;
        this.weight = weight;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }
}
