import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {
    public static void main(String[] argv) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm");
        String dateInString = "23-02-2022 09:05";
        Date date = sdf.parse(dateInString);
        DateAndCalendar obj = new DateAndCalendar();

        Calendar calendar = obj.dateToCalendar(date);
        System.out.println(calendar.getTime());

        Date newDate = obj.calendarToDate(calendar);
        System.out.println(newDate);
    }

    private Calendar dateToCalendar(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;

	}

	//Convert Calendar to Date
	private Date calendarToDate(Calendar calendar) {
		return calendar.getTime();
	}
}