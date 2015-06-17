package problems10to19.problem19;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static problems10to19.problem19.Problem19.getFebruaryMaxDay;
import static problems10to19.problem19.Problem19.getMaxDayOfMonth;
import static problems10to19.problem19.Problem19.Month.APRIL;
import static problems10to19.problem19.Problem19.Month.AUGUST;
import static problems10to19.problem19.Problem19.Month.DECEMBER;
import static problems10to19.problem19.Problem19.Month.FEBRUARY;
import static problems10to19.problem19.Problem19.Month.JANUARY;
import static problems10to19.problem19.Problem19.Month.JULY;
import static problems10to19.problem19.Problem19.Month.JUNE;
import static problems10to19.problem19.Problem19.Month.MARCH;
import static problems10to19.problem19.Problem19.Month.MAY;
import static problems10to19.problem19.Problem19.Month.NOVEMBER;
import static problems10to19.problem19.Problem19.Month.OCTOBER;
import static problems10to19.problem19.Problem19.Month.SEPTEMBER;

import org.junit.Test;

public class Problem19Test {

	@Test
	public void getMaxDayOfMonthShouldReturnLastPossibleDayOfGivenMonth() {
		assertThat(getMaxDayOfMonth(JANUARY, 1), is(31));
		assertThat(getMaxDayOfMonth(FEBRUARY, 1122), is(28));
		assertThat(getMaxDayOfMonth(MARCH, 4121), is(31));
		assertThat(getMaxDayOfMonth(APRIL, 1523), is(30));
		assertThat(getMaxDayOfMonth(MAY, 11223), is(31));
		assertThat(getMaxDayOfMonth(JUNE, 12), is(30));
		assertThat(getMaxDayOfMonth(JULY, 11), is(31));
		assertThat(getMaxDayOfMonth(AUGUST, 15), is(31));
		assertThat(getMaxDayOfMonth(SEPTEMBER, 1553), is(30));
		assertThat(getMaxDayOfMonth(OCTOBER, 133), is(31));
		assertThat(getMaxDayOfMonth(NOVEMBER, 1234), is(30));
		assertThat(getMaxDayOfMonth(DECEMBER, 121), is(31));
	}
	
	@Test
	public void getFebruaryMaxDayShouldReturnLastDayOfFebruaryForGivenYear() {
		assertThat(getFebruaryMaxDay(1), is(28));
		assertThat(getFebruaryMaxDay(4), is(29));
		assertThat(getFebruaryMaxDay(5), is(28));
		assertThat(getFebruaryMaxDay(100), is(28));
		assertThat(getFebruaryMaxDay(200), is(28));
		assertThat(getFebruaryMaxDay(400), is(29));
		assertThat(getFebruaryMaxDay(1600), is(29));
		assertThat(getFebruaryMaxDay(1601), is(28));
	}
}
