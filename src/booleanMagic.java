/**
 * Author: Brandon B.
 * Date: 9-10-15
 */
 
import java.util.Scanner;
public class booleanMagic {
    public static void main(String[] args) {
    	int grade;
    	Scanner kbReader = new Scanner(System.in);

    	System.out.print("What is your grade? ");
    	grade = kbReader.nextInt();

		if(grade >= 90) {
			System.out.println("Gute arbeit! - A");
		}
		else if(grade >= 80) {
			System.out.println("Herr Vessa ist erfreut nicht! - B");
		}
		else if(grade >= 70) {
			System.out.println("Du bist sehr dumm! - C");
		}
		else {
			System.out.println("Du musst \"Treffpunkt Hebron\" ansehen!");
		}
    }

    public static void booleans() {
    	// Boolean - BOO (like a ghost), LEAN - (like @leanandcuisine on instagram)
    	// The 'not statement' (!)
    	System.out.println(!true);
    	System.out.println(!false);

		// **THE** 'statement' (? i guess?)
    	System.out.println(true);
    	System.out.println(false);

		// Boolean logic
		System.out.println(3 < 5); // TRUE!
		System.out.println(!(3 < 5)); // FALSE!
		System.out.println(5 < 3); // FALSE!
		System.out.println(!(5 < 3)); // TRUE!

		// And statement
		System.out.println((7 < 10) && (6 == 6)); // TRUE!
		System.out.println((7 > 10) && (6 == 6)); // FALSE! 7 isn't greater than 10
		System.out.println((7 > 10) && (6 == 9)); // FALSE! I.WAS.RIGHT.AND.PFEFFER.WAS.WRONG!

		// Or statement || (php i miss you and these disgusting things)
		System.out.println((7 < 10) || (6 == 9)); // TRUE! 7 < 10
		System.out.println((7 < 10) || (6 == 6)); // TRUE! CUZ Y'KNOW, BOTH ARE TRUE
		System.out.println((7 > 10) || (6 == 9)); // FALSE! BOTH ARE WRONG!!!!JH!JH!LLJKFJHFLD

		// Disgust
		System.out.println(((7 < 10) && (5 == 5)) || (6 == 9)); // TRUER THAN BP! 7 < 10, 5 = 5, AND 6 = 9 IS IRRELEVANT

		// I'm such a savage
		boolean is_logan_ugly = true, c = false;
		double jj /* koletar */ = 40.0, d = 13.89;
		int x = 79, y = 46, z = -3;

		System.out.println(is_logan_ugly); // the sad and unfortunate truth
		System.out.println(c || (d > 0)); // TRUE BECAUSE D(eez nuts) IS GREATER THAN 0, EVEN IF C IS FALSE!
		System.out.println(!is_logan_ugly || c); // THEY'RE BOTH FALSE, FALSEEE!!
		System.out.println((x > 102) && true); // fALSE!
		System.out.println((jj == 1) || false); // FALSE!!
		System.out.println((jj == 40) && !false); // TRUE!!!
		System.out.println(!(x != 3)); // TRUE!
		System.out.println(!!true); // Why be clean when you can double-negate yourself? --there ain't no dippin sauce here-

		// Boolean Operator Precedence
		// !    ==    !=    &&    ||
    }
}
