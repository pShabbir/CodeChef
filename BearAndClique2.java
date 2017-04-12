import java.util.*;
class BearAndClique2{

  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    BearAndClique2 myObj = new BearAndClique2();
    int n=obj.nextInt();
    for (int i=0;i<n ;i++ ) {
      myObj.calculate(obj);
    }
  }
  public void calculate(Scanner obj){
    int n=obj.nextInt();
    int k=obj.nextInt();
    int x=obj.nextInt();
    int m=obj.nextInt();
    int s=obj.nextInt();
      int[][] arr=new int[n][n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          arr[i][j]=0;
        }

      }
    for(int i=0;i<k;i++){
      for(int j=0;j<k;j++){
        if(i!=j)
          arr[i][j]=x;
      }
    }
    for(int i=0;i<m;i++){
      int a=obj.nextInt();
      int b=obj.nextInt();
      int c=obj.nextInt();
      arr[a-1][b-1]=c;
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

    dijkstra(arr,s-1,n);
  }


  public void dijkstra(int graph[][], int src,int V)
    {
        int dist[] = new int[V]; // The output array. dist[i] will hold
                                 // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V-1; count++)
        {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet,V);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)

                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        // print the constructed distance array
        System.out.println("Solution :\n");
        //printSolution(dist, V);
        for (int i=0;i<V ;i++ ) {
          System.out.print(" "+dist[i]);
        }
        System.out.println("\nSolution Ends");
    }

    int minDistance(int dist[], Boolean sptSet[],int V)
   {
       // Initialize min value
       int min = Integer.MAX_VALUE, min_index=-1;

       for (int v = 0; v < V; v++)
           if (sptSet[v] == fals && dist[v] <= min)
           {
               min = dist[v];
               min_index = v;
           }

       return min_index;
   }

}
