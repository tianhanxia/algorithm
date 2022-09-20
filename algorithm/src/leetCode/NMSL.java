package leetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NMSL {
    public int solution(int N, int[] A, int[] B) {
        Map<String, Integer> map = new HashMap<>();

        return -1;
    }

    private int dfs(int s, List<List<Integer>> adj,boolean visited[],
                   int nodes)
    {
        // Adding all the edges connected to the vertex
        int adjListSize = adj.get(s).size();
        visited[s] = true;
        for (int i = 0; i < adj.get(s).size(); i++)
        {
            if (visited[adj.get(s).get(i)] == false)
            {
                adjListSize += dfs(adj.get(s).get(i), adj, visited, nodes);
            }
        }
        return adjListSize;
    }

    private int maxEdges(List<List<Integer>> adj, int nodes)
    {
        int res = Integer.MIN_VALUE;
        boolean visited[]=new boolean[nodes+1];
        for (int i = 1; i <= nodes; i++)
        {
            if (visited[i] == false)
            {
                int adjListSize = dfs(i, adj, visited, nodes);
                res = Math.max(res, adjListSize/2);
            }
        }
        return res;
    }
}
