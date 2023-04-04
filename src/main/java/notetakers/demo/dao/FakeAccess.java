package notetakers.demo.dao;

import notetakers.demo.model.Task;

import java.util.ArrayList;
import java.util.List;

public class FakeAccess implements TaskDao{
    private static List<Task> DB = new ArrayList<>();
    
    public int insertTask(String title, String description, int id) {
      // initialize a new Task
      // add that to the arrayList
      
      private Task task = new Task(title, description, id);
      DB.add(task);
    }
}
