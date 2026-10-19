class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
      List<int[] > res = new ArrayList<>();
      int n = firstList.length;
      int m = secondList.length;
      int i = 0, j = 0;

     
while(i < n && j < m){
     int str1 = firstList[i][0];
      int end1 = firstList[i][1];
      int str2 = secondList[j][0];
      int end2 = secondList[j][1];
     
            int str = Math.max(str1,str2);
            int end = Math.min(end1,end2);
            if(str <= end){
  res.add(new int[]{str,end});
            }
          
        
      
    
      if(end1 <= end2){
        i++;
      }else{
        j++;
      }
    
}
return res.toArray(new int[res.size()][]);
    }
}