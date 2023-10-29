package Repository;

import Controller.TrashController;
import Model.Trash;

public class TrashRepository {
    private int time = 0;
    private int totalWaste = 0;
    private int numOfTrucks = 0;
    static final int truckCapacity = 10_000;
    static final int costPerTruck = 57_000;
    static final int costPerHour = 120_000;
    public TrashRepository(){
    }

    public double CollectingTrash(Trash tc) {
        int[] TrashNumber;
        TrashNumber = tc.getTrashNumber();
        for (int j : TrashNumber) {
            if (totalWaste + j <= truckCapacity) {
                totalWaste += j;
                time += 8;
            } else {
                totalWaste = j;
                time += 38;
                numOfTrucks++;
            }
        }
        if (totalWaste > 0) numOfTrucks ++;
        time += 30;
        System.out.println("Time: " + time);
        System.out.println("Trucks: " + numOfTrucks);
        return numOfTrucks * costPerTruck + (double) (time * costPerHour) / 60;
    }
}