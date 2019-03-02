import java.util.*;

public class Sorts{
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    public Sorts(){
        steps = 0;
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(ArrayList <Integer> list){
        //replace these lines with your code
        System.out.println();
        System.out.println("Bubble Sort");
        System.out.println();

        steps = 0;
        for (int outer = 0; outer < list.size() - 1; outer++){
            for (int inner = 0; inner < list.size()-outer-1; inner++){
                steps += 3;//count one compare and 2 gets
                if (list.get(inner)>(list.get(inner + 1))){
                    steps += 4;//count 2 gets and 2 sets
                    int temp = list.get(inner);
                    list.set(inner,list.get(inner + 1));
                    list.set(inner + 1,temp);
                }
            }
        }
    }        
/* a[0] to a[n-1] is the array to sort */
//int i,j;
//int n; // initialise to a's length
/* advance the position through the entire array */
/*   (could do j < n-1 because single element is also min element) */
//for (j = 0; j < n-1; j++)
//{
    /* find the min element in the unsorted a[j .. n-1] */
    /* assume the min is the first element */
    //int iMin = j;
    /* test against elements after j to find the smallest */
    //for (i = j+1; i < n; i++)
    //{
        /* if this element is less, then it is the new minimum */
        //if (a[i] < a[iMin])
        //{
            /* found new minimum; remember its index */
            //iMin = i;
        //}
    //}
    //swap(a[j], a[iMin]);
//}
        
     public void swap( ArrayList<Integer> list, int i , int j){
         steps += 4;
         int temp = list.get(i);
         list.set(i, list.get(j));
         list.set(j, temp);
    }
    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList <Integer> list){
        //replace these lines with your code
        steps = 0; 
        int n = list.size();
         for( int i= 0; i < n - 1; i++){
             int min = 1;
             
             for (int j = i+1; j <n; j++){
                 if (list.get(j) < list.get(min)){
                     min = j;
                     steps += 3;
                    }
              swap(list, i , min);
            }
        }
         System.out.println();
        System.out.println("Selection Sort");
        System.out.println();
    // One by one move boundary of unsorted subarray 
    
}
    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    
//    Insertion Sort
//i ← 1
//while i < length(A)
  //  x ← A[i]
  //  j ← i - 1
  //  while j >= 0 and A[j] > x
  //      A[j+1] ← A[j]
  //      j ← j - 1
  //  end while
  //  A[j+1] ← x
  //  i ← i + 1
//end while
  
    public void insertionSort(ArrayList <Integer> list){
        //replace these lines with your code
        int i = 1;
        steps = 0;
         while (i< list.size()){
             int x = list.get(i);
             int j = i-1;
             steps += 3;
             while(j >=0 && list.get(j) > x){
                 list.set(i+1,list.get(j));
                 j--;
                 steps += 4;
             }
             list.set(j+1, x);
             i++;
             steps ++;
         }
         System.out.println();
        System.out.println("Insertion Sort");
        System.out.println();
    }

     /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    void mergeSort(int arr[], int l, int r) 
    { 
    if (l < r) 
        { 
        
        int m = l+(r-l)/2; 
  
        
        mergeSort(arr, l, m); 
        mergeSort(arr, m+1, r); 
  
        merge(arr, l, m, r); 
    } 
} 
    void merge(int arr[], int l, int m, int r) 
{ 
    int i, j, k; 
    int n1 = m - l + 1; 
    int n2 =  r - m; 
  
    
    int L[] = new int [n1];
    int R[] = new int [n2];
  
    
    for (i = 0; i < n1; i++) {
        L[i] = arr[l + i];
        steps++;
    }
    for (j = 0; j < n2; j++){ 
        R[j] = arr[m + 1+ j]; 
        steps++;
    }
    
    i = 0; 
    j = 0; 
    k = l; 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[k] = L[i]; 
            i++; 
            steps++;
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
            steps++;
        } 
        k++; 
    } 
  
    
    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++;
        steps++;
    } 
  
    
    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
        steps++;
    } 
} 
    /**
     *  Accessor method to return the current value of steps
     *
     */
    public long getStepCount(){
        return steps;
    }

    /**
     *  Modifier method to set or reset the step count. Usually called
     *  prior to invocation of a sort method.
     *
     * @param  stepCount   value assigned to steps
     */
    public void setStepCount(long stepCount){
        steps = stepCount;
    }
}
