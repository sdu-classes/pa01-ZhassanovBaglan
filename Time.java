public class Time{
  private int hour;
  private int minute;
  private int second;
  
  public Time(int h, int m, int s) {
    this.hour = h;
    this.minute = m;
    this.second = s;
  }
  public int getHour(){
    return this.hour;
  }
  public int getMinute(){
    return this.minute;
  }
  public int getSecond(){
    return this.second;
  }
  public void setHour(int hour) {
    this.hour = hour;
  }
  public void setMinute(int minute) {
    this.minute = minute;
  }
  public void setSecond(int second) {
    this.second = second;
  }
}
