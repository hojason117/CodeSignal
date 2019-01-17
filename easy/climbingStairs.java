int climbingStairs(int n) {
    HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    return helper(n, memo);
}

int helper(int n, HashMap<Integer, Integer> memo) {
    if(n > 2) {
        Integer step1 = memo.get(n - 1);
        Integer step2 = memo.get(n - 2);
        if(step1 == null) {
            step1 = helper(n - 1, memo);
            memo.put(n - 1, step1);
        }
        if(step2 == null) {
            step2 = helper(n - 2, memo);
            memo.put(n - 2, step2);
        }
        
        return  step1 + step2;
    }
    else if(n == 2)
        return 2;
    else if(n == 1)
        return 1;
    else
        return 0;
}
