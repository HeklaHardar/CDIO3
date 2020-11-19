package Game.Model;


import Game.View.JuniorGui;

public class Cards {

    private int move;
    private String cardText;
    private boolean hasExtraMoves = false;
    private boolean hasintOptions = false;
    private int money;
    private int max;
    private int min;
    private boolean hasPrisonCard;
    private boolean isBirthday = false;


    public Cards() {

    }

    public void resetStats(){

        hasExtraMoves = false;
        hasintOptions = false;
        money = 0;
        hasPrisonCard = false;
        isBirthday = false;

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
                cardText = "Ryk op til \n 5 felter frem.\n Indtast antal felter du vil rykke frem, 1 til 5:";

                hasintOptions = true;
                break;
            case 4:
                //Ryk frem til et orange felt, få det gratis, eller betal husleje hvis det allerede ejes
                break;
            case 5:
                //Ryk 1 felt frem, eller tag et chancekort mere.
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
                break;
            case 9:
                //Gratis lyseblåt felt
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
                break;
            case 16:
                cardText = "Du har lavet\n alle dine lektier!\nMODTAG 2 MONOPOLY PENGE\n fra banken";
                money = 2;
                break;
            case 17:
                //Gratis rødt felt
                break;
            case 18:
                cardText = "GRATIS FELT! \n Ryk frem til skaterparken\n for at lave det perfekte grind! \nHvis ingen ejer den \n får du den GRATIS! \n Ellers skal du BETALE \n leje til ejeren.";
                hasExtraMoves = true;
                move = 700;
                break;
            case 19:
                //gratis lyseblåt eller rødt
                break;
            case 20:
                //gratis brunt eller gult
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
}
