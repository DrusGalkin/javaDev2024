package ru.galkin.people;

public class PersonWhisName {
	Name name;
	Person person;
	
	public PersonWhisName(Name name, Person person) {
		this.name = name;
		this.person = person;
	}
	
	public String toString() {
		return "Человек с именем " + name + " и ростом " + person.getHeight() +" см";
	}
}
