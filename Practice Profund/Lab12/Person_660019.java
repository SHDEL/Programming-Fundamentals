class Person {
    String name;
    int saving;
    Person(String n, int amount) {
        name = n;
        saving = amount;
    }
    void introduce_self(){
        System.out.println("Hi, My name is " + name);
    }
    boolean isWeather(Person p){
        return true;
    }
    @Override
    public boolean equals(Object theOther) {
        if (this == theOther)
            return true;
        if (theOther == null)
            return false;
        if (getClass() != theOther.getClass())
            return false;
        Person other = (Person) theOther;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (saving != other.saving)
            return false;
        return true;
    }
    int reward(Person p, int amount){
        this.saving -= amount;
        p.saving += amount;
        return this.saving;
    }
    @Override
    public String toString(){
        return "I am " + name + ". My savings amount is " + saving;
    }
}