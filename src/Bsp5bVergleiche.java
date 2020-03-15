public class Bsp5bVergleiche {
    public static void main(String[] args) {
        //5b vergleiche
        System.out.println("Enthalten " + vergleiche("dfrrrg", "dderf"));
    }
    public static int vergleiche (String s1, String s2)
    {
        if (s2.contains(s1) && s1.contains(s2))
        {
            return 3;
        }
        if (s2.contains(s1))
        {
            return 1;
        }
        if (s1.contains(s2))
        {
            return 2;
        }
        else
        {
            return 4;
        }
    }
}
