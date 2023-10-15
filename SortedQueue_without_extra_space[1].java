import java.util.LinkedList;
import java.util.Queue;
class sortQueue
{
	
	public static int minIndex(Queue<Integer> list,
									int sortIndex)
	{
	int min_index = -1;
	int min_value = Integer.MAX_VALUE;
	int s = list.size();
	for (int i = 0; i < s; i++)
	{
		int current = list.peek();
		
		
		list.poll();

		
		if (current <= min_value && i <= sortIndex)
		{
			min_index = i;
			min_value = current;
		}
		list.add(current);
	}
	return min_index;
}
	
	
	public static void mintorear(Queue<Integer> list,
											int min_index)
	{
		int min_value = 0;
		int s = list.size();
		for (int i = 0; i < s; i++)
		{
		int current = list.peek();
		list.poll();
		if (i != min_index)
			list.add(current);
		else
			min_value = current;
		}
		list.add(min_value);
	}
	
	public static void sortQueue(Queue<Integer> list)
	{
		for(int i = 1; i <= list.size(); i++)
		{
			int min_index = minIndex(list,list.size() - i);
			mintorear(list, min_index);
		}
	}

	
	public static void main (String[] args)
	{
		Queue<Integer> list = new LinkedList<Integer>();
		list.add(20);
		list.add(4);
		list.add(5);
		list.add(16);
		list.add(3);
		list.add(1);
		
		
		sortQueue(list);
		
		
		while(list.isEmpty()== false)
		{
			System.out.print(list.peek() + " ");
			list.poll();
		}
	}
}


/**
 * @author Pradumn Patel */