import java.util.Scanner;

public class ChooseYourPath{

    public static void print(String x) {
        System.out.println(x);
    }

    public static void main(String[] args) {

        print("You find yourself in an odd place after phasing through the floor. " +
        "The walls are yellow and covered in old wallpaper. You begin looking around at your surrondings " +
        "and notice that you are in an endless maze of halls and rooms.");
        Scanner scan = new Scanner(System.in);
        print("would you like to go exploring in the endless labrynth? [Y/n]");
        String opt1 = scan.nextLine();

        boolean gun;
        opt1=opt1.substring(0,1);
        if (opt1.equals("y")) { 
            print("You go exploring and come across a silver 1960 Smithen Western Shix Shot revolver. Do you take it? [Y/n]");
            opt1=scan.nextLine();
            opt1=opt1.substring(0,1);
            if (opt1.equals("y") || opt1.equals("Y")) {
                gun = true;
	    } else {
                gun = false;
	    }
	
	print("You hear a far-away scream. Do you follow the sound? [Y/n]");
	opt1 = scan.nextLine();
	opt1 = opt1.substring(0, 1);
	if (opt1.equals("y") || opt1.equals("Y")) {
	    
	}
	else{
	print("you find a monster with a half eaten man. Do you shoot it [Y/n]");
	opt1=scan.nextLine();
	opt1=opt1.substring(0,1);
	if ((opt1.equals("y") || opt1.equals("Y")) && gun){
		print("you shot the monster killing it in cold blood and now you live in the backrooms");
	}
	else if(((opt1.equals("y") || opt1.equals("Y")) && !gun)) {
        print("you reach for a gun you do not have and the monster rushes at you and you die");
	}
    else if((opt1.equals("n") || opt1.equals("N"))&& gun){
        print("you are stricken with fear making you unable to reach for your gun"+
        " causing the monster to murder you");
    }
    else if((opt1.equals("n") || opt1.equals("N")&& !gun)){
        print("with no way to defend yourself you are stricken with fear and faint allowing the monster to kill you");
    }
	}
 } else {
            print("You stay put and die from a monster attack.");
	}
    }
}
