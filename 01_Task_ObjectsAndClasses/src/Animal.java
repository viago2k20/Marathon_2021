public abstract class Animal {
    private String name;

    public Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }


    //животное умеет бегать
    public abstract void run(int num);
    public abstract void swim(int num);


}
