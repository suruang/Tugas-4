public class quickSort {
    static void quickSort (int a[], int lo, int hi){
    //  lo adalah index bawah, hi adalah index atas
    //  dari bagian array yang akan di urutkan
        int i=lo, j=hi, h;
        int pivot=a[lo];

    //  pembagian
        do{
            while (a[i]<pivot) i++;
            while (a[j]>pivot) j--;
            if (i<=j)
            {
                h=a[i]; a[i]=a[j]; a[j]=h;//tukar
                i++; j--;
            }
        } while (i<=j);

    //  pengurutan
        if (lo<j) quickSort(a, lo, j);
        if (i<hi) quickSort(a, i, hi);
    }

    
    public static void main(String[] args) {
        int tabInt[]={24,17,18,15,22,26, 13, 21, 16, 28};
        int i,n=10;
        
            for(i=0;i<n;i++){
                System.out.print(tabInt[i]+ " ");
           }
            System.out.print("\n");
        quickSort(tabInt,0,n-1);
        
        for(i=0;i<n;i++){
            System.out.print(tabInt[i]+" ");
        }

    }

}
