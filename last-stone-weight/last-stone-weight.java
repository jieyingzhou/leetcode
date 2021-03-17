class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue(stones.length, Comparator.reverseOrder());
        for(int stone : stones) {
            maxHeap.add(stone);
        }
        while(maxHeap.size() > 1) {
            int stoneOne = maxHeap.remove();
            int stoneTwo = maxHeap.remove();
            if(stoneOne != stoneTwo) {
                maxHeap.add((stoneOne - stoneTwo));
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.remove();
    }
}