/**
 * 
 * @author Dustin Olychuck
 * @version 30/01/2017
 * cyclic rotation problem from Codility
 * https://codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */
public class Rotation {
	/**
	 * 
	 * @param A An array of integers.
	 * @param K The number of places to the right to rotate
	 * @return A new array after the rotation.
	 */
	public static int[] solution(int[] A, int K) {
		int[] result = new int[A.length];
		for(int i = 0; i < A.length; i++) {
			result[(i+K)%A.length] = A[i];
		}
		return result;
    }
	public static void main(String[] args) {
	}

}
