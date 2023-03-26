package com.example.projectem8;

public class Resposta {
    public static String question[] ={
            "Busqueu aquest carreu i situeu-lo al plànol.",
            "Quants escuts de la ciutat has pogut comptabilitzar al\n" +
                    "llarg de la visita?\n" +
                    "- entre 10 i 20\n" +
                    "- entre 21 i 40\n" +
                    "- més de 40",
            "Segons la imatge, on creieu que estava situat l’orgue\n" +
                    "anterior? Situeu-lo al plànol",
            "Ara aneu al lloc, busqueu el codi i obriu la informació.\n" +
                    "Observeu bé la imatge i responeu.\n" +
                    "- està arran de terra\n" +
                    "- està suspès en una balconada",
            "Aneu a la ubicació que mostra el plànol i obriu la\n" +
                    "informació del codi QR\n" +
            "Quina és la relació entre el disseny de la façana del nou\n" +
                    "orgue i la ciutat de Valls?\n" +
                    "- els calçots i els castells\n" +
                    "- els castells i el campanar\n" +
                    "- el campanar i els gegants",
            "Aneu a la ubicació que mostra el plànol i obriu la nova\n" +
                    "informació.\n" +
            "Llegiu i relacioneu cada tipus d’orgue amb la definició que " +
                    "creieu que li correspon.\n" +
                    "1- orgue portatiu a- té només un teclat però ja té\n" +
                    "dimensions considerables\n" +
                    "2- orgue positiu b- es porta a sobre mentre e toca\n" +
                    "3- orgue principal c- es pot posar a diferents llocs\n" +
                    "4- gran orgue d- té milers de tubs i necessita un\n" +
                    "espai gran per a posar-lo",
            "Ja sabeu força coses sobre aquest instrument. Aneu a la\n" +
                    "nova ubicació per continuar amb l’activitat.\n" +
            "Mireu bé la façana de l’orgue i trieu de totes aquestes\n" +
                    "parts les que són visibles.\n" +
                    "barnilles, caixa de l’expressiu, manuals, manxes, pedal de\n" +
                    "l’expressiu, pedaler, poms dels registres, secret, tubs.",
            "Ja esteu acabant.\n" +
                    "Aneu a obrir el codi que us donarà completarà la\n" +
                    "informació sobre aquest instrument. \n" +
            "Quina és la diferència entre orguener i organista?\n" +
                    "1- No hi ha cap diferència, és el mateix.\n" +
                    "2- L’orguener construeix i l’organista toca.\n" +
                    "3- L’organista construeix i l’orguener toca.\n" +
                    "4- L’orguener toca molt i l’organista no toca gaire.",
            "Heu recordat de comptar els escuts de la ciutat?\n" +
                    "Ara podeu donar la resposta."
    };

    public static String choices[][] = {
            {"A","C","E","B"},
            {"Entre 21 i 40","Entre 41 i 50", "Entre 10 i 20", "Més de 50"},
            {"D","C","A","B"},
            {"Està suspès en una balconada","Està arran de terra","Està en una paret","Està dins de la esglesia"},
            {"Els castells i el campanar", "El campanar i els gegants", "Els calçots i el campanar", "Els calçots i els castells"},
            {"1B, 2C, 3A, 4D", "1C, 2B, 3D, 4A", "1A, 2B, 3C, 4D", "1D, 2C, 3A, 4B"},
            {"barnilles, manuals, secret, tubs", "manxes, tubs, poms de registres", "poms dels registres, tubs, manuals (teclats), pedaler,\n" +
                    "pedal expressiu", "pedaler, poms dels registres, manuals, manxes"},
            {"No hi ha cap diferència, és el mateix", "L’orguenista construeix i l’orguener toca", "L’orguener toca molt i lorganista no toca gaire", "L’orguener construeix i l’organista toca"},
            {"Entre 10 i 20", "Entre 21 i 40", "Entre 41 i 50", "Més de 50"}
    };

    public static String correctAnswers[] = {
            "E",
            "Més de 50",
            "D",
            "Suspès en una balconada",
            "Els castells i el campanar",
            "1B, 2C, 3A, 4D",
            "poms dels registres, tubs, manuals (teclats), pedaler,\n" +
                    "pedal expressiu",
            "L’orguener construeix i l’organista toca",
            "Més de 50"
    };

    public static String imatge[] = {
        "@drawable/orgue_basic",
        "@drawable/escut_valls",
        "@drawable/orgue_basic",
        "@drawable/lloc1",
        "@drawable/lloc2",
        "@drawable/lloc3",
        "@drawable/lloc4",
        "@drawable/lloc5",
        "@drawable/escut_valls"
    };
}
