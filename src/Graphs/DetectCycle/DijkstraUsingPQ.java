package Graphs.DetectCycle;

import java.util.*;


public class DijkstraUsingPQ {
    static class Node {
        int vertex , weight;
        Node(int vertex,int weight)
        {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static int[] dijkstra(int V,List<List<Node>> adjLst,int source)
    {
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);

        dist[0] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((v1,v2) -> v1.weight - v2.weight);
        pq.add(new Node(source,0));

        while(pq.size() > 0){
            Node curr = pq.poll();

            for (Node n : adjLst.get(curr.vertex)){
                if(dist[curr.vertex] + n.weight < dist[n.vertex]){
                    dist[n.vertex] = dist[curr.vertex] + n.weight;

                    pq.add(new Node(n.vertex , dist[n.vertex]));
                }
            }
        }
        return dist;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int V , E;
        System.out.println("Enter Vertex : ");
        V = in.nextInt();
        System.out.println("Enter Edges : ");
        E = in.nextInt();

        List<List<Node>> adjLst = new ArrayList<>();
        for (int i=0;i<V;i++)
        {
            adjLst.add(new ArrayList<>());
        }
        System.out.println("Enter Edges : ");
        for (int i = 0;i<E;i++)
        {
            int from, to, weight;
            System.out.println("From -> to -> weight");
            from  = in.nextInt();
            to  = in.nextInt();
            weight = in.nextInt();
            adjLst.get(from).add(new Node(to,weight));
        }

        int[] dist = dijkstra(V,adjLst,0);

        System.out.println(Arrays.toString(dist));
    }
}