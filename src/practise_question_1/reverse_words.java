package practise_question_1;

public class reverse_words {

        public static void main(String[] args)
        {
            String input = "Pramod Sir is Owner of TheTestingAcademy";

            StringBuilder input1 = new StringBuilder();
//Creates an empty StringBuilder object input1.
//StringBuilder is a mutable sequence of characters, meaning you can modify it without creating new objects.
            // append a string into StringBuilder input1
            input1.append(input);

            // reverse StringBuilder input1
            input1.reverse();

            // print reversed String
            System.out.println(input1);
        }


    }
