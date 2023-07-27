class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mapp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mapp.put(c, mapp.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> v = new ArrayList<>(mapp.entrySet());

        Collections.sort(v, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });

        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : v) {
            char c = entry.getKey();
            int freq = entry.getValue();

            while (freq-- > 0) {
                ans.append(c);
            }
        }

        return ans.toString();

        //Another Method of priority queue
        // Map<Character, Integer> mapp = new HashMap<>();
        // for (char c : s.toCharArray()) {
        //     mapp.put(c, mapp.getOrDefault(c, 0) + 1);
        // }

        // PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
        //         (a, b) -> b.getValue() - a.getValue() 
        // );

        // pq.addAll(mapp.entrySet());

        // StringBuilder ans = new StringBuilder();
        // while (!pq.isEmpty()) {
        //     Map.Entry<Character, Integer> entry = pq.poll();
        //     char c = entry.getKey();
        //     int freq = entry.getValue();
     
        //     while (freq-- > 0) {
        //         ans.append(c);
        //     }
        // }

        // return ans.toString();
    }
}