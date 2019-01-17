class Main {

public static void main(String[] args) {

		Society peopleTown = new Society(100);
      int yearPass = 1;
      for(int i = 0; i < 1825; i++) {
        peopleTown.cycleDay();
       if(i == (365 * yearPass) ){
           System.out.println("-Year:" + yearPass);
          for(int p = 0; p < peopleTown.people.size(); p++){
            if(peopleTown.people.get(p).getEnroll() == true){
              System.out.println(peopleTown.people.get(p).getName() + " on grade " + peopleTown.people.get(p).getEdu() );
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
