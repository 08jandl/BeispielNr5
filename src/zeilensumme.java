public class zeilensumme {
    public static void main(String[] args) {
//5c arrays --> zeilensumme ausrechnen

        int[][] array = new int[][]{{12,12,12},{12,23,34},{13,12,25}};
        System.out.println("sth " + zeilensumme(array,2));

    }
    public static int zeilensumme (int[][] array, int zeile)
    {
        zeile =zeile - 1;

        if (zeile == 1)
        {
            return array[0][0] + array[0][1] + array[0][2];
        }
        if (zeile == 2)
        {
            return array[1][0] + array[1][1] + array[1][2];
        }
        if (zeile == 3)
        {
            return array[2][0] + array[2][1] + array[2][2];
        }
        else
        {
            return 0;
        }
    }
}
