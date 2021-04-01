package countingSheep;

public class Main {

	public  int countSheeps(Boolean[] arrayOfSheeps) {

		int count = 0;
		for (Boolean sheep : arrayOfSheeps) {
			if (sheep == null) {
				continue;
			}
			if (sheep)
				count++;
		}
		return count;

	}

}
