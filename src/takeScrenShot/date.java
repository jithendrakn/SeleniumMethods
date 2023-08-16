package takeScrenShot;

import java.time.LocalDateTime;

public class date {
public static void main(String[] args) {
	LocalDateTime lsdt = LocalDateTime.now();
	System.out.println(lsdt);
	String stringclass=lsdt.toString();
	String stringUpdatesDate=stringclass.replace(":", "-");
	System.out.println(stringUpdatesDate);
	
	String timeStamp=LocalDateTime.now().toString().replace(':', '-');
}
}
