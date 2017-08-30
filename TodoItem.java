public class TodoItem{

    private String name;
    private String itemString;
    private boolean isDone;

    public TodoItem(String name){

        this.name = name;
        this.isDone = false;
        this.itemString = null;

    }

    public String getName(){

        return this.name;

    }

    public void setIsDone(){

        this.isDone = true;

    }

    public boolean getIsDone(){

        return this.isDone;

    }

    public String getString(){

        if (this.isDone == true){
            this.itemString = "[x] ";
            this.itemString.concat(this.name);
        } else if (this.isDone == false){
            this.itemString = "[ ] ";
            this.itemString.concat(this.name);
        }

        return this.itemString;
    }
}
