class Main {

public static void main(String[] args) {

		Society peopleTown = new Society(100);
      int yearPass = 1;
      for(int i = 0; i < 7300; i++) {
        peopleTown.cycleDay();
        if(i == (365 * yearPass) ){
           System.out.println("-Year:" + yearPass);
          for(int p = 0; p < peopleTown.people.size(); p++){
            if(peopleTown.people.get(p).getEnroll() == true){
              System.out.println(peopleTown.people.get(p).getName() + " on grade " + peopleTown.people.get(p).getEdu());
                if(peopleTown.people.get(p).getEdu() <= 16 &&  peopleTown.people.get(p).getAge() == 24){
                System.out.println(peopleTown.people.get(p).getName() + " earn a degree ");
                }
            }
            else if(peopleTown.people.get(p).getEnroll() == false){
               if(peopleTown.people.get(p).getAge() >= 6 && peopleTown.people.get(p).getAge() <= 18){
                System.out.println(peopleTown.people.get(p).getName() + " under 18, drop out at grade " + peopleTown.people.get(p).getEdu());
            }
               else if(peopleTown.people.get(p).getAge() >= 19 && peopleTown.people.get(p).getAge() <= 24){
                System.out.println(peopleTown.people.get(p).getName() + " between 19-24, not in college" );
            }
          }

        }
        yearPass++;
      }
    }
     for(Person individual : peopleTown.people){
          //This is a test of the people who got married
          if(individual.getSpouse() != null){
              System.out.println(individual.getName() + " married to " + individual.getSpouse().getName() );
              System.out.println(individual.getSpouse().getName() + " is married to " + individual.getName());
          }
          //Write your print/tests below if they involve a property of the people in peopleTown
          //use individual as it does in the example above
          // This is the Places Code- Need help? Ask Brandon, Ian, or read the documentation provided.
	}
}
}
