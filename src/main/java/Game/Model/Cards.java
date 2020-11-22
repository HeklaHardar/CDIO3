package Game.Model;


import Game.View.JuniorGui;

public class Cards {

    private int move;
    private String cardText;
    private boolean hasExtraMoves = false;
    private boolean hasintOptions = false;
    private int money;
    private String[] fiveMoves = {"1","2","3","4","5"};
    private int max;
    private int min;
    private boolean hasPrisonCard;
    private boolean isBirthday = false;
    private boolean hasStringOptions = false;
    private boolean has4StringOptions = false;
    private String[] possibleFields = new String[2];
    private String[] possibleFields2 = new String[4];
    private boolean moveOrCard = false;
    private boolean freeField = false;

    public Cards() {

    }

    public void resetStats(){

        hasExtraMoves = false;
        hasintOptions = false;
        money = 0;
        hasPrisonCard = false;
        isBirthday = false;
        hasStringOptions = false;
        has4StringOptions = false;
        moveOrCard = false;

    }

    public void resetfreeField(){
        freeField = false;
    }


    public void CardPick(int card) {

        switch (card) {
            case 1:
                //Giv dette kort til bilen og tag et chancekort mere
                //bilen går frem til de næste ledige felt og køber det.
                //Hvis ingen felter er ledige købes fra en anden spiller
                break;
            case 2:
                cardText = "Ryk frem til start!";
                move = 900;
                hasExtraMoves = true;
                //Ryk frem til start
                break;
            case 3:
                cardText = "Ryk op til \n 5 felter frem.\n Indtast antal felter du vil rykke, 1 til 5: ";
                max = 5;
                min = 1;
                hasintOptions = true;
                break;
            case 4:
                //Ryk frem til et orange felt, få det gratis, eller betal husleje hvis det allerede ejes
                cardText = "GRATIS FELT! \n ryk frem til et orange felt.\n Hvis det er ledigt, får du det GRATIS!\n Ellers skal du betale leje til ejeren.";
                possibleFields[0] = "Skaterparken";
                possibleFields[1] = "Swimmingpoolen";
                hasStringOptions = true;
                freeField = true;
                break;
            case 5:
                //Ryk 1 felt frem, eller tag et chancekort mere.
                cardText = "Ryk 1 \n felt frem, eller\n tag et \n chancekort mere.";
                move = 1;

                moveOrCard = true;
                break;
            case 6:
                //Samme som case 1 men for skibet
                break;
            case 7:
                cardText = "Du har spist for meget slik! \n Betal 2 monopoly penge til banken";
                money = -2;
                //Betal 2 penge til banken
                break;
            case 8:
                //Samme som case 4 men med orange eller grøn
                cardText = "GRATIS FELT! \n ryk frem til et orange eller grøn felt.\n Hvis det er ledigt, får du det GRATIS!\n Ellers skal du betale leje til ejeren.";

                possibleFields2[0] = "Skaterparken";
                possibleFields2[1] = "Swimmingpoolen";
                possibleFields2[2] = "Bowlinghallen";
                possibleFields2[3] = "Zoo";
                has4StringOptions = true;
                freeField = true;
                break;
            case 9:
                //Gratis lyseblåt felt
                cardText = "GRATIS FELT! \n ryk frem til et lyseblåt felt.\n Hvis det er ledigt, får du det GRATIS!\n Ellers skal du betale leje til ejeren.";
                possibleFields[0] = "Slikbuttiken";
                possibleFields[1] = "Iskiosken";
                hasStringOptions = true;
                freeField = true;
                break;
            case 10:
                cardText = "Du løslades uden omkostninger. \n Behold dette kort, indtil du får brug for det.";
                hasPrisonCard = true;
                //Løslades gratis. behold kortet til det skal bruges.
                break;
            case 11:
                cardText = "Ryk frem til \n Strandpromenaden.";
                move = 800;
                hasExtraMoves = true;
                break;
            case 12:
                //Katten kortet
                break;
            case 13:
                //Hunden kortet
                break;
            case 14:
                cardText = "Det er din fødselsdag! \n Alle giver dig 1 monopoly penge \n TILLYKE MED\n FØDSELSDAGEN";
                isBirthday = true;
                break;
            case 15:
                //Gratis pink eller mørkeblåt felt
                cardText = "GRATIS FELT! \n ryk frem til et pink eller mørkeblåt felt.\n Hvis det er ledigt, får du det GRATIS!\n Ellers skal du betale leje til ejeren.";

                possibleFields2[0] = "Museet";
                possibleFields2[1] = "Biblioteket";
                possibleFields2[2] = "Vandlandet";
                possibleFields2[3] = "Strandpromenaden";
                has4StringOptions = true;
                freeField = true;

                break;
            case 16:
                cardText = "Du har lavet\n alle dine lektier!\nMODTAG 2 MONOPOLY PENGE\n fra banken";
                money = 2;
                break;
            case 17:
                //Gratis rødt felt
                cardText = "GRATIS FELT! \n ryk frem til et rødt felt.\n Hvis det er ledigt, får du det GRATIS!\n Ellers skal du betale leje til ejeren.";
                possibleFields[0] = "Spillehallen";
                possibleFields[1] = "Biografen";
                freeField = true;
                hasStringOptions = true;
                break;
            case 18:
                cardText = "GRATIS FELT! \n Ryk frem til skaterparken\n for at lave det perfekte grind! \nHvis ingen ejer den \n får du den GRATIS! \n Ellers skal du BETALE \n leje til ejeren.";
                hasExtraMoves = true;
                freeField = true;
                move = 700;
                break;
            case 19:
                //gratis lyseblåt eller rødt
                cardText = "GRATIS FELT! \n ryk frem til et lyseblåt eller rødt felt.\n Hvis det er ledigt, får du det GRATIS!\n Ellers skal du betale leje til ejeren.";

                possibleFields2[0] = "Slikbuttiken";
                possibleFields2[1] = "Iskiosken";
                possibleFields2[2] = "Spillehallen";
                possibleFields2[3] = "Biografen";
                freeField = true;
                has4StringOptions = true;
                break;
            case 20:
                //gratis brunt eller gult
                cardText = "GRATIS FELT! \n ryk frem til et brunt eller gult felt.\n Hvis det er ledigt, får du det GRATIS!\n Ellers skal du betale leje til ejeren.";

                possibleFields2[1] = "Pizzariaet";
                possibleFields2[0] = "Burgerbaren";
                possibleFields2[2] = "Legetøjsbutikken";
                possibleFields2[3] = "Dyrehandlen";
                freeField = true;
                has4StringOptions = true;
                break;
        }
    }

    public int extraFields() {
        return move;
    }
    public String cardToString() {

        return cardText;

    }
    public boolean booleanToString(){

        return hasExtraMoves;

    }
    public int extraMoney(){
        return money;
    }
    public boolean isHasintOptions(){
        return hasintOptions;
    }
    public int max(){
        return max;
    }
    public int min(){
        return min;
    }
    public boolean isHasPrisonCard() {
        return hasPrisonCard;
    }
    public boolean isHasBirthday(){
        return isBirthday;
    }
    public String[] getFiveMoves(){
        return fiveMoves;
    }
    public String[] getPossibleFields(){
        if(hasStringOptions)
            return possibleFields;
        else
            return possibleFields2;
    }
    public boolean isHasStringOptions(){
        if(hasStringOptions)
            return hasStringOptions;
        else
            return has4StringOptions;
    }
    public boolean isMoveOrCard(){
        return moveOrCard;
    }
    public boolean isFreeField(){return freeField;}

}
