class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int ch : nums) {
            if (hm.containsKey(ch)) {
                int fre = hm.getOrDefault(ch, 0);
                hm.put(ch, fre + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        for(int ch:hm.keySet()){
            int count=hm.get(ch);
            if(count>1)return true;
        }
        return false;
    }
}