import java.awt.*;
import javax.swing.*;

class JSplitPaneFrm extends JFrame
{
    JSplitPane  jps;
    JLabel     licon1,licon2;
    JPanel      con;

    public JSplitPaneFrm()
    {
        licon1 = new JLabel(new ImageIcon("1000014116.jpg"));
        licon2 = new JLabel(new ImageIcon("1000014116.jpg"));  

        con = (JPanel)getContentPane();
        con.setLayout(new BorderLayout());

        jps = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        jps.setLeftComponent(new JScrollPane(licon1));               
        
        jps.setRightComponent(new JScrollPane(licon2));  

        jps.setDividerLocation(200);

        con.add(jps);

        setTitle("Testing Split");
        setSize(500,500);

    }
}
class JSplitPaneFrmExp
{
    public static void main(String args[])
    {
        JSplitPaneFrm f = new JSplitPaneFrm();
        f.show();
    }
}