
package info.davidwoodruff.dockerexamples.todos.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Todo object representation
 */
@XmlRootElement(name = "todo")
public class Todo {

    private int id;
    private String name;
    private String description;
    private int finished;

    /**
     * No-argument constructor for JAXB
     */
    public Todo() {  }

    /**
     * Constructor for an existing Todo where the id is known
     */
    public Todo(int id, String name, String description, int finished) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.finished = finished;
    }

    /**
     * Return the Todo's ID field
     */
    @XmlElement
    public int getId() {
        return id;
    }

    /**
     * Set the Todo's ID field
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Return the Todo's Name field
     */
    @XmlElement
    public String getName() {
        return name;
    }

    /**
     * Set the Todo's Name field
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the Todo's Description field
     */
    @XmlElement
    public String getDescription() {
        return description;
    }

    /**
     * Set the Todo's Description field
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Return the Todo's Finished field
     */
    @XmlElement
    public int getFinished() {
        return finished;
    }

    /**
     * Set the Todo's Finished field
     */
    public void setFinished(int finished) {
        this.finished = finished;
    }

    public String toString() {
        return new StringBuffer(" ID=").append(this.id)
                .append(" Name=").append(this.name)
                .append(" Description=").append(this.description)
                .append(" Finished=" ).append(this.finished).toString();
    }

}
