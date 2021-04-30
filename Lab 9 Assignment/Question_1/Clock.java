package Question_1;

public class Clock{
    private int hours;
    private int minutes;
    private int seconds;
    public Clock(){
        
    }
    public Clock(int hours, int minutes, int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    
    public void display(){
        System.out.println("Time is :   "+this.getHours() +" : "+this.getMinutes()+" : "
                + ""+this.getSeconds());
        System.out.println("<----------------------------------------->");
    }

    /**
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * @param minutes the minutes to set
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * @return the seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * @param seconds the seconds to set
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
}