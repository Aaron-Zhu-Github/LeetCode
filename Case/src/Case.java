import java.util.*;
/*
 * Given an array of meeting time intervals where intervals[i] = [start_i, end_i], determine if a person could attend all meetings.

   Input: meetings = [[0, 30], [5, 10], [15, 20]]
   Output: false
 */
public class Case {
	public static boolean Meeting(int[][] space)
	{
		if(space == null || space.length == 0) return true;
		for(int i = 1; i < space.length; i++){
			if(space[i][0] < space[i - 1][1])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] m = {{0, 30}, {5, 10}, {15, 20}};
		System.out.println(Meeting(m));
		
		int[][] m_1 = {{0, 3}, {5, 10}, {15, 20}};
		System.out.println(Meeting(m_1));
	}

}
