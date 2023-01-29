
class speedoflight{
    static double speed(int lightspeed, double seconds){
        return lightspeed*seconds;
    }

    public static void main(String[] args) {
        double day, seconds, distance;
        day = 20000.165;
        seconds = day * 24 * 60 * 60;   
        distance =  speed(3120000, seconds);
        System.out.println("The lightspeed for the time: "+distance);
    }
}