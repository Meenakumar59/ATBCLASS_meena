package Practise_queson;

public class grade_calculator {
    public static void main(String[] args) {
        int score = 80;
        char grade;
        if( score>=90 && score<=100){
            grade = 'A';
        } else if ( score>=80 && score<=89) {
            grade = 'B';
        } else if (score>=70& score<=79) {
            grade = 'C';
        }else{
            grade = 'F';
        }
        System.out.println(grade);
    }

}
