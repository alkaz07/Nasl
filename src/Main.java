public class Main {
    public static void main(String[] args) {
        A objA = new A("aaaaaaa");
        B objB = new B("bbbbbbbb", 10);

        System.out.println(objA);
        System.out.println(objB);

        objA.sayA();
        objB.sayA();
        objB.sayB();

        dogsExemple();
    }

    public static void dogsExemple() {
        Dog[] dogs = {
                new Taksa("Патрик"),
                new Hound("Шон"),
                new Dog("Стюарт")
        };
        for (Dog d : dogs) {
            d.bark();
        }

        for (Dog d : dogs) {
            if (d instanceof HuntingDog) {
                HuntingDog hd = (HuntingDog) d;
                hd.smell();
            }
            else
                System.out.println("эта собака не охотничья");
        }

        Hound h = new Hound("Хвать");

        h.runForPrey("заяц");

    }
}

class A {
    String a;

    public void sayA() {
        System.out.println("a = " + a);
    }

    public A() {
    }

    public A(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                '}';
    }
}

class B extends A {
    int b;

    public B(String a, int b) {
        super(a);   //вызов конструктора родительского класса
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                ", a='" + a + '\'' +
                '}';
    }

    public void sayB() {
        System.out.println("b = " + b);
    }
}