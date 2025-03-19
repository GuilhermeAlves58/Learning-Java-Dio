package problem_set;

public class UserTv {
    public static void main (String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv on? "+ SmartTv.on);
        System.out.println("Tv channel? "+ SmartTv.channel) ;
        System.out.println("Tv volume? "+ SmartTv.volume) ;

        smartTv.turn_on();
        System.out.println("Tv on?"+ smartTv.on);

        smartTv.turn_off();
        System.out.println("Tv on?"+ smartTv.on);

        smartTv.volume_changer_up();
        System.out.println("Tv volume? "+ SmartTv.volume);

        smartTv.volume_changer_down();
        System.out.println("Tv volume? "+ SmartTv.volume);

        smartTv.channel_changer_up();
        System.out.println("Tv channel? "+ SmartTv.channel);

        smartTv.channel_changer_down();
        System.out.println("Tv channel? "+ SmartTv.channel);

        smartTv.channel_changer_user(12);
        System.out.println("Tv channel? " + SmartTv.channel);


    }

}
