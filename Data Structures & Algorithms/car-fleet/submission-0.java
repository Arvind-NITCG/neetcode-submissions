class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
     int n = position.length;
     int[][] car = new int[n][2];
     for(int i=0; i < n; i++){
        car[i][0] = position[i];
        car[i][1] = speed[i];
     }
     Arrays.sort(car,(a,b)->Integer.compare(b[0],a[0]));
     double time_rem = 0.0;
     double slowest = 0.0;
     int fleets = 0;
     for(int i = 0; i < n; i++){
        time_rem = (double)(target - car[i][0])/car[i][1];
        if(time_rem > slowest){
            slowest = time_rem;
            fleets++;
        }
     }
     return fleets;
    }
}
