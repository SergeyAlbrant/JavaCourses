package HackerRank.Day12;

public class Student extends Person{
	
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
        this.testScores = testScores;
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public String calculate(){
        int avr = 0;
        for(int i=0; i < testScores.length; i++){
                avr+=testScores[i];
         }
        avr/=testScores.length;
        if (avr<=100 && avr>=90){
            return "O";
        }
        else if (avr<90 && avr>=80){
            return "E";
        }
        else if (avr<80 && avr>=70){
            return "A";
        }
        else if (avr<70 && avr>=55){
            return "P";
        }
        else if (avr<55 && avr>=40){
            return "D";
        }
        return "T";

    }

}
