import static java.lang.System.out;
import java.util.Random;
public class Question
{
	public static int[] make()
	{
		int ansNumber = (int)((new Random()).nextInt(9000))+1000;
		int[] ans = toArray(ansNumber,
				(new int[Integer.toString(ansNumber).length()]), 0);
		if(check(ans, 0)){
			out.println("題目："+ansNumber+"，有重複數字，重出");
			return make();
		}
		//out.println("題目；"+ansNumber+"，沒重複數字，Ya!");
		return ans;
	}

	public static int[] toArray(int num, int[] arr, int i)
	{
		if(i < arr.length){
			int digit = num % 10;
			arr[arr.length - 1 - i] = digit;
			return toArray((num-digit)/10, arr, i+1);
		}
		return arr;
	}

	public static boolean check(int[] arr, int i)
	{
		if(i >= arr.length)
			return false;
		return checkInside(arr, i, i+1);//j從i的下一個開始輪
	}

	public static boolean checkInside(int[] arr, int i, int j)
	{
		if(j >= arr.length)
			return check(arr, i+1);//j輪完了，i往下一格
		if(arr[i] != arr[j])
			return checkInside(arr, i, j+1);//固定i，j往下一格
		return true;
	}
}
