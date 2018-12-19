import java.util.*;

class Society{
	//this declares a new instance variable... an ArrayList for people
	List<Person> people = new ArrayList<Person>();

	public int population;
	//these names came from https://nameberry.com/unisex-names
	private String[] firstNames = {"Avery","Riley","Jordan","Angel","Parker","Sawyer","Peyton","Quinn","Blake","Hayden","Taylor","Dakota","Reese","Zion","Remmington","Amari","Phoenix","Kendall","Harley","Rylan","Marley","Dallas"};
	private String[] lastNames = {"Hill","Carson","Ware","McMahon","Murray","Smith","Jones","Robinson","Morris","Brown","Meyers","Reed","Schmidt","Estrada","Huang","Patel","Gupta","Gomez","Ramirez","Thomas","Jordan","Samson","Samuels","Evans","Butts","Wright","Black","White"};

	Society(int numPeople){
		population = numPeople;
		String fullName;
        int eduLevel;
        int peopleAge;
		for(int i = 0; i < numPeople; i++){
            peopleAge = (int)(Math.random()*100) + 1;
			if(peopleAge >= 5 && peopleAge <= 17){
                eduLevel = peopleAge - 5;
            }
            else if (peopleAge >= 18){
                System.out.println(peopleAge);
                eduLevel = (int)(Math.random()*16);
            }
            else {
                 eduLevel = 0;
            }
			fullName = firstNames[(int)(Math.random()*firstNames.length)] + " " + lastNames[(int)(Math.random()*lastNames.length)];
			people.add(new Person(peopleAge,fullName,eduLevel,(int)(Math.random()*100)));
		}
	}

// public void applyColleges(){
//     for(int i = 0; i < peopleTown.get(i).)

// }
}
