package com.company;

public class Main {

    public static void main(String[] args) {
	int temperature = 18;
    int numberOfStudents = 25;
    boolean isSnowy = true;

    if(temperature > 10 && temperature < 40) { // && requires two statements to be true
        System.out.println("What a good weather for a walk");
        // true && true => 1 * 1 = 1 (TRUE)

    }
    if (numberOfStudents < 10 || temperature < 20) { // || - operator OR, requires only one statement to be true
        System.out.println("Lets have a dinner");

    }
    if(isSnowy && temperature < 0 || numberOfStudents <= 25 ) {
        // false && (FALSE || true) => 0 * 0 + 1 = 1 (true)
        System.out.println("Go to the cinema");
    }
    if(!isSnowy) { //   ! - negative operator,so it makes negative positive and positive negative
        System.out.println("It is not raining");
    }
    if(!!!!         (temperature > 10 && isSnowy)) {
        // !(true && false) => ( 1*0 ) = !0 (false) = !FALSE = TRUE
        System.out.println("jjkhjfkjghkj");
    }
    }
}
