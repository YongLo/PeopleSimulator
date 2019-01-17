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
	}
}
