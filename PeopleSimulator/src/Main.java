
class Main {
	// I'll be using this main method for testing
	public static void main(String[] args) {

		Society peopleTown = new Society(100);

        //gets the name of the person in the people arrayList at position 8000
        System.out.println(peopleTown.people.get(80).getName());
        for(int i = 0; i < peopleTown.people.size(); i++){

			System.out.println(i + " " + peopleTown.people.get(i).getName() + " age = "+ peopleTown.people.get(i).getAge() + " Edu " + peopleTown.people.get(i).getEdu() + " Hardwork " + peopleTown.people.get(i).getWork());
        }
	}

}
