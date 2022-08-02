/*
Martin Dorobczynski

Lab 7 - generics
 */

public class Triple<A,B,C>
{
    //we do not yet know the types
    A first;
    B second;
    C third;

    //constructor to force user to put in values at instantiation time
    public Triple(A first, B second, C third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst()
    {
        return first;
    }
    public B getSecond()
    {
        return second;
    }
    public C getThird()
    {
        return third;
    }
}
