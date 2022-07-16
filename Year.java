public class Year {
	private int lY;
	
	public Year(int aYear) {
		lY = aYear;
	}
	public boolean isLeapYear() {
		if(1583 > lY) {
			if(lY % 4 == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if(lY % 4 == 0) {
				if(lY % 100 != 0) {
					return true;
				}
			}
			else if(lY % 400 == 0) {
					return true;
			}	
			return false;
		}		
	}
}