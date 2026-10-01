import java.util.Scanner;

public class MadLib //a class definition header that matches the file name
{
  
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    String noun, pluralNoun, adjective, exclamation, verb, story1, story2;//camelCase & Variables for Mad Libs and user input
    story1="I have exactly three minutes before my final exam starts, but I can't find my [Noun] anywhere! Sweat is [Verb ending in -ing] down my face as I violently flip over all my [Plural Noun]. I feel completely 4. [Adjective]! Suddenly, I look down and realize I was holding it in my mouth the whole time. \"5. [Exclamation]!\" I yell, before bursting into the classroom.";
    System.out.println("Welcome to the Mad Libs game! Please provide the following words:");
    System.out.print("Enter a noun: ");// prompt for user input
    noun=scan.nextLine();// prompt for user input
    story2=story1.substring(0,story1.indexOf("[Noun]")-1)+" "+noun+" ";//modify final story based on input
    System.out.print("Enter a verb ending in -ing: ");
    verb=scan.nextLine();
    story2=story2+story1.substring(story1.indexOf("[Noun]")+6,story1.indexOf("[Verb ending in -ing"))+verb+" ";
    System.out.print("Enter a Plural noun: ");
    pluralNoun=scan.nextLine();
    story2=story2+story1.substring(story1.indexOf("[Verb ending in -ing")+23,story1.indexOf("[Plural Noun]"))+pluralNoun+" ";
    System.out.print("Enter an adjective: ");
    adjective=scan.nextLine();
    story2=story2+story1.substring(story1.indexOf("[Plural Noun]")+17,story1.indexOf("[Adjective]")-3)+adjective+" ";
    System.out.print("Enter an exclamation: ");
    exclamation=scan.nextLine();
    story2=story2+story1.substring(story1.indexOf("[Adjective]")+11,story1.indexOf("[Exclamation]")-3)+exclamation;
    story2=story2+story1.substring(story1.indexOf("[Exclamation]")+13);
    scan.close();
    System.out.println("\nHere's the original Mad Lib story:\n");
    System.out.println(story1);//Display the original story
    System.out.println("\nHere's your Mad Lib story:\n");
    System.out.println(story2);
  }
}