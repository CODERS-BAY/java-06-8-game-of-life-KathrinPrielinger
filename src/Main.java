import java.lang.Math;
import static java.lang.Math.round;

class Main {
    public static void main(String[] args) {

        boolean[][] generation1 = new boolean[5][5];

        //1. zufällig befüllen
        //2. For schleife für N generationen
        //    2.1 Für Zelle in generation1 ([i][j])
        //           2.1.1 Zähle Nachbarn
        //           2.1.2 Status je nach eigenem leben/tot und anzahl nachbarn


        //Array zufällig mit 1 oder 0 füllen: random
        double zahl;

        for (int i = 0; i < generation1.length; i++) {
            for (int j = 0; j < generation1[i].length; j++) {

                //Random Zahl 1 oder 0 erzeugen
                zahl = Math.random();

                //double runden und in int casten
                int ganzZahl = (int) Math.round(zahl);

                //System.out.println(ganzZahl);

                //Zahl in true ode false umwandeln
                if (zahl <= 1 && zahl >= 0.5) { //1
                    boolean wert = true;

                    //System.out.println(wert);

                    //wert in Array generation speichern
                    generation1[i][j] = wert;

                }
                if (zahl < 0.5 && zahl >= 0) { //0
                    boolean wert = false;
                    //System.out.println(wert);

                    //wert in Array feld speichern
                    generation1[i][j] = wert;
                }
                boolean tempArray[] = {generation1[i - 1][-j], generation1[i - 1][j], generation1[i - 1][j + 1], generation1[i][j - 1], generation1[i][j - 1], generation1[i + 1][-j], generation1[i + 1][j], generation1[i + 1][j + 1]};
                System.out.println(tempArray);
                System.out.print(generation1[i][j] + " ");
            }
            System.out.println();
        }

       /* System.out.println("2. Generartion");

        boolean[][] generation2 = new boolean[5][5];


        //tote Zelle mit genau 3 lebenden Nachbarn lebt in nächster Generation:
        if (generation1[i][j] == false) {

        }
        if (generation1[i][j] == true) {

            //Lebende Zellen mit weniger als zwei lebenden Nachbarn sterben in der Folgegeneration an Einsamkeit.

        }
        if (generation1[i][j] == true) {

            //Eine lebende Zelle mit zwei oder drei lebenden Nachbarn bleibt in der Folgegeneration am Leben.

        }
        if (generation1[i][j] == true) {

            //Lebende Zellen mit mehr als drei lebenden Nachbarn sterben in der Folgegeneration an Überbevölkerung.

        }


                //if: zelle: false ...
                //Werte der toten Zellen -1, +1, -1, 1, +1, -1, 1, +1 suchen und zählen
                //if´s anwenden
                //Ergebnis in neues Array an den stellen von vorher speichern

    }

        */
    }
}




