class Solution:
    def arrayRankTransform(self, arr):
        rank_map = {}
        
        rank = 1
        for val in sorted(set(arr)):
            rank_map[val] = rank
            rank += 1
        
        result = [rank_map[val] for val in arr]
        
        return result
