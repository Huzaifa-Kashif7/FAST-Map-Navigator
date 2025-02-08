import java.util.ArrayList;

public class Vertex {
    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String inputData){
        this.data = inputData;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Vertex endVertex, Integer weight){
        this.edges.add(new Edge(this, endVertex, weight));
    }

    public void removeEdge(Vertex endVertex){
        this.edges.removeIf(edge -> edge.getEndVertex().equals(endVertex));
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public String getData() {
        return data;
    }

    public void print(boolean showWeight){
        String message = "";

        if(this.edges.size() == 0){
            System.out.println(this.data + " --> ");
            return;
        }

        for(int i = 0 ; i < this.edges.size() ; i ++){
            if(i == 0){
                message += this.edges.get(i).getStartVertex().data + " --> ";
            }

            message += this.edges.get(i).getEndVertex().data;

            if(showWeight){
                message += " (" + this.edges.get(i).getWeight() + ")";
            }
            //if we do not get to the the last vertex, continue adding the message, if it exists.
            if(i != this.edges.size() - 1){
                message += ", ";
            }
        }
        System.out.println(message);
    }
}
