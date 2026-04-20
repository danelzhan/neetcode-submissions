class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        
        Stack<Double> car = new Stack<Double>();

        System.out.println(Arrays.deepToString(pair));

        car.add((target - pair[0][0]) / (1.0 * pair[0][1]));

        for (int i = 1; i < pair.length; i++) {
            double s = (target - pair[i][0]) / (1.0 * pair[i][1]);

            System.out.println(i + ": " + s);

            if (car.peek() < s) {
                car.add(s);
            }

        }

        System.out.println(car.toString());

        return car.size();

    }

}
