package Question_1;

public class ClockExtended extends Clock{
    
    public ClockExtended(){
        
    }
    public ClockExtended(int hour, int mint, int second){
        super(hour, mint, second);
    }
    
    @Override
    public void display(){
        System.out.println("Time is :   "+this.getHours() +" : "+this.getMinutes()+" : "
                + ""+this.getSeconds());
        if(this.getHours()>12) System.out.println("Time is :   "+(this.getHours()%12)+" : "+this.getMinutes()+" : "
                + ""+this.getSeconds()+" PM");
        else
            System.out.println("Time is :   "+(this.getHours()%12)+" : "+this.getMinutes()+" : "
                + ""+this.getSeconds()+" AM");
        System.out.println("<----------------------------------------->");
    }
    
}
class clockRunner{
    public static void main(String[] args) {
        Clock c1= new Clock(14,13,42);
        ClockExtended c2= new ClockExtended(14,13,42);
        c1.display();
        c2.display();
    }
}