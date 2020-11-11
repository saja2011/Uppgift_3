public class Person {
    protected String namn;
    protected String telNr;
    public Person(String namn, String telNr)
    {
        this.namn=namn;
        this.telNr=telNr;
    }
    public String getTelNr()
    {
        return telNr;
    }

    public void setTelNr(String telNr)
    {
        this.telNr=telNr;
    }
    public String getNamn()
    {
        return namn;
    }
    public void setNamn(String namn)
    {
        this.namn=namn;
    }

    public String toString()
    {
        return "Namn: " + namn + " telefon  "+ telNr;
    }






















}


