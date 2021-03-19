package Data;

public class Ingredient {


    public int id;
    public String uniqueingredient;



    public Ingredient(int id, String uniqueingredient) {
        this.id = id;
        this.uniqueingredient = uniqueingredient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniqueingredient() {
        return uniqueingredient;
    }

    public void setUniqueingredient(String uniqueingredient) {
        this.uniqueingredient = uniqueingredient;
    }
}
