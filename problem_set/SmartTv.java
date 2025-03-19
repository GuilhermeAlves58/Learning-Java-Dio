package problem_set;

public class SmartTv {
    static boolean on = false;
    static int channel = 1;
    static int volume = 25;

    public void turn_on(){
        on = true;
    }
    public void turn_off(){
        on = false;
    }
    public void volume_changer_up(){
        volume++;
    }
    public void volume_changer_down(){
        volume--;
    }
    public void channel_changer_user(int newchannel){
        channel = newchannel;
    }
    public void channel_changer_up(){
        channel++;
    }
    public void channel_changer_down(){
        channel--;
    }

}
