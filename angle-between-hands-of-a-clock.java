// https://leetcode.com/problems/angle-between-hands-of-a-clock/
class angle-between-hands-of-a-clock {
    // tc -> 1, sc-> 1
    public double angleClock(int hour, int minutes) {
        int oneMinuteAngle = 6; // 360/60 = 6
        int oneHourAngle = 30; // 360/12 = 30
        
        double minutesAngle = oneMinuteAngle * minutes;
        double hourAngle = (hour%12 + minutes/60.0) * oneHourAngle;
        
        double diff = Math.abs(hourAngle - minutesAngle);
        
        return Math.min(diff, 360-diff);
    }
}
