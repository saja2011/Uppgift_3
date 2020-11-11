import javax.swing.*;
public class TestClass
{

    public static void main(String args[])
    {

        Medlem[] medlemarray=new Medlem[2];
        boolean lyckades=false;
       String namn=JOptionPane.showInputDialog("Ange namnet");
       String telNr=JOptionPane.showInputDialog("Ange telNr");
       while(!lyckades)
       {

           try {
               String str = JOptionPane.showInputDialog("Ange InbetalningsÅr");
               int inAr = Integer.parseInt(str);
               lyckades=true;
               Medlem m1 = new Medlem(namn, telNr, inAr);
               System.out.println(m1);

           } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "Du måste mata in ett heltal");
           } catch (Exception ex) {
               JOptionPane.showInternalMessageDialog(null, ex.getMessage());
           } finally {
               JOptionPane.showMessageDialog(null, "Finally block");
           }
       }

    }

}

