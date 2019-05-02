import java.util.HashMap;

public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap phoneBook = new HashMap();

    
    public MapTester()
    {
        phoneBook.put("Luke","1221");
    }
    
    public void enterNumber(String name, String number)
    {
        phoneBook.put(name, number);
    }
    public String lookupNumber(String name)
    {
        return (String) phoneBook.get(name);
        
    }

}
