package by.it.Java2.Lesson4;

public class task1 {
    public static void main(String[] args) {
        TimeLength timeOne = new TimeLength(1, 1, 1);
        TimeLength timeTwo = new TimeLength(185);

        printTimeLength(timeOne);
        printTimeLength(timeTwo);
        }

    public static void printTimeLength(TimeLength time ) {

        System.out.println("time =    " + time);
        System.out.println("seconds = " + time.convertTimeToSeconds());

    }
}

class TimeLength {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }


    public TimeLength(int hours, int minutes, int seconds) {

        this.hours = Math.abs(hours) % 24;
        this.minutes = Math.abs(minutes) % 60;
        this.seconds = Math.abs(seconds) % 60;
    }

    public TimeLength(int seconds) {
        convertSecondsToTime(seconds);
    }

    public int convertTimeToSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    private void convertSecondsToTime(int seconds) {
        seconds = Math.abs(seconds);
        this.hours = seconds / 3600 % 24;
        seconds %= 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }

    @Override
    public String toString() {
        return String.format("%d h. %d m. %d s",hours,minutes,seconds);
    }
}
