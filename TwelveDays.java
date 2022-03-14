import java.util.*;

class TwelveDays {
    ArrayList<String> days;
    ArrayList<String> items;

    TwelveDays(){
        days = new ArrayList<>(Arrays.asList("first", "second", "third", "fourth", "fifth", "sixth", 
        "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"));

        items = new ArrayList<>(Arrays.asList("a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", 
        "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking",
        "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"));
    }

    String verse(int verseNumber) {
        StringBuilder resultVerse = new StringBuilder();

        resultVerse.append(String.format("On the %s day of Christmas my true love gave to me: ", days.get(verseNumber-1)));
        for(int i=verseNumber-1; i>=0; i--){
            if(i==0){
                if(verseNumber>1)
                    resultVerse.append("and "+items.get(i));
                else
                    resultVerse.append(items.get(i));
                resultVerse.append(".\n");
            }
            else{
                resultVerse.append(items.get(i));
                resultVerse.append(", ");
            }
        }
        
        return resultVerse.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder resultVerses = new StringBuilder();
        for(int i=startVerse; i<=endVerse; i++){
            if(i==endVerse)
                resultVerses.append(verse(i));
            else
                resultVerses.append(verse(i)+"\n");
        }
        
        return resultVerses.toString();
    }
    
    String sing() {
        return verses(1, 12);
    }
}