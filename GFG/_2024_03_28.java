package POTD.GFG;

import java.util.Arrays;

public class _2024_03_28 {

    class Solution {
        public int findCity(int n, int m, int[][] edges, int distanceThreshold)
        {

            int graph[][]=new int[n][n];

            for(int a[]:graph)
            {
                Arrays.fill(a,Integer.MAX_VALUE);
            }

            for(int i=0;i<edges.length;i++)
            {
                int src=edges[i][0];
                int des=edges[i][1];
                int weight=edges[i][2];
                graph[src][des]=weight;
                graph[des][src]=weight;
            }

            for(int i=0;i<n;i++)
            {
                graph[i][i]=0;
            }

            for(int k=0;k<n;k++)
            {
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        if(graph[i][k]!=Integer.MAX_VALUE&&graph[k][j]!=Integer.MAX_VALUE)
                        {
                            graph[i][j]=Math.min(graph[i][j],graph[i][k]+graph[k][j]);
                        }
                    }
                }
            }

            int minCount=n;
            int bestCity=-1;

            for(int i=0;i<n;i++)
            {
                int city=0;
                for(int j=0;j<n;j++)
                {
                    if(graph[i][j]<=distanceThreshold)
                    {
                        city++;
                    }

                }

                if(city<=minCount)
                {
                    minCount=city;
                    bestCity=i;
                }

            }
            return bestCity;

        }
    }
}
