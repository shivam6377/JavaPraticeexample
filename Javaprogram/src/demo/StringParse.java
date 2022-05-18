package demo;
public class StringParse {
    //Write logic to find the character from the sentence at specified location
    public char characterLocator(String sentence, String location) {
        try {
    	int position = Integer.parseInt(location);
        return sentence.charAt(position);
        }
        catch (Exception e)
        {
        	throw (e);
        }
        
    }
}

