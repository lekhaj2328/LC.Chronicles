class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>();
        
        for (String s : strs) {
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String c = new String(a);
            
            
            m.computeIfAbsent(c, k -> new ArrayList<>()).add(s);
        }
        
        res.addAll(m.values());
        return res;
    }
}
