/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingobject;

class printer
{
    public void printing(paper x)
    {
        x.setText("Hi I am Tapas Haldar");
    }
}
class paper
{
    String text;
    public void setText(String t)
    {
        text=t;
    }
    public String getText()
    {
        return text;
    }
}
public class PassingObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        paper p=new paper();
        p.setText("Hello");
        System.out.println(p.getText());
        printer a=new printer();
        a.printing(p);
        System.out.println(p.getText());
    }
    
}
