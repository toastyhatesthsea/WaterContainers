package Water;

public class Waters
{


    public int maxArea(int[] height) {

        return maxContainer(height);
    }


    public int maxContainer(int[] height)
    {
        int max = 1;
        int min = 1;
        boolean hasZero = false;
        for (int i = 0; i < height.length; i++)
        {
            if (height[i] == 0)
            {
                hasZero = true;
            }
            for (int j = i + 1; j < height.length && height[i] >= 2; j++)
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

        if (max == 1 && hasZero)
        {
            return 0;
        }
        else
        {
            return max;
        }
    }

}


class WaterTesters
{
    public static void main(String[] argsdgsg)
    {
        Waters water = new Waters();

        int[] heights = {2, 3, 8, 2, 4, 6, 1, 2, 4};
        int[] sillyTest = {1, 1};
        int[] zeroAndOne = {0, 1, 2, 4};

        int max = water.maxContainer(zeroAndOne);

    }
}