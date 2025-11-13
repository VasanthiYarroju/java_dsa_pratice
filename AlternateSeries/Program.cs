using System;

class AlternateSeries
{
    static void Main()
    {
        int[] list = { 3, 5, 1, 5, 9, 10, 2, 6 }; // 1,2,3,5,5,6,9,10
        Array.Sort(list); // Sorting the array
        int n = list.Length;

        for (int i = 0; i < n; i += 2)
        {
            Console.Write(list[i] + " ");
        }
    }
}
