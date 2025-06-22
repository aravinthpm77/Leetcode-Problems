class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=(int) Math.max(max,nums[i]);
        }
        int count[] = new int[max+1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
        for(int i=0; i<count.length; i++){
            if(checkPrime(count[i])){
                return true;
            }
        }
        return false;
    }

    public boolean checkPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;

    for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
}
