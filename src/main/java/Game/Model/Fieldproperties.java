package Game.Model;

public class Fieldproperties {
    private int value;
    private int position;
    private int owningStatus;
    private String color;
    private boolean drawCard = false;
    private boolean inPrison = false;


    //owningStatus: 1 = ownable, 2 = owned, 3 = not ownable
    public Fieldproperties(int position){
        this.position = position;
        switch (position){
            case 1:
                this.value = 1;
                this.owningStatus = 1;
                this.color = "Green";
            case 2:
                this.value = 1;
                this.owningStatus = 1;
                this.color = "Green";
            case 3:
                this.owningStatus = 3;
                this.drawCard = true;
            case 4:
                this.value = 1;
                this.owningStatus = 1;
                this.color = "Cyan";
            case 5:
                this.value = 1;
                this.owningStatus = 1;
                this.color = "Cyan";
            case 6:
                this.owningStatus = 3;
            case 7:
                this.value = 2;
                this.owningStatus = 1;
                this.color = "Pink";
            case 8:
                this.value = 2;
                this.owningStatus = 1;
                this.color = "Pink";
            case 9:
                this.owningStatus = 3;
                this.drawCard = true;
            case 10:
                this.value = 2;
                this.owningStatus = 1;
                this.color = "Yellow";
            case 11:
                this.value = 2;
                this.owningStatus = 1;
                this.color = "Yellow";
            case 12:
                this.owningStatus = 3;
            case 13:
                this.value = 3;
                this.owningStatus = 1;
                this.color = "Red";
            case 14:
                this.value = 3;
                this.owningStatus = 1;
                this.color = "Red";
            case 15:
                this.owningStatus = 3;
                this.drawCard = true;
            case 16:
                this.value = 3;
                this.owningStatus = 1;
                this.color = "Yellow";
            case 17:
                this.value = 3;
                this.owningStatus = 1;
                this.color = "Yellow";
            case 18:
                this.owningStatus = 3;
                this.inPrison = true;
            case 19:
                this.value = 4;
                this.owningStatus = 1;
                this.color = "Green";
            case 20:
                this.value = 4;
                this.owningStatus = 1;
                this.color = "Green";
            case 21:
                this.owningStatus = 3;
                this.drawCard = true;
            case 22:
                this.value = 5;
                this.owningStatus = 1;
                this.color = "Blue";
            case 23:
                this.value = 5;
                this.owningStatus = 1;
                this.color = "Blue";
            case 24:
                this.owningStatus = 3;


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
}
