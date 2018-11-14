import java.util.Random;
public class linearSearch {
    private int [] data;
    static private Random randomValue = new Random();
    
    public linearSearch(int sizeArray)
    {
        data = new int [ sizeArray];
        for(int i=0;i<sizeArray;i++)
        {
            data[i]= 1 + randomValue.nextInt(125);
        }
    }
    
    public int linearSearch(int searchKey)
    {
        for(int index=0; index < data.length; index++)
            if(data[index]== searchKey)
                return index;
        return -1;
    }
    
    @Override
    public String toString()
    {
        StringBuffer temp = new StringBuffer();
        for(int element:data)
        
            temp.append(element + " ");
            temp.append("\n");
            
            return temp.toString();
        
    }
}

