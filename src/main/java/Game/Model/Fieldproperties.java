package Game.Model;

public class Fieldproperties {
    private int value;
    private int position;
    private int owningStatus = 1;
    private int[] ownedFields = new int[24];
    private boolean setOwnedStatus = false;
    private String color;
    private boolean drawCard = false;
    private boolean inPrison = false;


    //owningStatus: 1 = ownable, 2 = owned, 3 = not ownable
    public void Fieldproperties(int position){
        this.position = position;
        switch (position){
            case 1:
            case 2:
                setOwnedStatus = true;
                this.value = 1;
                this.owningStatus = 1;
                this.color = "Green";

                break;
            case 3:
            case 9:
            case 15:
            case 21:
                this.owningStatus = 3;
                this.drawCard = true;
                break;
            case 4:
            case 5:
                setOwnedStatus = true;
                this.value = 1;
                this.owningStatus = 1;
                this.color = "Cyan";
                break;
            case 6:
            case 12:
            case 0:
                this.owningStatus = 3;
                break;
            case 7:
            case 8:
                setOwnedStatus = true;
                this.value = 2;
                this.owningStatus = 1;
                this.color = "Pink";
                break;
            case 10:
            case 11:
                setOwnedStatus = true;
                this.value = 2;
                this.owningStatus = 1;
                this.color = "Yellow";
                break;
            case 13:
            case 14:
                setOwnedStatus = true;
                this.value = 3;
                this.owningStatus = 1;
                this.color = "Red";
                break;
            case 16:
            case 17:
                setOwnedStatus = true;
                this.value = 3;
                this.owningStatus = 1;
                this.color = "Yellow";
                break;
            case 18:
                this.owningStatus = 3;
                this.inPrison = true;
                break;
            case 19:
            case 20:
                setOwnedStatus = true;
                this.value = 4;
                this.owningStatus = 1;
                this.color = "Green";
                break;
            case 22:
            case 23:
                setOwnedStatus = true;
                this.value = 5;
                this.owningStatus = 1;
                this.color = "Blue";
                break;


        }



    }
    public int getValue() {
        return value;
    }

    public int getOwningStatus() {
        return owningStatus;
    }

    public String getColor() {
        return color;
    }

    public boolean isDrawCard() {
        return drawCard;
    }

    public boolean isInPrison() {
        return inPrison;
    }

    public int[] getOwnedFields() {
        return ownedFields;
    }

    public void setOwnedFields(int[] ownedFields, int position, int player) {
        this.ownedFields[position] = player+1;
    }

    public boolean isSetOwnedStatus() {
        return setOwnedStatus;
    }
}
