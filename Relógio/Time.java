package Relógio;

public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Time(int hour, int minute, int second){
        setHour (hour);
        setMinute (minute);
        setSecond (second);
    } // todo 

    public void setHour(int hour){
        if(hour >= 0 && hour <= 23){
            this.hour = hour;
        }else{
            System.out.println("fail: hora invalida");
        }
    } // todo 

    public void setMinute(int minute){
        if(minute >= 0 && minute <= 59){
            this.minute = minute;
        }else{
            System.out.println("fail: minuto invalido");
        }
    } // todo 


    public void setSecond(int second){
        if(second >= 0 && second <= 59){
            this.second = second;
        }else{
            System.out.println("fail: segundo invalido");
        }
    } // todo 

    public int getHour(){
        return hour;
    } // todo 

    public int getMinute(){
        return minute;
    } // todo 

    public int getSecond(){
        return second;
    } // todo 

    //avança o tempo em um segundo
    public void nextSecond(){
        if(second < 59){
            second ++;
        }else{
            second = 0;
            if(minute < 59){
                minute ++;
            }else{
                minute = 0;
                if(hour < 23){
                    hour ++;
                }else{
                    hour = 0;
                }
            }
        }
    } // todo 

    public String toString() {
        return String.format("%02d", hour) + ":" + 
               String.format("%02d", minute) + ":" + 
               String.format("%02d", second);
    }
}