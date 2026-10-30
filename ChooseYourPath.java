import java.util.Scanner;

public class ChooseYourPath{
    public static void print(String x) {
        System.out.println(x);
    }
    public static void main(String[] args) {
        print("You find yourself in an odd place after phasing through the floor. " +
        "The walls are yellow and covered in old wallpaper. You start to look around at your surrondings"+
        " finding that you are in an endless maze of halls and rooms.");
        Scanner scan = new Scanner(System.in);
        print("would you like to go exploring in the endless labrynth. yes or no");
        String opt1 = scan.nextLine();
        boolean gun;
        opt1=opt1.substring(0,1);
        if (opt1.equals("y")) { 
            print("You go exploring and come upon a silver 1960 smithen western shix shot revolver do you take it"+" yes or no");
            opt1=scan.nextLine();
            opt1=opt1.substring(0,1);
            if (opt1.equals("y")){
                gun=true;}
            else{
                gun=false;}}
    
        else{
            print("you stay put and die from a monster attack");}
    }
}
