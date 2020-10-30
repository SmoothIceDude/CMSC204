public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: The following #include directive was ignored:
	//#include <bits/stdc++.h>

	public static void main(String[] args)
	{
			int[] keys = {27, 53, 13, 10, 138, 109, 49, 174, 26, 24};
			int N = 13;
			int prime = 19;
			int[] hash = new int[N];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(hash,0,(Integer.SIZE / Byte.SIZE));
			for (int i = 0 ; i < 10; i++)
			{
					int pk = keys[i];
					System.out.print("key: ");
					System.out.print(pk);
					System.out.print("\n");
					int ip = pk % N;
					int q = pk / N;
					int offset;
					int trials = 1;
					if (q % N != 0)
					{
							offset = q;
					}
					else
					{
							offset = prime;
					}
					while (hash[ip] != 0)
					{
							ip = (ip + offset) % N;
							trials++;
					}
					System.out.print("Trials for ");
					System.out.print(pk);
					System.out.print(" : ");
					System.out.print(trials);
					System.out.print("\n");
					hash[ip] = pk;
			}
			for (int i = 0 ; i < N; i++)
			{
					System.out.print(i);
					System.out.print(" : ");
					System.out.print(hash[i]);
					System.out.print("\n");
			}
	}

	public static The following code snippet implements_Keyword bucket hashing of 10 elements in C++.The required output for bucket hashing can be easily derived from the program output below.using namespace std = new The();

	public static void main(String[] args)
	{

	int[] a = {27, 53, 13, 10, 138, 109, 49, 174, 26, 24};
//C++ TO JAVA CONVERTER WARNING: This 'sizeof' ratio was replaced with a direct reference to the array length:
//ORIGINAL LINE: int n = sizeof(a)/sizeof(a[0]);
	int n = a.length;

	Hash h = new Hash(10);
	for (int i = 0; i < n; i++)
	{
			h.insertItem(a[i]);
	}

	h.displayHash();

	}
}