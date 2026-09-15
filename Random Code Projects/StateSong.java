public class StateSong
{
    public static void main(String[] args)
    {
        String state = "Illinois"; // A String created using a literal & An immutable String
        String songName = "Illinois"; 
        state += " " + state; // Concatenation of Strings using the += operator
        int year = 1893; // The lyrics were officially penned by Charles Chamberlain in 1893
        
        // Printing the Song Header
        System.out.println("the Illinois state song is: " + songName + " and was made in " + year); // Implicit type conversion via concatenation
        
        // --- STANZA 1 ---
        System.out.println("By thy rivers gently flowing, " + state); // The + operator for concatenation
        System.out.println("O'er thy prairies verdant growing, " + state);
        System.out.println("Comes an echo on the breeze.");
        System.out.println("Rustling through the leafy trees, and its mellow tones are these, " + state);
        System.out.println("and its mellow tones are these, " + songName);
        System.out.println(); // Prints a blank line between stanzas
        
        // --- STANZA 2 ---
        System.out.println("From a wilderness of prairies, " + state);
        System.out.println("Straight thy way and never varies, " + state);
        System.out.println("Till upon the inland sea,");
        System.out.println("Stands thy great commercial tree, turning all the world to thee, " + state);
        System.out.println("Turning all the world to thee, " + songName);
        System.out.println();
        
        // --- STANZA 3 ---
        System.out.println("When you heard your country calling, " + state);
        System.out.println("Where the shot and shell were falling, " + state);
        System.out.println("When the Southern host withdrew,");
        System.out.println("Pitting Gray against the Blue, there were none more brave than you, " + state);
        System.out.println("There were none more brave than you, " + songName);
        System.out.println();
        
        // --- STANZA 4 ---
        System.out.println("Not without thy wondrous story, " + state);
        System.out.println("Can be writ the nation's glory, " + state);
        System.out.println("On the record of thy years,");
        System.out.println("Abraham Lincoln's name appears, Grant and Logan, and our tears, " + state);
        System.out.println("Grant and Logan, and our tears, " + songName);
    }
}
