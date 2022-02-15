class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Boolean> h =new HashMap<Integer,Boolean>();
       ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],true);
            
            
        }
       for(int i=1;i<nums.length+1;i++){
           if(!h.containsKey(i)){
               a.add(i);
                   
               
               
           }
       } 
        
        return a;
    }
}
