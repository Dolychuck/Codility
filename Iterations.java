
public class Iterations {
	public static int solution(int N) {
		if(N <= 0)
			return 0;
		int result = 0;
		int current = 0;
		boolean hasOne = false;
		String binary = Integer.toBinaryString(N);
		
		if(binary.charAt(0) == '1')
			hasOne = true;
		for(int i = 1; i < binary.length(); i++) {
			if(hasOne == true) {
				if(binary.charAt(i) == '0') {
					current++;
				}
				if(binary.charAt(i) == '1') {
					result = Math.max(result, current);
					current = 0;
				}
			} else {
				hasOne = true;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(solution(10));
	}

}
