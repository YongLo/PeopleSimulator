class Person {
	public int age;
	private String name;
    private int birthday;
    private String gender;
    public int edu;
    public boolean enrolled;

	public Person(int age, String name,String gender,int birthdate, int edu,boolean enrolled) {
		this.name = name;
		this.age = age;
        this.birthday = birthdate;
        this.gender = gender;
        this.edu = edu;
        this.enrolled = enrolled;
	}

	public boolean olderThan(int otherAge) {
		if (age > otherAge) {
			return true;
		} else {
			return false;
		}
	}

    public void inSchool(boolean enrolling){
        enrolled = enrolling;
    }

    public void upAgrade(){
        edu++;
    }

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void hadBirthday() {
		age++;
	}

    public String getGender(){
        return gender;
    }

   public int getEdu() {
		return edu;
	}

    public boolean getEnroll(){
        return enrolled;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
}