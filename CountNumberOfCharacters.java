public class CountNumberOfCharacters {
    public static void main(String[] args)
    {
        String name = "Rajasekhar 1404";
        int count = 0;
        for(int i = 0; i < name.length(); i++)
        {
            if(name.charAt(i)!= ' ')
            count++;
        }
        System.out.println("Total number of characters in a string: " + count);
    }
}
