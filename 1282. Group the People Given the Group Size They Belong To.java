class Solution {
    public List<List<Integer>> groupThePeople(final int[] groupSizes) {
        final int n = groupSizes.length;
        final List<Integer>[] buckets = new List[n + 1];
        final List<List<Integer>> result = new ArrayList<>();

        for(int id = 0; id < n; ++id) {
            final int size = groupSizes[id];

            if(buckets[size] == null)
                buckets[size] = new ArrayList<>();

            buckets[size].add(id);

            if(buckets[size].size() == size) {
                result.add(buckets[size]);
                buckets[size] = new ArrayList<>();
            }
        }

        return result;
    }
}
