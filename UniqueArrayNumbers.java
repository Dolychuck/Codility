import java.util.HashSet;

/**
 * @author Dustin Olychuck
 * @version 29/01/2017
 * https://codility.com/programmers/lessons/6-sorting/distinct/
 */
public class UniqueArrayNumbers {
	/**
	 * 
	 * @param A N is an integer within the range [0..100,000];
	 * @return Number of unique numbers.
	 */
	public static int solution(int[] A) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		return set.size();
	}

	public static void main(String[] args) {
		int[] A = {2,1,2,1,1,3};
		System.out.println(solution(A));
	}
}
