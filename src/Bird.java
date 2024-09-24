public class Bird extends Animal{
    @Override
    void make_sound()
    {
        System.out.println("Birds tweet!");
    }

    @Override
    void move()
    {
        System.out.println("Birds fly!");
    }

    @Override
    void eat()
    {
        System.out.println("Birds likes to eat seeds");
    }
}
