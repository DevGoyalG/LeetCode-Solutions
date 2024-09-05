class Solution(object):
    def mergeSimilarItems(self, items1, items2):
        """
        :type items1: List[List[int]]
        :type items2: List[List[int]]
        :rtype: List[List[int]]
        """
        valuemap = {}

        for item in items1:
            value, weight = item
            valuemap[value] = valuemap.get(value, 0) + weight
        
        for item in items2:
            value, weight = item
            valuemap[value] = valuemap.get(value, 0) + weight
        
        result = []

        for key, value in valuemap.items():
            result.append((key, value))
        
        result.sort()
        
        return result
