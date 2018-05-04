
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateDate {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date DateOfLast = sdf.parse("2018-03-16");
		Date DateOfNow = sdf.parse("2018-05-04");
		long day=(DateOfNow.getTime()-DateOfLast.getTime())/(24*60*60*1000);
		System.out.println("期间时间为："+day+"天");

	}

}
