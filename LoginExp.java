
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class LogInFrm extends JFrame
             implements ActionListener
{

    JLabel                     lunm,lpwd,licon;
    JTextField                 tunm;
    JPasswordField             tpwd;
    JButton                    blogin,bquit;
    JPanel                     phold,pbut,con;
    int turn;
    public LogInFrm()
    {
        con   = (JPanel) getContentPane();
        phold =  new JPanel(new GridLayout(2,2));
        pbut  =  new JPanel(new FlowLayout(FlowLayout.RIGHT));

        licon = new JLabel(new ImageIcon(""));
        lunm  = new JLabel("User Name",JLabel.RIGHT);
        tunm  = new JTextField(40);
        lpwd  = new JLabel("Password",JLabel.RIGHT);
        tpwd  = new JPasswordField();
         
        tpwd.setEchoChar('*');

        blogin = new JButton("Login");
        bquit= new JButton("Quit");

        con.add(licon,"West");
        con.add(phold,"Center");
        con.add(pbut,"South");

        phold.add(lunm);
        phold.add(tunm);
        phold.add(lpwd);
        phold.add(tpwd);

        pbut.add(blogin);
        pbut.add(bquit);

        setTitle("Log In Screen ");
        setSize(400,120);
        setVisible(true);

        blogin.addActionListener(this);
        bquit.addActionListener(this);
    }
        /*public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==blogin)
            {
                if(tunm.getText().equals("Admin")&&tpwd.getText().equals("Saikumar"))
                {
                    JOptionPane.showMessageDialog(this,"Your are the correct User","LogIn Result..",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);

                }
                else{
                    turn++;
                    if(turn<3)
                    {
                        JOptionPane.showMessageDialog(this,"Access Denied\n\t May be User Name or Password Spelt Worng \n Or Caps is on ","LogIn Result..",JOptionPane.ERROR_MESSAGE);
            
                
                    }
                    else {
                        JOptionPane.showMessageDialog(this,"Access Denied \n\t Trials thrice over !","login Result..",JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                    }
                }
            }
            else
            System.exit(0);
        }*/

        }
        class LogInExp
        {
            public static void main(String args[])
            {
                LogInFrm lf = new LogInFrm();

            }
        }
