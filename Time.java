public class Time {
    private int hour;
    private int minute;
    private int second;
    Time(int hour , int minute , int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour , int minute , int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        String h = Integer.toString(getHour());
        String m = Integer.toString(getMinute());
        String s = Integer.toString(getSecond());
        if(getSecond() < 10) {
            s = "0" + s;
        }
        if(getMinute() < 10) {
            m = "0" + m;
        }
        if(getHour() < 10) {
            h = "0" + h;
        }
        return h+":"+m+":"+s;
    }
    public void nextSecond(){
        if(getSecond() == 59) {
            setSecond(0);
            if(getMinute() == 59)
                setMinute(0);
            else
                setMinute(getMinute() + 1);

            if (getHour() != 23)
                setHour(getHour() + 1);
            else setHour(0);
        }else
            setSecond(1+getSecond());

    }
    public void previousSecond(){
        if(getSecond() == 0) {
            setSecond(59);
            if(getMinute() == 0)
                setMinute(59);
            else setMinute(getMinute() - 1);
            if(getHour() == 0)
                setHour(23);
            else setHour(getHour() - 1);
        }
        else
            setSecond(getSecond()-1);

    }
}
