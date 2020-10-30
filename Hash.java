import java.util.*;

public class Hash
{
		private int BUCKET;
		private LinkedList<Integer>[] table;
		public Hash(int b)
		{
				this.BUCKET = b;
				table = tangible.Arrays.initializeWithDefaultLinkedListOfIntInstances(BUCKET);
		}

		public final void insertItem(int key)
		{
				int index = hashFunction(key);
				table[index].addFirst(key);
		}

		public final int hashFunction(int x)
		{
				return (x % BUCKET);
		}

		public final void displayHash()
		{
		for (int i = 0; i < BUCKET; i++)
		{
				System.out.print(i);
				for (LinkedList<Integer> x : table[i])
				{
				System.out.print(" --> ");
				System.out.print(x);
				}
				System.out.print("\n");
		}
		}
}