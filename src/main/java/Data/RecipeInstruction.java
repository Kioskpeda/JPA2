package Data;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

public class RecipeInstruction {

    public String id;
    @Id
    @GeneratedValue(generator = "instructions")
    @GenericGenerator(name = "hibernate-uuid", strategy = "hibernate-uuid")
    @Column(name = "uuid", unique = true)
    public String instructions;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public RecipeInstruction(String id, String instructions) {
        this.id = id;
        this.instructions = instructions;
    }

}
