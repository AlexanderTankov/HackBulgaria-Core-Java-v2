import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Time {
	
	public Time() {
		this.sec = 0;
		this.min = 0;
		this.hour = 0;
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	
	public Time(int sec, int min, int hour, int day, int month, int year) {
		this.sec = sec;
		this.min = min;
		this.hour = hour;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		return this.hour + ":" + this.min + ":" + 
			   this.sec + " " + this.day + "." + 
			   this.month + "." + this.year;
	}
	
	public String now() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	private int sec;
	private int min;
	private int hour;
	private int day;
	private int month;
	private int year;
	
	public static void main(String[] args) {
		Time a = new Time();
		System.out.println(a.now());

	}
}
