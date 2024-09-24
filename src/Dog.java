public class Dog extends Animal{
    @Override
    void make_sound()
    {
        System.out.println("Dogs bark!");
    }

    @Override
    void move()
    {
        System.out.println("Dogs walk on 4!");
    }

    @Override
    void eat()
    {
        System.out.println("Dogs likes to eat peanut-butter");
    }
}
