package Model;
import Common.Validation;

public class Trash {
    Validation valid = new Validation();
    private int[] trashNumber;
    private int stationNumber;

    public Trash() {
        this.stationNumber = valid.checkInputInt("Please enter the number of trash collecting station: ", 0);
        this.trashNumber = valid.checkInputArray("Please enter the number of trash at station: ", stationNumber);
    }

    public int[] getTrashNumber() {
        return trashNumber;
    }

    public void setTrashNumber(int[] trashNumber) {
        this.trashNumber = trashNumber;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }
}
