import java.util.*;
public class Ans {
	public static int[] Check(int[] qu, int[] input) {
		int[][] ans = A(qu, input, 0, 0);
		return new int[]{ans[2][0], B(ans[0], ans[1], 0)};
	}

	private static int[][] A(int[] qu, int[] input, int i, int count) {
		if(i >= qu.length) return new int[][]{qu, input, {count}};
		if(qu[i] == input[i]) {
			count++;
			List<Integer> copy = new ArrayList<Integer>(Arrays.asList(ArrayUtils.toObject(qu)));
			copy.remove(i);
			qu = ArrayUtils.toPrimitive(copy.toArray(new Integer[0]));
			copy = new ArrayList<Integer>(Arrays.asList(ArrayUtils.toObject(input)));
			copy.remove(i);
			input = ArrayUtils.toPrimitive(copy.toArray(new Integer[0]));
			return A(qu, input, i, count);
		}
		return A(qu, input, i+1, count);
	}

	private static int B(int[] qu, int[] input, int i) {
		if(i >= qu.length) return 0;
		return BInside(qu, input, i, 0);
	}

	private static int BInside(int[] qu, int[] input, int i, int j) {
		if(j >= qu.length) return B(qu, input, i+1);
		if(i == j || qu[i] != input[j]) return BInside(qu, input, i, j+1);
		return B(qu, input, i+1)+1;//找到重複的數字後輪i，剩餘的j不用輪了
	}
}
