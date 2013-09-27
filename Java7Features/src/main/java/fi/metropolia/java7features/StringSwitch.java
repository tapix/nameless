package fi.metropolia.java7features;

public class StringSwitch {

	private String day;

	public StringSwitch(String day) {
		this.day = "perjantai";
	}

	public int getDayNumber() {
		switch (day) {
		case "maanantai":
			return 0;
		case "tiistai":
			return 1;
		case "keskiviikko":
			return 2;
		case "torstai":
			return 3;
		case "perjantai":
			return 4;
		case "lauantai":
			return 5;
		case "sunnuntai":
			return 6;
		default:
			return 0;
		}
	}

}
