package Controller;

import Model.Trash;
import Repository.TrashRepository;
import View.Menu;

public class TrashController extends Menu {
    private final TrashRepository trashRepo = new TrashRepository();
    Trash trash = new Trash();
    static String[] options = {
            "Calculate the cost of collecting trash",
            "Exit"
    };
    public TrashController() {
        super("========= TRASH COLLECTION CALCULATING =========", options);
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("Total cost estimated: " + trashRepo.CollectingTrash(trash));
                break;
            }
            case 2: {
                System.exit(0);
            }
        }
    }
}