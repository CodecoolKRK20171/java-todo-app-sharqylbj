import java.util.*;

public class TodoList{

    private List<TodoItem> itemList = new ArrayList<>();

    public TodoList(){

        this.itemList = itemList;

    }

    public void listItems(){

        for (TodoItem item: this.itemList){
            System.out.println(item.getString());
    
        }
    }

    public void markItem(String name){

        for (TodoItem item: this.itemList){
            if(item.getName().equals(name)){
                item.setIsDone();
            }
        }
    }

    public void addItem(String name){

        this.itemList.add(new TodoItem(name));

    }

    public void removeItem(String name){

        for (TodoItem item: this.itemList){
            if (item.getName().equals(name)){
                this.itemList.remove(item);
                
            }
        }
    }
}
