package ru.galkin.people;

public class Home {
	final int num;
	
	public Home(int num) {
		if(num < 0 ) throw new IllegalArgumentException("Значение не может быть отрицательным (если это не подвал)");
		this.num = num;
	}
	
	public String toString() {
		if(num > 1) return "дом с " + num + " этажами";
		return "дом с " + num + " этажом";
	}
}
