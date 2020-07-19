// https://leetcode.com/problems/water-bottles/
class water-bottles {
    // tc -> log(numBottles), sc-> 1
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        int emptyBottles = numBottles;
        
        while(emptyBottles >= numExchange){
            count += emptyBottles/numExchange;
            emptyBottles = emptyBottles/numExchange + emptyBottles%numExchange;
        }
        
        return count;
    }
}
