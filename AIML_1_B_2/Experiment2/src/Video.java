public class Video {
    private String name;
    private boolean status = false;
    private int rating = 0;


    /// Getter and Setter Methods for the variables
    Video(String name) { // Constructor
        this.setName(name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

