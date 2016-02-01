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

  }


  // best case : O(n)
  // worst case : O(n^2) when array is in reverse order
  public static void insertionSorted(int[] vals)
  {
    
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

    int[] vals = new int[] {1,2,5,3};
    println(vals);
    selectionSorted(vals);
    println(vals);

    vals = new int[] {3,10,5,0};
    println(vals);
    insertionSorted(vals);
    println(vals);
  }

}
