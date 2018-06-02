import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {

  public static void main(String[] args) {
    // Create a function named `isSymmetric` that takes an n×n integer matrix (list of lists) as parameter
    // and returns true, if is that matrix is symmetric (diagonally from top-left to bottom-right)
    // or false if it is not
    //
    // example for symmetric matrix:
    // 1 0 1
    // 0 2 2
    // 1 2 5
    //
    // example for not symmetric matrix
    // 7 7 7
    // 6 5 7
    // 1 2 1

    ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();

    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(0, 5, 2)));
    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 2, 5)));

    System.out.println(isSymmetric(symmetricMatrix)); // should print out true
  }

  private static boolean isSymmetric(ArrayList<ArrayList<Integer>> symmetricMatrix) {
    for (int row = 0; row < symmetricMatrix.size(); row++) {
      for (int col = 0; col < symmetricMatrix.size(); col++) {
        if (symmetricMatrix.get(0).get(0).equals(symmetricMatrix.get(0).get(2))
                && symmetricMatrix.get(0).get(0).equals(symmetricMatrix.get(2).get(0))
                && symmetricMatrix.get(0).get(1).equals(symmetricMatrix.get(1).get(0))
                && symmetricMatrix.get(1).get(1).equals(symmetricMatrix.get(1).get(2))
                && symmetricMatrix.get(1).get(1).equals(symmetricMatrix.get(2).get(1))) {
          return true;
        }
      }
    }
    return false;
  }
}