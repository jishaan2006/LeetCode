class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer=new int[temperatures.length];
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int previousDay = s.pop();
                answer[previousDay] = i - previousDay;
            }
            s.push(i);
        }
        return answer;
    }
}