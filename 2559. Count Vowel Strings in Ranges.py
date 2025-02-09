class Solution:
    def vowelStrings(self, words: List[str], queries: List[List[int]]) -> List[int]:
        n = len(words)
        Prefix = [0] * (n + 1)
        vowels = {'a', 'e', 'i', 'o', 'u'}

        for i in range(n):
            Prefix[i + 1] = Prefix[i]
            if words[i][0] in vowels and words[i][-1] in vowels:
                Prefix[i + 1] += 1

        ANS = []
        for query in queries:
            ANS.append(Prefix[query[1] + 1] - Prefix[query[0]])

        return ANS
