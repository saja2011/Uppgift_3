public class Medlem extends Person
{
    private int inAr;//Inbetalningsår

    public Medlem(String namn,String telNr, int inAr)
    {
        super(namn,telNr); // Anropar superklassens konstruktor
         this.inAr=inAr;
    }

    public int getinAr()
    {
        return inAr;
    }
    public void setinAr(int inAr)
    {
        this.inAr=inAr;
    }
    public String toString()
    {
        return super.toString() + " Inbetalningsår: " +inAr ;
    }

}
