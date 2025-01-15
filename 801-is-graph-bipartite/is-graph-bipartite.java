class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BiapartilePair> q=new LinkedList<>();
            HashMap<Integer,Integer> visited=new HashMap<>();
            for(int vtx=0;vtx<graph.length;vtx++){
                if (visited.containsKey(vtx)){
                    continue;
                }
                q.add(new BiapartilePair(vtx,0));
                //BFS
                while (!q.isEmpty()){
                    //remove
                  BiapartilePair rp=q.poll();  
                    //Inore
                    if(visited.containsKey(rp.vtx)){
                        if(visited.get(rp.vtx)!=rp.dis){//oddd length cycle
                            return false;
                        }
                        continue;
                    }
                    //Add visited
                    visited.put(rp.vtx, rp.dis);
                    
                    //ADD UNVISITED NBRS
                    for (int nbrs:graph[rp.vtx]){
                        if(!visited.containsKey(nbrs)){
                            q.add(new BiapartilePair(nbrs, rp.dis+1));
                        }
                    }
                    
                }
            }
            return true;
        
    }
}

 class  BiapartilePair{
        int vtx;
        int dis;
        public  BiapartilePair(int vtx,int dis){
            this.dis=dis;
            this.vtx=vtx;
        }
    }