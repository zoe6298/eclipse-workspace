package week7day1oophw;

public class Holiday {
	
	private String name;
	private String month;
	private boolean timeOff;
	
	public Holiday(String name, String month, boolean timeOff) {
		this.name = name;
		this.month = month;
		this.timeOff = timeOff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public boolean isTimeOff() {
		return timeOff;
	}

	public void setTimeOff(boolean timeOff) {
		this.timeOff = timeOff;
	}
	public static boolean isInSummer(String month) {
		if (month.equals("June") || month.equals("July")||month.equals("August")) {
			return true;
		} else {
			return false;
		}
	}
	
	public String greeting() {
		return String.format("Happy %s!", this.name);
	}
	

	
	public static void main(String[] args) {
		Holiday holiday1 = new Holiday("Thanksgiving","November",false);
		System.out.println(Holiday.isInSummer(holiday1.month));
		System.out.println(holiday1.greeting());
		
		
	}

}
	
