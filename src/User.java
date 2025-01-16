public class User {
    String name;
    int age;
    String email;

    public User(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Name: "+name+", Age: "+age+", Email: "+email;
    }
}
