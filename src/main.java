/*
Martin Dorobczynski

Lab 7 - generics
 */

public class Main
{
    public static void main(String[] args)
    {

        /*
        5 instances and each contains
        1) Team name - String
        2) Wins - int
        3) Losses - int
        */

        //Array of generic types, 5 in length
        Triple<String, Integer, Integer>[] aoTriple;
        aoTriple = new Triple[5];

        //filling the Array with
        aoTriple[0] = new Triple< String, Integer, Integer>("A Team", 10, 0);
        aoTriple[1] = new Triple< String, Integer, Integer>("B Team", 9, 1);
        aoTriple[2] = new Triple< String, Integer, Integer>("C Team", 8, 2);
        aoTriple[3] = new Triple< String, Integer, Integer>("D Team", 7, 3);
        aoTriple[4] = new Triple< String, Integer, Integer>("F Team", 5, 5);


        //Array of Pair type, also 5 in length
        Pair<String, Double>[] aoPair;
        aoPair = new Pair[5];

        //attribute to store the team with the highest win percentage
        Pair<String, Double> high = null;

        //Loop through the Triple array
        for (int i = 0; i < aoTriple.length; i++)
        {
            //calculate win percentage
            //Dividing wins by total games
            //stored as a decimal
            double dWinPercent = (double) aoTriple[i].getSecond() / (aoTriple[i]
                    .getSecond() + aoTriple[i].getThird());

            //pair object created to display
            Pair<String, Double> oP = new Pair<String,Double>(aoTriple[i]
                    .getFirst(), dWinPercent);

            //Win ratio added to the Array Pair
            aoPair[i] = oP;

            //Updating highest win percentage
            //storing in attribute "high"
            if(high == null || high.getSecond() < dWinPercent)
            {
                high = oP;
            }

        }

        //Loop through the Pair array
        //print out the values of each object
        for(Pair<String, Double> oP : aoPair)
        {
            System.out.println(oP.getFirst() + " has winning percentage of " + oP.getSecond());
        }

        //Print out statement to display the best team
        System.out.println();
        System.out.println("Finest team with highest win percent: the " + high.getFirst());

    }

}
