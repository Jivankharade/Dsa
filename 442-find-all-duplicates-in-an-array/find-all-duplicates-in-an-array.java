class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> arr = new ArrayList<>();
         Set<Integer> set = new HashSet<>();
         for(int num: nums){
            if(set.contains(num)){
                arr.add(num);
            }else{
                set.add(num);
            }                    
          
                                           
         }
         return arr;
        
    }
}