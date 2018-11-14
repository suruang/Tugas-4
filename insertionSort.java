import java.util.Date;
public class InsertionSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] tabInt = new int[100];
        int i,j,data_sisip,n,random;
        Date date1,date2;
        n=100;
        
        //isi data random
        for(i=0; i<n; i++){ 
            random = (int)(Math.random()*n);
            tabInt[i]=random;
        }
        
        //tampilkan data random
        System.out.println("Data Random");
        for(i=0; i<n; i++){ 
            System.out.print(tabInt[i]+" ");
        }
        
        date1 = new Date();
        for(i=1; i<n; i++){ 
            data_sisip = tabInt[i]; 
            j = i; 
            while((j>0) && (tabInt[j-1] > data_sisip)){            
                tabInt[j] = tabInt[j-1]; 
                j = j - 1; 
            }        
            tabInt[j] = data_sisip; 
        }
        date2 = new Date();        
        
        //tampilkan data terurut
        System.out.println("\nData Terurut");
        for(i=0; i<n; i++){ 
            System.out.print(tabInt[i]+" ");
        }
        
        //tampilkan waktu pengurutan
        System.out.println("\nWaktu Pengurutan :");
        System.out.println(date2.getTime() - date1.getTime()+" ms");
        
    }
}
