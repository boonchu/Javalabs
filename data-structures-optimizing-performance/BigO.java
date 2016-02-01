public class BigO
{

  public static int maxDiff(int[] vals)
  {
    // O(1)
    int max = 0;
    // O(N): the nested loop looks for the maximum
    // value between two array elements. The biggest
    // difference will be between 1 and 8
    for (int i=0; i <vals.length; i++) {
        for (int j=0; j <vals.length; j++) {
            if (vals[i] - vals[j] > max) {
                max = vals[i] - vals[j];
            }
        }
    }
    return max;
  } 

  public static void reduce(int[] vals)
  {
    // O(1)
    int minIndex = 0;
    // O(N) : find the smallest value from array
    for (int i=0; i <vals.length; i++) {
        if (vals[i] < vals[minIndex]) {
            minIndex = i;
        }
    }

    // O(1)
    int minVal = vals[minIndex];
    // O(N) : reduce with minimal value 
    for (int i=0; i <vals.length; i++) {
        vals[i] = vals[i] - minVal;
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
    reduce(vals);
    println(vals);

    vals = new int[] {1,7,2,4,6,8};
    println(vals);
    System.out.println(maxDiff(vals));

  }

}
