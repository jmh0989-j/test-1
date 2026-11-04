import java.util.Scanner;

public class ChooseYourPath{


    public static void print(String x) {
        System.out.println(x);
    }


    public static void main(String[] args) {


        print("You find yourself in an odd place after phasing through the floor. " +
        "The walls are yellow and covered in old wallpaper. You begin looking around at your surrondings " +
        "and notice that you are in an endless maze of halls and rooms.");
        // init scanner
        Scanner scan = new Scanner(System.in);
        // ask first question and assign to a variable
        print("Would you like to go exploring in the endless labrynth? [Y/n]");
        String opt1 = scan.nextLine();

        boolean gun;
        // take only the first character of the input
        opt1=opt1.substring(0,1);
        if (opt1.equals("y")) { 
            print("You go exploring and come across a silver 1960 Smithen Western Six Shot revolver. Do you take it? [Y/n]");
            opt1=scan.nextLine();
            opt1=opt1.substring(0,1);
            // check if input is "y" or "Y"
            if (opt1.equals("y") || opt1.equals("Y")) {
                gun = true;
	    } else {
                gun = false;
	    }
	      
            print("You hear a far-away scream. Do you follow the sound? [Y/n]");
            opt1 = scan.nextLine();
            opt1 = opt1.substring(0, 1);
            // splitting paths;
            if (opt1.equals("N") || opt1.equals("n")) {
                print("You ignore the sound and continue exploring. You find a door with a sign that says 'Exit'. Do you go through it? [Y/n]");
                opt1 = scan.nextLine();
                opt1 = opt1.substring(0, 1);
                if (opt1.equals("y") || opt1.equals("Y") || opt1.equals("")) {
                    print("You go through the door and find yourself back in the real world. You are safe.");
                } else {
                    print("You stay in the backrooms and eventually die from starvation.");
                }
            }
            else {
                print("You find a monster with a half eaten man. Do you shoot it? [Y/n]");
                opt1=scan.nextLine();
                opt1=opt1.substring(0,1);
                    // yes and gun
                    if ((opt1.equals("y") || opt1.equals("Y")) && gun){
                    print("You shot the monster, killing it in cold blood. You now live in the backrooms.");
                    }
                    // yes without gun
                    else if(((opt1.equals("y") || opt1.equals("Y")) && !gun)) {
                        print("You reach for a gun you do not have, and the monster rushes at you. You die.");
                    }
                    // no with gun
                    else if((opt1.equals("n") || opt1.equals("N"))&& gun){
                        print("you are stricken with fear, making you unable to reach for your gun, " +
                        "causing the monster to capture you.");
                    }
                    // no without gun
                    else if((opt1.equals("n") || opt1.equals("N") && !gun)){
                        print("With no way to defend yourself, you are stricken with fear and faint, allowing the monster to kill you.");
                    }
                }
 } 
        else {
            // "no" option from first question
            print("You stay put and die from a monster attack.");
            }
    // close scanner
    scan.close();
        }
}