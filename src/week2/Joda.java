package week2;

import org.joda.time.DateTime;

public class Joda {

	public int setDateTime(int year, int month, int day) {
		DateTime dateTime = new DateTime(year, month, day, 0, 0);
		return dateTime.getDayOfWeek();
	}

	public String convertGetDayOfWeek(int dayOfWeek) {
		String[] d = { "일", "월", "화", "수", "목", "금", "토" };
		return d[dayOfWeek];
	}
}
