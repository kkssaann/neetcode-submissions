class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        boolean insert = false;
        List<int[]> list2 = new ArrayList<>();

        for(int i = 0 ; i < intervals.length ; i++){
            if(!insert && intervals[i][0] >= newInterval[0]){
                list2.add(new int [] {newInterval[0],newInterval[1]});
                insert = true;
            }
            list2.add(new int [] {intervals[i][0],intervals[i][1]});
        }

        if(!insert){
            list2.add(new int [] {newInterval[0],newInterval[1]});
        }

        int s1 = list2.get(0)[0];
        int e1 = list2.get(0)[1];

        List<int[]> res = new ArrayList<>();

        for(int i = 1 ; i<list2.size() ; i++){
            int s2 = list2.get(i)[0];
            int e2 = list2.get(i)[1];

            if(e1>=s2){
                s1 = s1;
                e1 = Math.max(e1,e2);
                continue;
            }

            res.add(new int[]{s1,e1});

            s1 = s2;
            e1 = e2;
        }
        res.add(new int[]{s1,e1});
        return res.toArray(new int[res.size()][]);
    }
}
