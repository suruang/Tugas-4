import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
/**
 *
 * @author Taeyeon
 */
public class mainLinearSearch {
    public mainLinearSearch(int arrayLength) {
		// TODO Auto-generated constructor stub
	}

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        
        int searchKey;
        int position;
        int arrayLength;
        
        arrayLength = 25;
        
        mainLinearSearch searchArray = new mainLinearSearch(arrayLength);
        System.out.println(searchArray);
        
        System.out.println("Masukkan nilai yang akan dicari:");
        searchKey = Integer.parseInt(input.readLine());
        
        while (searchKey != -1)
        {   
            position = searchArray.linearSearch(searchKey);
            
            if(position == -1)
                System.out.println("Nilai tidak ditemukan");
            else
                System.out.println("Nilai "+searchKey+" ditemukan di index "+(position+1));
            
            System.out.println("input -1 untuk keluar");
            searchKey = Integer.parseInt(input.readLine());
        }
    }

	private int linearSearch(int searchKey) {
		return 0;
	}
}


