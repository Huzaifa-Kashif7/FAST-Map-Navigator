import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean isDirected, boolean isWeighted) {
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
        this.vertices = new ArrayList<>();
    }

    public Vertex addVertex(String data) {
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        if (!this.isWeighted) {
            weight = null;
        }
        vertex1.addEdge(vertex2, weight);
        if (!this.isDirected) {
            vertex2.addEdge(vertex1, weight);
        }
    }

    public void removeEdge(Vertex vertex1, Vertex vertex2) {
        vertex1.removeEdge(vertex2);
        if (!this.isDirected) {
            vertex2.removeEdge(vertex1);
        }
    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public Vertex getVertexByValue(String value) {
        for (Vertex v : this.vertices) {
            if (v.getData() == value) {
                return v;
            }
        }

        return null;
    }

    public void print() {
        for (Vertex v : this.vertices) {
            v.print(isWeighted);
        }
    }

    public static void main(String[] args) {
        System.out.println("                                                                   **FAST MAP NAVIGATOR**");

        Graph testGraph = new Graph(false, true);
        TraverserGraph t = new TraverserGraph();
        Vertex Main_Gate = testGraph.addVertex("Main_Gate");
        Vertex CS_Building = testGraph.addVertex("CS_Building");
        Vertex EE_Building = testGraph.addVertex("EE_Building");
        Vertex New_Building = testGraph.addVertex("New_Building");
        Vertex Futsal_Ground = testGraph.addVertex("Futsal_Ground");
        Vertex Games_Room = testGraph.addVertex("Games_Room");
        Vertex Badminton_Court = testGraph.addVertex("Badminton_Court");
        Vertex BasketBall_Court = testGraph.addVertex("BasketBall_Court");
        Vertex EE_Cafe = testGraph.addVertex("EE_Cafe");
        Vertex NewBuilding_Cafe = testGraph.addVertex("NewBuilding_Cafe");
        Vertex Chai_Dhabba = testGraph.addVertex("Chai_Dhabba");
        Vertex Mosque = testGraph.addVertex("Mosque");

        Vertex[] verticesOfGraph = {Main_Gate, CS_Building, EE_Building, New_Building, Futsal_Ground, Games_Room, Badminton_Court, BasketBall_Court, EE_Cafe, NewBuilding_Cafe, Chai_Dhabba, Mosque};

        testGraph.addEdge(Main_Gate, CS_Building, 50);
        testGraph.addEdge(Main_Gate, EE_Building, 70);
        testGraph.addEdge(Main_Gate, New_Building, 100);
        testGraph.addEdge(Main_Gate, Futsal_Ground, 120);
        testGraph.addEdge(Main_Gate, Games_Room, 125);
        testGraph.addEdge(Main_Gate, Badminton_Court, 115);
        testGraph.addEdge(Main_Gate, BasketBall_Court, 35);
        testGraph.addEdge(Main_Gate, EE_Cafe, 75);
        testGraph.addEdge(Main_Gate, NewBuilding_Cafe, 105);
        testGraph.addEdge(Main_Gate, Chai_Dhabba, 90);
        testGraph.addEdge(Main_Gate, Mosque, 60);

        //////////////////////////////
        testGraph.addEdge(CS_Building, EE_Building, 35);
        testGraph.addEdge(CS_Building, New_Building, 35);
        testGraph.addEdge(CS_Building, Futsal_Ground, 65);
        testGraph.addEdge(CS_Building, Games_Room, 60);
        testGraph.addEdge(CS_Building, Badminton_Court, 70);
        testGraph.addEdge(CS_Building, BasketBall_Court, 25);
        testGraph.addEdge(CS_Building, EE_Cafe, 30);
        testGraph.addEdge(CS_Building, NewBuilding_Cafe, 40);
        testGraph.addEdge(CS_Building, Chai_Dhabba, 40);
        testGraph.addEdge(CS_Building, Mosque, 10);

        /////////////////////////
        testGraph.addEdge(EE_Building, New_Building, 70);
        testGraph.addEdge(EE_Building, Futsal_Ground, 85);
        testGraph.addEdge(EE_Building, Games_Room, 90);
        testGraph.addEdge(EE_Building, Badminton_Court, 80);
        testGraph.addEdge(EE_Building, BasketBall_Court, 60);
        testGraph.addEdge(EE_Building, EE_Cafe, 10);
        testGraph.addEdge(EE_Building, NewBuilding_Cafe, 75);
        testGraph.addEdge(EE_Building, Chai_Dhabba, 55);
        testGraph.addEdge(EE_Building, Mosque, 40);

        ////////////////////////
        testGraph.addEdge(New_Building, Futsal_Ground, 15);
        testGraph.addEdge(New_Building, Games_Room, 20);
        testGraph.addEdge(New_Building, Badminton_Court, 25);
        testGraph.addEdge(New_Building, BasketBall_Court, 55);
        testGraph.addEdge(New_Building, EE_Cafe, 70);
        testGraph.addEdge(New_Building, NewBuilding_Cafe, 10);
        testGraph.addEdge(New_Building, Chai_Dhabba, 30);
        testGraph.addEdge(New_Building, Mosque, 55);

        ///////////////////////
        testGraph.addEdge(Futsal_Ground, Games_Room, 5);
        testGraph.addEdge(Futsal_Ground, Badminton_Court, 15);
        testGraph.addEdge(Futsal_Ground, BasketBall_Court, 35);
        testGraph.addEdge(Futsal_Ground, EE_Cafe, 80);
        testGraph.addEdge(Futsal_Ground, NewBuilding_Cafe, 20);
        testGraph.addEdge(Futsal_Ground, Chai_Dhabba, 45);
        testGraph.addEdge(Futsal_Ground, Mosque, 60);

        /////////////////////
        testGraph.addEdge(Games_Room, Badminton_Court, 25);
        testGraph.addEdge(Games_Room, BasketBall_Court, 45);
        testGraph.addEdge(Games_Room, EE_Cafe, 85);
        testGraph.addEdge(Games_Room, NewBuilding_Cafe, 30);
        testGraph.addEdge(Games_Room, Chai_Dhabba, 50);
        testGraph.addEdge(Games_Room, Mosque, 75);

        ////////////////////
        testGraph.addEdge(Badminton_Court, BasketBall_Court, 40);
        testGraph.addEdge(Badminton_Court, EE_Cafe, 90);
        testGraph.addEdge(Badminton_Court, NewBuilding_Cafe, 35);
        testGraph.addEdge(Badminton_Court, Chai_Dhabba, 65);
        testGraph.addEdge(Badminton_Court, Mosque, 85);

        ///////////////////
        testGraph.addEdge(BasketBall_Court, EE_Cafe, 60);
        testGraph.addEdge(BasketBall_Court, NewBuilding_Cafe, 60);
        testGraph.addEdge(BasketBall_Court, Chai_Dhabba, 65);
        testGraph.addEdge(BasketBall_Court, Mosque, 75);

        //////////////////
        testGraph.addEdge(EE_Cafe, NewBuilding_Cafe, 80);
        testGraph.addEdge(EE_Cafe, Chai_Dhabba, 70);
        testGraph.addEdge(EE_Cafe, Mosque, 30);

        /////////////////
        testGraph.addEdge(NewBuilding_Cafe, Chai_Dhabba, 35);
        testGraph.addEdge(NewBuilding_Cafe, Mosque, 60);

        /////////////////
        testGraph.addEdge(Chai_Dhabba, Mosque, 40);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your starting point: \n1) Main Gate\n2) CS_Building\n3) EE Building\n4) New Building\n5) Futsal Ground\n6) Games Room\n7) Badminton Court\n8) " +
                "Basket Ball Court\n9) EE Cafe\n10) New Building Cafe\n11) Chai Dhabba\n12) Mosque\n");
        System.out.print("Enter the number: ");
        int startingPoint = sc.nextInt();
        boolean ExitStatus = false;

        while (!ExitStatus) {
            System.out.println("\n**THE GRAPH**\n");
            testGraph.print();
            System.out.println("\nEnter The operation:                 [Your Current Position: " + verticesOfGraph[startingPoint - 1].getData() + "]\n1) Depth First Traversal of the complete graph from Main Gate\n2) Breadth First Traversal of complete graph from Main Gate\n3) Shortest distance to all the points\n4) Travel to another point via the shortest distance\n5) Exit\n");
            System.out.print("Enter the number: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                ArrayList<Vertex> visitedVertices1 = new ArrayList<>();
                visitedVertices1.add(t.getStartingVertex());
                System.out.println("\nDepth First Traversal of the complete graph from Main Gate\n");
                GraphTraverser.depthFirstTraversal(t.getStartingVertex(), visitedVertices1);
            } else if (choice == 2) {
                ArrayList<Vertex> visitedVertices2 = new ArrayList<>();
                visitedVertices2.add(t.getStartingVertex());
                System.out.println("\nBreadth First Traversal of complete graph from Main Gate\n");
                GraphTraverser.breadthFirstTraversal(t.getStartingVertex(), visitedVertices2);
            } else if (choice == 3) {
                Dijkstra.dijkstraResultPrinter(Dijkstra.dijkstra(testGraph, verticesOfGraph[startingPoint - 1]));
            } else if (choice == 4) {
                System.out.println("\nEnter the travel point: \n1) Main Gate\n2) CS_Building\n3) EE Building\n4) New Building\n5) Futsal Ground\n6) Games Room\n7) Badminton Court\n8) " +
                        "Basket Ball Court\n9) EE Cafe\n10) New Building Cafe\n11) Chai Dhabba\n12) Mosque\n");
                System.out.print("Enter the number: ");
                int travelPoint = sc.nextInt();

                Dijkstra.shortestPathBetween(testGraph, verticesOfGraph[startingPoint - 1], verticesOfGraph[travelPoint - 1]);
                startingPoint = travelPoint;
            } else {
                ExitStatus = true;
            }
        }
    }
}