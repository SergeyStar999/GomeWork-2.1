public class Human {
    int yearOfBirth;
    String name;
    String town;

    Human(String name, String town, int yearOfBirth){
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
    }

    void message(){
        System.out.println("Привет! Меня зовут " + name + "." + " Я из города " + town + "." + " Я родился в " + yearOfBirth + " году. Будем знакомы!");
    }
}
