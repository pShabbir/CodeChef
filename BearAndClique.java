import java.util.*;
class BearAndClique{

  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    BearAndClique myObj = new BearAndClique();
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

    // for(int i=0;i<n;i++){
    //   for(int j=0;j<n;j++){
    //     System.out.print(arr[i][j]+" ");
    //   }
    //   System.out.println();
    // }

    floydWarshall(arr,n,s-1);
  }

  void floydWarshall(int graph[][],int V,int s)
 {
     int dist[][] = new int[V][V];
     int i, j, k;

     /* Initialize the solution matrix same as input graph matrix.
        Or we can say the initial values of shortest distances
        are based on shortest paths considering no intermediate
        vertex. */
     for (i = 0; i < V; i++)
         for (j = 0; j < V; j++)
             dist[i][j] = graph[i][j];

     /* Add all vertices one by one to the set of intermediate
        vertices.
       ---> Before start of a iteration, we have shortest
            distances between all pairs of vertices such that
            the shortest distances consider only the vertices in
            set {0, 1, 2, .. k-1} as intermediate vertices.
       ----> After the end of a iteration, vertex no. k is added
             to the set of intermediate vertices and the set
             becomes {0, 1, 2, .. k} */
     for (k = 0; k < V; k++)
     {
         // Pick all vertices as source one by one
         for (i = 0; i < V; i++)
         {
             // Pick all vertices as destination for the
             // above picked source
             for (j = 0; j < V; j++)
             {
                 // If vertex k is on the shortest path from
                 // i to j, then update the value of dist[i][j]
                 if (dist[i][k] + dist[k][j] < dist[i][j])
                     dist[i][j] = dist[i][k] + dist[k][j];
             }
         }
     }

     // Print the shortest distance matrix
    //  for( i=0;i<V;i++){
    //    for( j=0;j<V;j++){
    //      System.out.print(graph[i][j]+" ");
    //    }
    //    System.out.println();
    //  }
    for (i=0;i<V ;i++ ) {
      System.out.print(" "+graph[s][i]);
    }
 }

  // public void dijkstra(int graph[][], int src,int V)
  //   {
  //       int dist[] = new int[V]; // The output array. dist[i] will hold
  //                                // the shortest distance from src to i
  //
  //       // sptSet[i] will true if vertex i is included in shortest
  //       // path tree or shortest distance from src to i is finalized
  //       Boolean sptSet[] = new Boolean[V];
  //
  //       // Initialize all distances as INFINITE and stpSet[] as false
  //       for (int i = 0; i < V; i++)
  //       {
  //           dist[i] = Integer.MAX_VALUE;
  //           sptSet[i] = false;
  //       }
  //
  //       // Distance of source vertex from itself is always 0
  //       dist[src] = 0;
  //
  //       // Find shortest path for all vertices
  //       for (int count = 0; count < V-1; count++)
  //       {
  //           // Pick the minimum distance vertex from the set of vertices
  //           // not yet processed. u is always equal to src in first
  //           // iteration.
  //           int u = minDistance(dist, sptSet,V);
  //
  //           // Mark the picked vertex as processed
  //           sptSet[u] = true;
  //
  //           // Update dist value of the adjacent vertices of the
  //           // picked vertex.
  //           for (int v = 0; v < V; v++)
  //
  //               // Update dist[v] only if is not in sptSet, there is an
  //               // edge from u to v, and total weight of path from src to
  //               // v through u is smaller than current value of dist[v]
  //               if (!sptSet[v] && graph[u][v]!=0 &&
  //                       dist[u] != Integer.MAX_VALUE &&
  //                       dist[u]+graph[u][v] < dist[v])
  //                   dist[v] = dist[u] + graph[u][v];
  //       }
  //
  //       // print the constructed distance array
  //       System.out.println("Solution :\n");
  //       //printSolution(dist, V);
  //       for (int i=0;i<V ;i++ ) {
  //         System.out.print(" "+dist[i]);
  //       }
  //       System.out.println("\nSolution Ends");
  //   }

    int minDistance(int dist[], Boolean sptSet[],int V)
   {
       // Initialize min value
       int min = Integer.MAX_VALUE, min_index=-1;

       for (int v = 0; v < V; v++)
           if (sptSet[v] == false && dist[v] <= min)
           {
               min = dist[v];
               min_index = v;
           }

       return min_index;
   }

}
