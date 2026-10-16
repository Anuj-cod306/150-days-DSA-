class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> temp = new ArrayList<>();
        boolean flag = false;
        for(int i = 0; i< n; i++){
            if(flag == false && newInterval[0] < intervals[i][0]){
                temp.add(newInterval);
                flag = true;
            }
            temp.add(new int[]{intervals[i][0],intervals[i][1]});
        }
        if(flag == false){
            temp.add(newInterval);
        }
        List<int[]> res = new ArrayList<>();
        int start1 = temp.get(0)[0];
        int end1 = temp.get(0)[1];
        for(int i = 1; i<temp.size(); i++){
            int start2 = temp.get(i)[0];
            int end2 = temp.get(i)[1];
            if(end1 >= start2){
                end1 = Math.max(end1, end2);
            }else{
            res.add(new int[]{start1,end1});
            start1 = start2;
            end1 = end2;
        }
        }
        res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][]);
        
    }
}