from collections import defaultdict

class Solution:
    def smallestRange(self, nums):
        all_nums = []
        
        # Merge lists with list index
        for i, group in enumerate(nums):
            for num in group:
                all_nums.append((num, i))
        
        all_nums.sort()  # Sort by number
        
        count = defaultdict(int)
        l, r = 0, 0
        total_lists = len(nums)
        unique_lists_in_window = 0
        min_range = float('inf')
        result = [0, 0]
        
        while r < len(all_nums):
            count[all_nums[r][1]] += 1
            if count[all_nums[r][1]] == 1:
                unique_lists_in_window += 1
            
            while unique_lists_in_window == total_lists:
                current_range = all_nums[r][0] - all_nums[l][0]
                if current_range < min_range:
                    min_range = current_range
                    result = [all_nums[l][0], all_nums[r][0]]
                
                count[all_nums[l][1]] -= 1
                if count[all_nums[l][1]] == 0:
                    unique_lists_in_window -= 1
                l += 1
            
            r += 1
        
        return result
