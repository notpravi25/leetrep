class Solution {
    public int calPoints(String[] operations) {
          Stack<Integer> stack = new Stack<>();

        for (String operation : operations) {

            switch (operation) {
                case "+":
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    stack.push(last);
                    stack.push(last + secondLast);
                    break;

                case "D":
                    stack.push(stack.peek() * 2);
                    break;

                case "C":
                    stack.pop();
                    break;

                default:
                    stack.push(Integer.parseInt(operation));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}