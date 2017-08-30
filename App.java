import java.util.*;

public class App{

    private static App app = new App();
    private static TodoList itemList = new TodoList();
    private static String option, name;
    private static Boolean isWorking = true;

    public static void main(String[] args) {

        while(isWorking){

            UI.getMenu();
            option = UI.getInput("Choose an option:");

            if (option.equals("1")){
                app.addItem();
            } else if (option.equals("2")){
                app.removeItem();
            } else if (option.equals("3")){
                app.setDone();
            } else if (option.equals("4")){
                app.listAllItems();
            } else if (option.equals("0")){
                isWorking = false;
            }
        }

        System.exit(0);

    }

    private void addItem(){
        
        this.itemList = itemList;
        name = UI.getInput("What activity would you like to add? (enter name)");
        this.itemList.addItem(name);

    }

    private void removeItem(){

        app.listAllItems();
        name = UI.getInput("What activity would you like to remove? (enter name)");
        this.itemList.removeItem(name);
    }

    private void setDone(){

        app.listAllItems();
        name = UI.getInput("What activity had been done? (enter name)");
        this.itemList.markItem(name);
    }

    private void listAllItems(){

        this.itemList.listItems();

    }
}
