package notetakers.demo.model;


public class Task {
    private String title;
    private String description;
    private final int id;
    
    public Task(String title, String description, int id){
        this.title = title;
        this.description = description;
        this.id = id;
    }
    public void updateTask(String title, String description){
        this.title = title;
        this.description = description;
    }
    // getTitle and getDescription
    public String getTitle() {
      return this.title;
    }
    public String getDescription() {
      return this.description;
    }
    public int getId() {
      return this.id;
    }
}
