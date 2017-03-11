package by.epam.tr.mod5;

import java.util.Comparator;
import java.util.Date;

public class RecordByDateComparator implements Comparator<Record>{
	public int compare(Record rec1, Record rec2){
		Date dateOfBirth1 = rec1.getDateOfBirth();
		Date dateOfBirth2 = rec2.getDateOfBirth();
		if (dateOfBirth1.before(dateOfBirth2)){
			return -1;
		} else if (dateOfBirth1.equals(dateOfBirth2)){
			return 0;
		} else {
			return 1;
		}
	}
}

