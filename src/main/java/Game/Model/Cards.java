package Game.Model;


public class Cards {

    //  CardPicker cardnumber = new CardPicker();
    private int move;
    private String cardText;
    private boolean hasExtraMoves = false;
    private int money;
    //private int counter = 1;
    // private int card = cardnumber.getInt(counter);

    public Cards() {

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
                //Ryk OP TIL 5 felter frem
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
                //Løslades gratis. behold kortet til det skal bruges.
                break;
            case 11:
                cardText = "Ryk frem til \n Strandpromenaden.";
                //Ryk frem til strandpromenaden
                break;
            case 12:
                //Katten kortet
                break;
            case 13:
                //Hunden kortet
                break;
            case 14:
                cardText = "Det er din fødselsdag! \n Alle giver dig 1 monopoly penge \n TILLYKE MED\n FØDSELSDAGEN";
                //Alle giver dig 1 penge
                break;
            case 15:
                //Gratis pink eller mørkeblåt felt
                break;
            case 16:
                cardText = "Du har lavet\n alle dine lektier!\nMODTAG 2 MONOPOLY PENGE\n fra banken";
                //Modtag 2 penge
                break;
            case 17:
                //Gratis rødt felt
                break;
            case 18:
                //Ryk frem til skaterparken, få det gratis eller betal leje
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
}
