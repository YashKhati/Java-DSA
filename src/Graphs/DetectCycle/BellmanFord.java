package Graphs.DetectCycle;

import java.util.*;

public class BellmanFord
{
    public static int[] BellmanFordPath(int V, List<List<Integer>> adjLst, int source)
    {
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source] = 0;

        for(List<Integer> it : adjLst)
        {
            int u = it.get(0);
            int v = it.get(1);
            int w = it.get(2);

            if((dist[u] != Integer.MAX_VALUE ) && dist[u] + w < dist[v])
            {
                dist[v] = dist[u] + w;
            }
        }

        // check for -ve cycle
        for(List<Integer> it : adjLst)
        {
            int u = it.get(0);
            int v = it.get(1);
            int w = it.get(2);

            if((dist[u] != Integer.MAX_VALUE ) && dist[u] + w < dist[v])
            {
                int[] temp = new int[1];
                temp[0] = -1;
                return  temp;
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

        List<List<Integer>> adjLst = new ArrayList<>();

        System.out.println("Enter Edges : ");
        for (int i = 0;i<E;i++)
        {
            int from, to, weight;
            System.out.println("From -> to -> weight");
            from  = in.nextInt();
            to  = in.nextInt();
            weight = in.nextInt();
            adjLst.add(new ArrayList<Integer>(Arrays.asList(from,to,weight)));
        }

        int[] dis = BellmanFordPath(V,adjLst,0);

        for (int i = 0; i < dis.length; i++) {
            System.out.print(dis[i] + " ");
        }
        System.out.println("");
    }
}
