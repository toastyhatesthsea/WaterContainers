package Water;

public class Waters
{
    public int maxArea(int[] height) {

        return maxContainer(height);
    }


    public int maxContainer(int[] height)
    {
        int max = 0;
        int min = 1;
        boolean hasZero = false;
        for (int i = 0; i < height.length; i++)
        {

            for (int j = i + 1; j < height.length; j++)
            {
                int maxHeight;

                if (height[i] > height[j])
                {
                    maxHeight = height[j];
                } else
                {
                    maxHeight = height[i];
                }

                int total = maxHeight * (j - i);
                if (total > max)
                {
                    max = total;
                }
            }
        }

        return max;
    }

}


class WaterTesters
{
    public static void main(String[] argsdgsg)
    {
        Waters water = new Waters();

        int[] heights = {2, 3, 8, 2, 4, 6, 1, 2, 4};
        int[] sillyTest = {1, 1};
        int[] zeroAndOne = {0, 1};
        int[] anotherTestWithZero = {0, 1, 2, 4};
        int[] oneTwoOne = {1, 2, 1};

        int max = water.maxContainer(zeroAndOne);

    }
}