import java.util.*;
public class SportFörening
{
    private String namn;
    private ArrayList<Medlem> medlemLista;

    public SportFörening(String namn)
    {
        this.namn=namn;
        medlemLista=new ArrayList<Medlem>();
    }

    public void laggtillMedlem(String namn, String telNr, int inAr)
    {
        Medlem medlem=new Medlem(namn,telNr,inAr);
        medlemLista.add(medlem);
    }
    public String toString()
    {
        return "Förening :" + namn + medlemLista.toString();
    }
}

