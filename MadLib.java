import java.util.Scanner;

public class MadLib
{
  
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    String noun1, propName, verb, noun, terrin, story1, story2;
    story1="Once upon a time, there was a named . loved to with their best friend, a. One day, they decided to go on an adventure to the. It was a journey filled with excitement and surprises!";
    System.out.println("Welcome to the Mad Libs game! Please provide the following words:");
    System.out.print("Enter a noun: ");
    noun1=scan.nextLine();
    story2=story1.substring(0,30)+noun1;
    System.out.print("Enter a proper name: ");
    propName=scan.nextLine();
    story2=story2+story1.substring(29,36)+propName +story1.substring(36,37);
    System.out.print("Enter a verb: ");
    verb=scan.nextLine();
    /*System.out.print("Enter another noun: ");
    noun=scan.nextLine();
    System.out.print("Enter a type of terrain (e.g., forest, desert, mountain): ");
    terrin=scan.nextLine();/* */
    scan.close();
    System.out.println("\nHere's your Mad Lib story:\n");
    System.out.println(story2);
  }
}