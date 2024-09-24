class Solution:
    def maxCoins(self, piles: List[int]) -> int:
        piles.sort()
        q=collections.deque(piles)
        ans=0
        while len(q)>0:
            q.popleft()
            q.pop()
            ans+=q[-1]
            q.pop()
        return ans            
