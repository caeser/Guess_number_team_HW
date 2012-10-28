import static java.lang.System.out;
public class Main
{
	public static void main(String ... args)
	{
		int[] qu = Question.make(), input = {1,2,3,4},
			AB = Ans.Check(qu, input);
		out.println(AB[0]+"A"+AB[1]+"B");
	}
}
