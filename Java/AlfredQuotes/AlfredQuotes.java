
import java.text.Format;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name , String dayTime) {
        
        return String.format("Good %s %s , lovely to see you.How are you ?" ,dayTime , name);
    }
    
    public String dateAnnouncement() {
    
        return String.format("Today date is %s" , new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {

        if (conversation.indexOf("Alexis") > -1 ){
            return "She is really of no help . What can I get for you?" ;
        }
        if (conversation.indexOf("Alfred") > -1){
            return "At your service , naturally .How may I be of assistance?" ;
        }
        return "Right . And with that I shall retire" ;
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

