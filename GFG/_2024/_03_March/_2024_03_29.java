package POTD.GFG._2024._03_March;

import java.util.ArrayList;

public class _2024_03_29 {

// User function Template for Java

// class Solution {
//     public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
//         for(ArrayList<Integer> i:adj){
//             if(i.size()%2!=0) return false;
//         }
//         return true;
//     }
// }


    class Solution {
        public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
            //from every vertex there must be even edges
            //cycle must there

            // for(ArrayList<Integer> nbr:adj){
            //     System.out.println(nbr.size());
            // }

            return evenEdges(adj);
        }
        boolean evenEdges(ArrayList<ArrayList<Integer>> adj){
            for(ArrayList<Integer> nbr:adj){
                if(nbr.size()%2==1) return false;
            }
            return true;
        }
        boolean cycle(int i,int par,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
            vis[i]=true;
            for(Integer nbr:adj.get(i)){
                if(par==nbr)    continue;

                if(vis[nbr]){
                    return true;
                }else{
                    if(cycle(nbr,i,adj,vis))    return true;
                }

            }
            return false;
        }
    }
}
