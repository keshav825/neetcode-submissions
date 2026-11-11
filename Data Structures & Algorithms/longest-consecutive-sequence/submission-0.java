class Solution {
    public int longestConsecutive(int[] nums) {
        int length = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, false);
        }
        for (int num : nums) {
            int currentlength = 1;
            int nextnum = num + 1;
            while (map.containsKey(nextnum) && map.get(nextnum) == false) {
                currentlength++;
                map.put(nextnum, true);
                nextnum++;
            }
            int prevnum=num-1;
            while(map.containsKey(prevnum) && map.get(prevnum)==false){
                currentlength++;
                map.put(prevnum,true);
                prevnum--;
            }
            length=Math.max(length,currentlength);
        }
        return length;
    }
}
