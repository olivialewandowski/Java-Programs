/* 

Program written by Olivia Lewandowski on 1/30/23
The title of the selected song is "One More Hour," released by Tame Impala in February 2020. 
This program will print the first two stanzas of the song "One More Hour," using two techniques.

*/

//SongLyrics is the class name

public class SongLyrics
{
	public static void main(String [] args)
	{

		//print the first stanza using first technique: one print statement per line

		//added quotes around lyrics to practice using \" 

		System.out.println("\"Just a moment");
		System.out.println("Right before all the song and dance");
		System.out.println("Wasn't brave enough to tell you");
		System.out.println("But there ain't gonna be another chance");
		System.out.println("It's not long until");
		System.out.println("All that I have");
		System.out.println("And everything's still");
		System.out.println("The minutes are racin'");
		
		//break in stanzas

		System.out.println();

		//print the second stanza using second technique: one print statement per stanza

		String lyrics = "Whatever I've done\nI did it for love\nI did it for fun\nCouldn't get enough\nI did it for fame\nBut never for money\nNot for houses\nNot for her\nNot for my future children\nUntil now\"";

		System.out.println(lyrics);
	}
}
