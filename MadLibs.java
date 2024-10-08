import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String story = "Once upon a time in a <adjective4> land, a <noun4> <adverb2> grew. "
                + "In a <adjective1> village, there lived a <noun1>. "
                + "Every day, the <noun2> would <verb1> to the <place1> to <verb2> <pluralNoun1>. "
                + "One day, a <adjective2> <animal1> appeared, and it began to <verb3> all the <pluralNoun2>. "
                + "This caused the villagers to <verb4> <adverb1> until the <adjective3> <heroNoun1> stepped in and "
                + "saved the day by <verb5>-ing the <animal2> back to its <place2>. "
                + "I went to the <noun3>, the <plural_noun3>, and the <number> beasts were there. "
                + "Everyone in the village celebrated and <verb6>ed together happily ever after.";

        System.out.print("Enter an adjective: ");
        String adjective1 = input.nextLine();
        story = story.replace("<adjective1>", adjective1);

        System.out.print("Enter a noun: ");
        String noun1 = input.nextLine();
        story = story.replace("<noun1>", noun1);

        System.out.print("Enter another noun: ");
        String noun2 = input.nextLine();
        story = story.replace("<noun2>", noun2);

        System.out.print("Enter a verb: ");
        String verb1 = input.nextLine();
        story = story.replace("<verb1>", verb1);

        System.out.print("Enter a place: ");
        String place1 = input.nextLine();
        story = story.replace("<place1>", place1);

        System.out.print("Enter another verb: ");
        String verb2 = input.nextLine();
        story = story.replace("<verb2>", verb2);

        System.out.print("Enter a plural noun: ");
        String pluralNoun1 = input.nextLine();
        story = story.replace("<pluralNoun1>", pluralNoun1);

        System.out.print("Enter another adjective: ");
        String adjective2 = input.nextLine();
        story = story.replace("<adjective2>", adjective2);

        System.out.print("Enter an animal: ");
        String animal1 = input.nextLine();
        story = story.replace("<animal1>", animal1);

        System.out.print("Enter another verb: ");
        String verb3 = input.nextLine();
        story = story.replace("<verb3>", verb3);

        System.out.print("Enter another plural noun: ");
        String pluralNoun2 = input.nextLine();
        story = story.replace("<pluralNoun2>", pluralNoun2);

        System.out.print("Enter another verb: ");
        String verb4 = input.nextLine();
        story = story.replace("<verb4>", verb4);

        System.out.print("Enter an adverb: ");
        String adverb1 = input.nextLine();
        story = story.replace("<adverb1>", adverb1);

        System.out.print("Enter another adjective: ");
        String adjective3 = input.nextLine();
        story = story.replace("<adjective3>", adjective3);

        System.out.print("Enter a hero noun (e.g., knight, wizard): ");
        String heroNoun1 = input.nextLine();
        story = story.replace("<heroNoun1>", heroNoun1);

        System.out.print("Enter another verb: ");
        String verb5 = input.nextLine();
        story = story.replace("<verb5>", verb5);

        System.out.print("Enter another animal: ");
        String animal2 = input.nextLine();
        story = story.replace("<animal2>", animal2);

        System.out.print("Enter another place: ");
        String place2 = input.nextLine();
        story = story.replace("<place2>", place2);

        System.out.print("Enter a noun: ");
        String noun3 = input.nextLine();
        story = story.replace("<noun3>", noun3);

        System.out.print("Enter a plural noun: ");
        String pluralNoun3 = input.nextLine();
        story = story.replace("<plural_noun3>", pluralNoun3);

        System.out.print("Enter a number: ");
        String number = input.nextLine();
        story = story.replace("<number>", number);

        System.out.print("Enter one last verb: ");
        String verb6 = input.nextLine();
        story = story.replace("<verb6>", verb6);

        System.out.print("Enter another adjective: ");
        String adjective4 = input.nextLine();
        story = story.replace("<adjective4>", adjective4);

        System.out.print("Enter a noun: ");
        String noun4 = input.nextLine();
        story = story.replace("<noun4>", noun4);

        System.out.print("Enter an adverb: ");
        String adverb2 = input.nextLine();
        story = story.replace("<adverb2>", adverb2);

        System.out.println("\nHere is your completed Mad Libs story:");
        System.out.println(story);

        input.close();
    }
}
