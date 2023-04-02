// // class Solution {
// //     public boolean checkStraightLine(int[][] coordinates) {
// //         double slope = calculate(coordinates[0], coordinates[1]);
// //         for(int index = 2; index < coordinates.length; index++) {
// //             if(slope != calculate(coordinates[0], coordinates[index])) {
// //                 return false;
// //             }
// //         }
// //         return true;
// //     }
    
// //     private double calculate(int []p1, int []p2) {
// //         return ((p1[1] - p2[1]) * 1.0) / ((p1[0] - p2[0]) * 1.0);
// //     }
// // }
// this solution doesn't pass all testcase. it have give error in testcase= [[0,0],[0,1],[0,-1]]
class Solution{
        public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0], y0 = coordinates[0][1], 
            x1 = coordinates[1][0], y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        for (int[] co : coordinates) {
            int x = co[0], y = co[1];
            if (dx * (y - y1) != dy * (x - x1))
                return false;
        }
        return true;
    }
}
