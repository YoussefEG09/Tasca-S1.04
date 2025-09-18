public class Book {
    private String name;


    public Book(String name){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("The name's book is not valid.");
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
