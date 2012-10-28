import static java.lang.System.out;
import java.util.Random;
public class Question {
	public static int[] make() {
		int ansNumber = (int)((new Random()).nextInt(9000))+1000;
		int[] ans = toArray(ansNumber);
		if(check(ans, 0)){
			out.println("題目："+ansNumber+"，有重複數字，重出");
			return make();
		}
		return ans;
	}

	public static int[] toArray(int num) {
		if(num == 0) return new int[]{};
		int[] digit = {num % 10};
		return Util.append(toArray((num-digit[0])/10), digit);
	}

	public static boolean check(int[] arr, int i) {
		if(i >= arr.length) return false;
		return checkInside(arr, i, i+1);//j從i的下一個開始輪
	}

	public static boolean checkInside(int[] arr, int i, int j) {
		if(j >= arr.length) return check(arr, i+1);//j輪完了，i往下一格
		if(arr[i] != arr[j]) return checkInside(arr, i, j+1);//固定i，j往下一格
		return true;
	}
}
