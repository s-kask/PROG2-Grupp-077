public class Edge<N> {
    private final N destination;
    private final String name;
    private int weight;

    public Edge(N destination, String name, int weight) {
        this.destination = destination;
        this.name = name;
        this.weight = weight;
    }

    public N getDestination() {
        return destination;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
