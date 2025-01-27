class Solution {
    public int maxUniqueSplit(String s) {
        return solve(0, s, new HashSet<>());
    }
    
    public int solve(int start, String s, Set<String> set) {
        if (start == s.length()) {
            return 0;
        }
        int maxSplits = 0;
        
        for (int i = start + 1; i <= s.length(); i++) {
            String substring = s.substring(start, i);
            
            if (!set.contains(substring)) {
                set.add(substring);
                
                int splits = 1 + solve(i, s, set);

                maxSplits = Math.max(maxSplits, splits);
                set.remove(substring);
            }
        }
        
        return maxSplits;
    }
}
