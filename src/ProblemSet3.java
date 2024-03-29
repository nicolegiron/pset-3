/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
      System.out.print("\nEnter an integer: ");
      int posNegInt = in.nextInt();
      System.out.println("");
      if(posNegInt<0){
        System.out.println("Negative.\n");
      }else if (posNegInt>0){
        System.out.println("Positive.\n");
      }else{
        System.out.println("Zero.\n");
      }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
      System.out.print("Enter an integer: ");
      int evenOddInt = in.nextInt();
      if((evenOddInt%2)==0){ //if the integer does not have a remainder when divided by 2, it is even
        System.out.println("\nEven.");
      }else{
        System.out.println("\nOdd.");
      }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      System.out.println("\nEnter three integers.\n");
      System.out.print("Enter integer: ");
      int orderedIntOne = in.nextInt();
      System.out.print("Enter integer: ");
      int orderedIntTwo = in.nextInt();
      System.out.print("Enter integer: ");
      int orderedIntThree = in.nextInt();
      in.nextLine();
      System.out.println("");
      if(orderedIntOne<orderedIntTwo && orderedIntTwo<orderedIntThree){
        System.out.println("Strictly increasing.");
      }else if(orderedIntOne<=orderedIntTwo && orderedIntTwo<=orderedIntThree){
        System.out.println("Increasing.");
      }else if(orderedIntOne>orderedIntTwo && orderedIntTwo>orderedIntThree){
        System.out.println("Strictly decreasing."); /* stricktly decreasing must come first, or else the decreasing
          else if statement would be executed first*/
      }else if(orderedIntOne>=orderedIntTwo && orderedIntTwo>=orderedIntThree){
        System.out.println("Decreasing.");
      }else{
        System.out.println("Unordered.");
      }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {

      final double aGrade = 4.00;
      final double bGrade = 3.00;
      final double cGrade = 2.00;
      final double dGrade = 1.00;
      final double fGrade = 0.00;
      final double plus = 0.33;
      final double minus = 0.33;

      System.out.print("\nEnter a letter grade: ");
      String letterGradeEither = in.nextLine();
      String letterGrade = letterGradeEither.toUpperCase(); //This is so the grade is case insensitive
      System.out.println("");
      if(letterGrade.equals("A+") || letterGrade.equals("A")){
        System.out.printf("Your GPA is %.2f.\n", aGrade);
      }else if(letterGrade.equals("A-")){
        System.out.printf("Your GPA is %.2f.\n", aGrade-minus);
      }else if(letterGrade.equals("B+")){
        System.out.printf("Your GPA is %.2f.\n", bGrade+plus);
      }else if(letterGrade.equals("B")){
        System.out.printf("Your GPA is %.2f.\n", bGrade);
      }else if(letterGrade.equals("B-")){
        System.out.printf("Your GPA is %.2f.\n", bGrade-minus);
      }else if(letterGrade.equals("C+")){
        System.out.printf("Your GPA is %.2f.\n", cGrade+plus);
      }else if(letterGrade.equals("C")){
        System.out.printf("Your GPA is %.2f.\n", cGrade);
      }else if(letterGrade.equals("C-")){
        System.out.printf("Your GPA is %.2f.\n", cGrade-minus);
      }else if(letterGrade.equals("D+")){
        System.out.printf("Your GPA is %.2f.\n", dGrade+plus);
      }else if(letterGrade.equals("D")){
        System.out.printf("Your GPA is %.2f.\n", dGrade);
      }else if(letterGrade.equals("D-")){
        System.out.printf("Your GPA is %.2f.\n", dGrade-minus);
      }else if(letterGrade.equals("F")){
        System.out.printf("Your GPA is %.2f.\n", fGrade);
      }else{
        System.out.println("That's not a valid letter grade.");
      }

    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
      System.out.print("\nEnter a grade: ");
      int numberGrade = in.nextInt();
      in.nextLine();
      System.out.println("");
      final int ATOP = 100;
      final int ABOTTOM = 90;
      final int BTOP = 89;
      final int BBOTTOM = 80;
      final int CTOP = 79;
      final int CBOTTOM = 70;
      final int DTOP = 69;
      final int DBOTTOM = 60;
      final int FTOP = 59;
      final int FBOTTOM = 0;
      if(numberGrade>ATOP){
        System.out.println("Grades above 100 are invalid. \n");
      }else if(numberGrade<=ATOP && numberGrade>=ABOTTOM){
        System.out.println("You received an A.\n");
      }else if(numberGrade<=BTOP && numberGrade>=BBOTTOM){
        System.out.println("You received a B.\n");
      }else if(numberGrade<=CTOP && numberGrade>=CBOTTOM){
        System.out.println("You received a C.\n");
      }else if(numberGrade<=DTOP && numberGrade>=DBOTTOM){
        System.out.println("You received a D.\n");
      }else if(numberGrade<=FTOP && numberGrade>=FBOTTOM){
        System.out.println("You received a F.\n");
      }else if(numberGrade<FBOTTOM){
        System.out.println("Grades below 0 are invalid.\n");
      }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
      System.out.print("Enter a card: ");
      String card = in.nextLine();
      String rank = card.substring(0,1);
      String suit = card.substring(1,2);
      System.out.println("");
      boolean validRank = true;
      boolean validSuit = true;

      if(!rank.equals("2")&&!rank.equals("3")&&!rank.equals("4")&&!rank.equals("5")&&!rank.equals("6")&&
        !rank.equals("7")&&!rank.equals("8")&&!rank.equals("9")&&!rank.equals("T")&&!rank.equals("J")&&
        !rank.equals("Q")&&!rank.equals("K")&&!rank.equals("A")){
          validRank = false;
        }else if(!suit.equals("C")&&!suit.equals("D")&&!suit.equals("H")&&!suit.equals("S")){
          validSuit = false;
        } //Checks if there is an invalid rank or suit

      if(validRank==false){ //first checks if there is a valid rank and if not it states so.
        System.out.println("That's not a valid rank.\n");
      }else if(validSuit==false){ //Sets validSuit equal to false so later the suit if-else statement will not run
        System.out.print("");
      }else if(rank.equals("2")){
        System.out.print("Two of ");
      }else if(rank.equals("3")){
        System.out.print("Three of ");
      }else if(rank.equals("4")){
        System.out.print("Four of ");
      }else if(rank.equals("5")){
        System.out.print("Five of ");
      }else if(rank.equals("6")){
        System.out.print("Six of ");
      }else if(rank.equals("7")){
        System.out.print("Seven of ");
      }else if(rank.equals("8")){
        System.out.print("Eight of ");
      }else if(rank.equals("9")){
        System.out.print("Nine of ");
      }else if(rank.equals("T")){
        System.out.print("Ten of ");
      }else if(rank.equals("J")){
        System.out.print("Jack of ");
      }else if(rank.equals("Q")){
        System.out.print("Queen of ");
      }else if(rank.equals("K")){
        System.out.print("King of ");
      }else if(rank.equals("A")){
        System.out.print("Ace of ");
      }

      if(validSuit==false){
        System.out.print("That's not a valid suit.\n");
      }else if(validRank==false){
        System.out.print("");
      }else if(suit.equals("C")){
        System.out.print("Clubs.\n");
      }else if(suit.equals("D")){
        System.out.print("Diamonds.\n");
      }else if(suit.equals("H")){
        System.out.print("Hearts.\n");
      }else if(suit.equals("S")){
        System.out.print("Spades.\n");
      }
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
      System.out.print("\nEnter a year: ");
      int leapYear = in.nextInt();
      System.out.println("");
      boolean leapYearBool = ((leapYear%4==0) && (leapYear%100!=0)) || (leapYear%400==0);

      if (leapYearBool == true){
        System.out.println(leapYear + " is a leap year.\n");
      }else if(leapYearBool == false){
        System.out.println(leapYear + " is not a leap year.\n");
      }
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
      final double FREEZINGPOINTF = 32;
      final double BOILINGPOINTF = 212;
      final double FREEZINGPOINTC = 0;
      final double BOILINGPOINTC = 100;

      System.out.print("Enter a temperature: ");
      int temperature = in.nextInt();
      in.nextLine();
      System.out.print("Enter a scale: ");
      String scale = in.nextLine();
      System.out.println("");

      if(scale.equals("F")){
        if(temperature>=BOILINGPOINTF){
          System.out.println("Gas.");
        }else if(temperature<=BOILINGPOINTF && temperature>=FREEZINGPOINTF){
          System.out.println("Liquid.");
        }else{
          System.out.println("Solid.");
        }//if inside of an if to first check the scale then to check the stage 
      }else if(scale.equals("C")){
        if(temperature>=BOILINGPOINTC){
          System.out.println("Gas.");
        }else if(temperature<=BOILINGPOINTC && temperature>=FREEZINGPOINTC){
          System.out.println("Liquid.");
        }else{
          System.out.println("Solid.");
        }
      }else{
        System.out.println("That's not a valid scale.");
      }
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {
      System.out.print("\nEnter a month: ");
      String month = in.nextLine();
      System.out.println("");
      String monthLowerCase = month.toLowerCase();
      int monthLength = monthLowerCase.length();

      if(monthLength==3){
        monthLowerCase = monthLowerCase.substring(0,3);
      }else if(monthLength==4){
        monthLowerCase = monthLowerCase.substring(0,4);
      } /*this if else is needed to split the month accordingly depending on the size of the month for wether the month
        is shortened into 3 or 4 letters*/

      if(monthLowerCase.equals("january")||monthLowerCase.equals("jan")||monthLowerCase.equals("janu")){
        System.out.println("31 Days.");
      }else if(monthLowerCase.equals("february")||monthLowerCase.equals("feb")||monthLowerCase.equals("febr")){
        System.out.println("28 or 29 Days.");
      }else if(monthLowerCase.equals("march")||monthLowerCase.equals("mar")||monthLowerCase.equals("marc")){
        System.out.println("31 Days.");
      }else if(monthLowerCase.equals("april")||monthLowerCase.equals("apr")||monthLowerCase.equals("apri")){
        System.out.println("30 Days.");
      }else if(monthLowerCase.equals("may")){
        System.out.println("31 Days.");
      }else if(monthLowerCase.equals("june")||monthLowerCase.equals("jun")){
        System.out.println("30 Days.");
      }else if(monthLowerCase.equals("july")||monthLowerCase.equals("jul")){
        System.out.println("31 Days.");
      }else if(monthLowerCase.equals("august")||monthLowerCase.equals("aug")||monthLowerCase.equals("augu")){
        System.out.println("31 Days.");
      }else if(monthLowerCase.equals("september")||monthLowerCase.equals("sep")||monthLowerCase.equals("sept")){
        System.out.println("30 Days.");
      }else if(monthLowerCase.equals("october")||monthLowerCase.equals("oct")||monthLowerCase.equals("octo")){
        System.out.println("31 Days.");
      }else if(monthLowerCase.equals("november")||monthLowerCase.equals("nov")||monthLowerCase.equals("novem")){
        System.out.println("30 Days.");
      }else if(monthLowerCase.equals("december")||monthLowerCase.equals("dec")||monthLowerCase.equals("dece")){
        System.out.println("31 Days.");
      }else{
        System.out.println("That's not a valid month.");
      }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {
      System.out.print("\nWage: ");
      double wage = in.nextDouble();
      System.out.print("Hours: ");
      double hours = in.nextDouble();
      final double moneyMade = wage*hours;
      final double overTime = wage*1.5;



      if(wage<0){
        System.out.println("Your wage must be greater than or equal to $0.00/hour.\n");
      }else if(hours<0.0){
        System.out.println("Your hours must be greater than or equal to 0.0.\n");
      }else if(hours>0.0 && hours<40.0){
        System.out.printf("You'll make $%.2f this week.\n", moneyMade);
      }else if(hours>40.0){
        double moneyRegularTime = wage*40;
        double moneyOverTime = moneyRegularTime+(hours-40)*overTime;
        System.out.printf("\nYou'll make $%,.2f this week.\n", moneyOverTime);
      }
    }
}
