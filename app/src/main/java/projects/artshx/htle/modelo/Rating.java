package projects.artshx.htle.modelo;

/**
 * Created by ArtShx, artshx@gmail.com on 21/01/2016.
 */
public class Rating
{
    public long id;
    public int value;

    public final int P_DIFF = 50;
    public final int M_DIFF = 100;
    public final int G_DIFF = 200;

    public void update(Rating rating1, Rating rating2)
    {
        //Primeiro parâmetro é o 'vencedor', o segundo é o 'perdedor'
        boolean rating1Maior = (rating1.value - rating2.value) > 0;

        if(rating1Maior)
        {
            //Se o Rating1 for maior que o Rating2
            int diff = Math.abs(rating1.value - rating2.value);
            if (diff <= P_DIFF)
            {
                //Rating1 irá ganhar 50% da diferença
                //Rating2 irá perder 50% da diferença
                rating1.value += diff * .5;
                rating2.value -= diff * .5;
            } else if (diff <= M_DIFF)
            {
                //Rating1 irá ganhar 30% da diferença
                //Rating2 irá perder 70% da diferença
                rating1.value += diff * .3;
                rating2.value -= diff * .7;
            } else if (diff <= G_DIFF)
            {
                //Rating1 irá ganhar 10% da diferença
                //Rating2 irá perder 90% da diferença
                rating1.value += diff * .5;
                rating2.value -= diff * .5;
            }
        }
    }
}
