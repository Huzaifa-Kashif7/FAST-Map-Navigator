import java.util.ArrayList;

public class GraphTraverser {
    public static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices){
        System.out.println(start.getData());

        for(Edge e : start.getEdges()){
            Vertex neighbor = e.getEndVertex();

            if(!visitedVertices.contains(neighbor)){
                visitedVertices.add(neighbor);
                GraphTraverser.depthFirstTraversal(neighbor, visitedVertices);
            }
        }
    }

    public static void breadthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices){
        Queue visitedQueue = new Queue();
        visitedQueue.enqueue(start);
        while(!visitedQueue.isEmpty()){
            Vertex current = visitedQueue.dequeue();
            System.out.println(current.getData());

            for(Edge e : current.getEdges()){
                Vertex neighbor = e.getEndVertex();
                if(!visitedVertices.contains(neighbor)){
                    visitedVertices.add(neighbor);
                    visitedQueue.enqueue(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        TraverserGraph test = new TraverserGraph();
        Vertex startingVertex = test.getStartingVertex();
        ArrayList<Vertex> visitedVertices1 = new ArrayList<>();
        ArrayList<Vertex> visitedVertices2 = new ArrayList<>();
        //visitedVertices1.add(startingVertex);
        //visitedVertices2.add(startingVertex);

        System.out.println("BFS");
        GraphTraverser.breadthFirstTraversal(startingVertex, visitedVertices1);
        System.out.println("DFS");
        GraphTraverser.depthFirstTraversal(startingVertex, visitedVertices2);
    }
}
