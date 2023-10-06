public class Successors {
    public static Position findPosition(int i, int[][] array2d)
    {
        for (int j = 0; j < array2d.length; j++)
        {
            for (int k = 0; k < array2d[0].length; k++)
            {
                if (array2d[j][k] == i)
                {
                    return new Position(j, k);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] array2d)
    {
        Position[][] positions = new Position[array2d.length][array2d[0].length];

        for (int r = 0; r < array2d.length; r++)
        {
            for (int c = 0; c < array2d[0].length; c++)
            {
                positions[r][c] = findPosition(array2d[r][c] + 1, array2d);
            }
        }
        return positions;
    }
}