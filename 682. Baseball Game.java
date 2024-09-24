class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int index = 0;

        for (String s : operations) {
            switch (s) {
                case "C":
                    index--; 
                    break;
                case "D":
                    scores[index] = scores[index - 1] * 2;
                    index++;
                    break;
                case "+":
                    scores[index] = scores[index - 1] + scores[index - 2];
                    index++;
                    break;
                default:
                    scores[index] = Integer.parseInt(s);
                    index++;
                    break;
            }
        }

        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += scores[i];
        }

        return sum;
    }
}
