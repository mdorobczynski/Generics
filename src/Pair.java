/*
Martin Dorobczynski

Lab 7 - generics
 */

//creating generic class
public class Pair<A,B>
{
    //we do not yet know the types
    A first;
    B second;

    //constructor to force user to put in values at instantiation time
    public Pair(A a, B b)
    {
        first = a;
        second = b;
    }
    public A getFirst()
    {
        return first;
    }
    public B getSecond()
    {
        return second;
    }
}
