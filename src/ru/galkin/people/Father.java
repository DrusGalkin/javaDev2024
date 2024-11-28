package ru.galkin.people;

public class Father {
	Name person;
	Name father;

	public Father(Name person, Name father) {
		this.person = person;
		this.father = father;
	}

	public String getFamilia(Name person) {
		if (person.getFamilia().isEmpty()) {
			person.setFamilia(father.getFamilia());
		}
		return person.getFamilia();
	}

	public String getPatronomyc(Name person) {
		String suff = "ович";
		if (person.getPatronomyc().isEmpty()) {
			person.setPatronomyc(father.getName() + suff);
		}
		return person.getPatronomyc();
	}

	public void checkFamPat(Name person) {
		person.setFamilia(getFamilia(person));
		person.setPatronomyc(getPatronomyc(person));
	}

	@Override
	public String toString() {
		checkFamPat(person);
		return person.getFamilia() + " " + person.getName() + " " + person.getPatronomyc();
	}
}
