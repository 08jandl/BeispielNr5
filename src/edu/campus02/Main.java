package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// Bsp5
        //5.a taschenrechner
        System.out.println("Das Ergebnis lautet: " + taschenrechner(243, 784, "minus"));

    }
    public static double taschenrechner (double zahl1, double zahl2, String operation)
    {
        double ergebnis;

        if (operation == "plus")
        {
            return ergebnis = zahl1 + zahl2;
        }
        if (operation == "minus")
        {
            return ergebnis = zahl1 - zahl2;
        }
        if (operation == "mal")
        {
            return ergebnis = zahl1 * zahl2;
        }
        if (operation == "durch")
        {
            return ergebnis = zahl1 / zahl2;
        }
        else
        {
            return 0;
        }
    }
}
