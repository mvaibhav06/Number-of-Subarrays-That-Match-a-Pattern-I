public class SubArrayPattern {
    public static int countMatchingSubarrays(int[] nums, int[] pattern) {
        int out = 0;
        for(int i=0; i<nums.length-pattern.length; i++){
            int j = 0;
            for(j=0; j<pattern.length; j++){
                if(pattern[j] == 0 && nums[i+j]==nums[i+j+1]){
                    System.out.println("0");
                }else if(pattern[j]==1 && nums[i+j]<nums[i+j+1]){
                    System.out.println("1");
                }
                else if(pattern[j]==-1 && nums[i+j]>nums[i+j+1]){
                    System.out.println("-1");
                }else{
                    break;
                }
            }
            if(j == pattern.length){
                out++;
            }
        }
        System.out.println("out" + out);
        return out;
    }

    public static void main(String[] args) {
        int[] pattern = {1,0,-1};
        int[] nums = {1,4,4,1,3,5,5,3};
        System.out.println(countMatchingSubarrays(nums,pattern));
    }
}
