public class Dog {
    String name;
    double speed;
    double height;

    public void bark(){
        System.out.println("гав-гав");
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{"  + name + '}';
    }
}

class HuntingDog extends Dog{
    public HuntingDog(String name) {
        super(name);
    }

    public void smell(){
        System.out.println(this+" идет по следу");
        bark();
    }
}

class Hound extends HuntingDog{
    public Hound(String name) {
        super(name);
    }

    public void runForPrey(String prey){
        System.out.println(this +" преследует "+prey);
        bark();
    }

}

class Taksa extends HuntingDog{
    public Taksa(String name) {
        super(name);
    }

    public void borrow(){
        System.out.println(this+" разрывает нору");
    }


}
