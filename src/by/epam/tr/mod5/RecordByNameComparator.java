package by.epam.tr.mod5;

import java.util.Comparator;

public class RecordByNameComparator implements Comparator<Record>{
		public int compare(Record rec1, Record rec2){
			String lastName1 = rec1.getLastName();
			String lastName2 = rec2.getLastName();
			String firstName1 = rec1.getFirstName();
			String firstName2 = rec2.getFirstName();
			
			if (lastName1.compareTo(lastName2) == 0){
				return firstName1.compareTo(firstName2);
			} else {
				return lastName1.compareTo(lastName2);
			}
		}

}
