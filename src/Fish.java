public class Fish extends Animal{
    @Override
    void make_sound()
    {
        System.out.println("Fish blop!");
    }

    @Override
    void move()
    {
        System.out.println("Fish swim!");
        System.out.println("Fish cant be on land 0o0");
    }

    @Override
    void eat()
    {
        System.out.println("Fish likes to eat plants");
    }
}
