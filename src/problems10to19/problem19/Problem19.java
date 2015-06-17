package problems10to19.problem19;


public class Problem19 {
	
	public enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

	private static final int MAX_DAYS = 7;
	private static final int MONDAY = 0;
	private static final int SUNDAY = 6;
	
	public static void main(String[] args) {
		int year = 1900;
		Month[] months = Month.values();
		int currentDay = MONDAY;
		
		int sundaysFirstOfMonth = 0;
		while (year < 2001) {
			for (Month month : months) {
				if (currentDay == SUNDAY && year > 1900) {
					sundaysFirstOfMonth++;
				}
				
				for (int i = 1; i <= getMaxDayOfMonth(month, year); i++) {
					currentDay = (currentDay + 1) % MAX_DAYS;
				}
			}
			year++;
		}
		System.out.println(sundaysFirstOfMonth);
	}
	
	protected static int getMaxDayOfMonth(Month month, int year) {
		switch (month) {
			case JANUARY:
			case MARCH:
			case MAY:
			case JULY:
			case AUGUST:
			case OCTOBER:
			case DECEMBER:
				return 31;
			case FEBRUARY:
				return getFebruaryMaxDay(year);
			default:
				return 30;
		}
	}
	
	protected static int getFebruaryMaxDay(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 29 : 28;
	}
}
