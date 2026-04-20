class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<int[]> stack = new Stack<int[]>();
        int[] result = new int[temperatures.length];
        

        for (int i = 0; i < temperatures.length; i++) {
            if (!stack.empty()) {
                while (!stack.empty() && temperatures[i] > stack.lastElement()[0]) {
                    int[] day = stack.pop();
                    System.out.println(day[0]);
                    result[day[1]] = i - day[1];
                }
            }
            int[] day = {temperatures[i], i};
            stack.add(day);
        }
        return result;
    }
}
