package com.example.colleenminor.todolist.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by colleenminor on 10/25/15.
 */
@Table(name = "tasks", id="_id")
public class Task extends Model {

    @Column( name = "description")
    private String mDescription;

    @Column( name = "category" )
    private Category mCategory;

    public Task() {
        //Tells java to look in the model
        // class and use the code that's
        // written there when this class
        //constructor is invoked.
        super();
    }

    public Task(String description, Category category) {
        super();
        mDescription = description;
        mCategory = category;
    }

    //Ctrl + enter to automatically generate
    // getters and setters


    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public static List<Task> all() {
        return new Select().from(Task.class).execute();
    }
}
