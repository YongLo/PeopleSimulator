class Person {
	public int age;
	private String name;
    public int edu;
    public int work;
	public Person(int age, String name,int edu, int work) {
		this.name = name;
		this.age = age;
        this.edu = edu;
        this.work = work;
	}

	public Person() {
		this.name = "Brad";
		this.age = 37;
        this.edu = 15;
        this.work = 99;
	}

	public boolean olderThan(int otherAge) {
		if (age > otherAge) {
			return true;
		} else {
			return false;
		}

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

    public int getEdu() {
		return edu;
	}
     public int getWork() {
		return work;
	}


	public void hadBirthday() {
		age++;
	}

}