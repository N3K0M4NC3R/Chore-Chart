package io.github.ryanarland.autochart;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 * Meeple is a cutesy little test object to ensure that your database is setup!
 * //TODO: Remember to add your own password to application.properties!
 * 
 */
public class Task {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, assignee, description;
    private Boolean isComplete, reset;
    private Date dueDate;

    //name
    public Task(String name, String assignee, String description, Boolean reset, Date dueDate,  Boolean isComplete) {
        this.name = name;
        this.assignee = assignee;
        this.description = description;
        this.reset = reset;
        this.dueDate = dueDate;
        this.isComplete = isComplete;

    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //assignee
    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    //description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //reset
    public Boolean getReset() {
        return reset;
    }

    public void setReset(Boolean reset) {
        this.reset = reset;
    }

    //dueDate
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    //isComplete
    public Boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
    }

    //id
    public Long getID() {
        return id;
    }
    
    public void setID(Long id) {
        this.id = id;
    }
    
}