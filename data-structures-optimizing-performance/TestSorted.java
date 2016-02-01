import static java.util.concurrent.TimeUnit.NANOSECONDS;

// TestSorted.java
// :
// :
public class TestSorted
{

  // For each position i from 0 to length-2
  // find smallest element in position i to length-1
  // swap it with element in position i
  public static void selectionSorted(int[] vals)
  {
    final long start = System.nanoTime();

    int indexMin;
    // O(n) * O(n-i)
    // : 1+2+3+...+(n-2)+(n-1) + n
    // : n(n-1)/2 + n
    // : (n^2+n)/2 => O(n^2)
    for (int i=0; i <vals.length; i++) {
        indexMin = i;
        // O(n-(i+1)) ~ O(n-i)
        for (int j=i+1; j < vals.length; j++) {
            if (vals[j] < vals[indexMin]) {
                indexMin = j;
            }
        }
        // swap(vals, indexMin, i);
        // O(1)
        int temp = vals[indexMin];
        vals[indexMin] = vals[i];
        vals[i] = temp;
    }
   
    // System.out.println("Benchmark time is " + (long) NANOSECONDS.toSeconds((long) System.nanoTime() - start) + " seconds");
    System.out.format("Benchmark time is %f seconds\n", ((double) System.nanoTime() - start) / 1000000000);

  }


  // best case : O(n)
  // worst case : O(n^2) when array is in reverse order
  public static void insertionSorted(int[] vals)
  {
    long start = System.nanoTime();
    
    int currentIndex;
    for (int i=0; i <vals.length; i++) {
        currentIndex = i;
        while (currentIndex > 0 && vals[currentIndex] < vals[currentIndex-1]) {
            // swap(vals, indexMin, i);
            // O(1)
            int temp = vals[currentIndex];
            vals[currentIndex] = vals[currentIndex-1];
            vals[currentIndex-1] = temp;
           
            currentIndex = currentIndex - 1; 
        }
    }
    // System.out.println("Benchmark time is " + NANOSECONDS.toSeconds(System.nanoTime() - start) + " seconds");
    System.out.format("Benchmark time is %f seconds\n", ((double) System.nanoTime() - start) / 1000000000);

  }

  public static void println(int[] vals) 
  {

    System.out.print("[");
    for (int i=0; i <vals.length; i++) {
        System.out.print(vals[i] + ",");
    }
    System.out.println("]");

  }

  public static void main (String[] args) 
  {

    int[] vals = new int[] {99,8,10,4,6,9,15,24,22,1,11,2,16,5,3,78,100};
    System.out.println("Selection Sorted Test O(n^2)");
    println(vals);
    selectionSorted(vals);
    println(vals);

    vals = new int[] {99,8,10,4,6,9,15,24,22,1,11,2,16,5,3,78,100};
    System.out.println("Inserion Sorted Test O(n) -> O(n^2)");
    println(vals);
    insertionSorted(vals);
    println(vals);
  }

}
