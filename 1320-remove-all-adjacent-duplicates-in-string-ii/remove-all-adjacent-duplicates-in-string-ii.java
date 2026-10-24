class Solution {
    public String removeDuplicates(String s, int k) {
         int n = s.length();
         Stack<int[]> st = new Stack<>();
         for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(st.empty()){
                st.push(new int[]{c,1});
                continue;
            }if(st.peek()[0] != c){
                  st.push(new int[]{c,1});
                continue; 
            }
            if(st.peek()[1] < k-1){
                st.peek()[1]++;
            }else{
                st.pop();
            }
         }
         StringBuilder res = new StringBuilder();
         while(!st.empty()){
int[] p = st.pop();
for(int j = 0; j < p[1]; j++){
    res.append((char) p[0]);
}
         }
         return res.reverse().toString();
        
    }
}