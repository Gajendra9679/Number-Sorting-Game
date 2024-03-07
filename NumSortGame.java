import java.awt.*;
import java.awt.event.*;
import javax.swing.event.MouseInputAdapter ;

public class NumSortGame extends Frame
{
    TextField st1[] = new TextField[4];
    TextField st2[] = new TextField[4];
    TextField st3[] = new TextField[4];
    TextField st4[] = new TextField[4];
    TextField st5[] = new TextField[4]; 
    TextField tf1 = new TextField();
    Button btn1,btn2,btn3,btn4,btn5;
    Button reset,newgame;
    Label vir;

    int st1height = 420;
    int st2height = 420;
    int st3height = 420;
    int st4height = 420;
    int st5height = 420;
    Font f1 = new Font("Arial" , Font.BOLD , 28);
    Font f2 = new Font("Arial" , Font.BOLD , 23);
    Font f3 = new Font("Arial" , Font.BOLD , 32);
    Font f4 = new Font("Arial" , Font.BOLD , 32);

    public NumSortGame()
    {
        setLayout(null);
        setBackground(new Color(72,201,176));

        Label lb1 = new Label("-------||  WELCOME  TO  NUMBER  SORTING  PUZZEL  GAME  ||-------");
        lb1.setBounds(90,100,1500,40);
        lb1.setForeground(new Color(21,67,96));
        lb1.setFont(f4);
        add(lb1);

        Label lb = new Label("Selected Color :- ");
        lb.setBounds(350,200,220,40);
        lb.setForeground(new Color(48,25,52));
        lb.setFont(f1);
        add(lb);

        tf1 = new TextField(15);
        tf1.setBounds(620,200,200,40);
        tf1.setBackground(new Color(255,228,196));
        tf1.setFont(f2);
        tf1.setEditable(false);
        add(tf1);

        reset=new Button("Reset");
        newgame=new Button("Close");
        add(reset);
        add(newgame);
	reset.setBounds(450,600,100,30);
	newgame.setBounds(650,600,100,30);
	newgame.setBackground(new Color(245,183,177));
	reset.setBackground(new Color(245,183,177));
    newgame.setForeground(new Color(139,0,0));
	reset.setForeground(new Color(139,0,0));
	Font f=new Font("Arial",Font.BOLD,20);
	reset.setFont(f);
	newgame.setFont(f);

        reset.addMouseListener(new ResetAndNewGame());
        newgame.addMouseListener(new ResetAndNewGame());

        

        for(int i = 0 ; i < 4; i++)
        {
            st1[i] = new TextField(12);
            st1[i].setBounds(150,st1height,150,40);
            st1[i].setFont(f2);
            st1[i].setEditable(false);
            add(st1[i]);
            st1height = st1height - 40;
        }

        btn1 = new  Button("Stack 1");
        btn1.setBounds(165,500,120,40);
        btn1.setBackground(new Color(255,228,196));
        btn1.setFont(f2);
        add(btn1);

        st1[0].setText("1111");
        st1[0].setBackground(new Color(108,52,131));
        st1[1].setText("2222");
        st1[1].setBackground(new Color(142,68,173));
        st1[2].setText("3333");
        st1[2].setBackground(new Color(165,105,189));
        st1[3].setText("4444");
        st1[3].setBackground(new Color(187,143,206));


        for(int i = 0 ; i < 4; i++)
        {
            st2[i] = new TextField(12);
            st2[i].setBounds(340,st2height,150,40);
            st2[i].setFont(f2);
            st2[i].setEditable(false);
            add(st2[i]);
            st2height = st2height - 40;
        }

        btn2 = new  Button("Stack 2");
        btn2.setBounds(355,500,120,40);
        btn2.setBackground(new Color(255,228,196));
        btn2.setFont(f2);
        add(btn2);

        st2[0].setText("3333");
        st2[0].setBackground(new Color(183,149,11));
        st2[1].setText("1111");
        st2[1].setBackground(new Color(241,196,15));
        st2[2].setText("4444");
        st2[2].setBackground(new Color(244,208,63));
        st2[3].setText("2222");
        st2[3].setBackground(new Color(247,220,111));


        for(int i = 0 ; i < 4; i++)
        {
            st3[i] = new TextField(12);
            st3[i].setBounds(530,st3height,150,40);
            st3[i].setFont(f2);
            st3[i].setEditable(false);
            add(st3[i]);
            st3height = st3height - 40;
        }

        btn3 = new  Button("Stack 3");
        btn3.setBounds(545,500,120,40);
        btn3.setBackground(new Color(255,228,196));
        btn3.setFont(f2);
        add(btn3);

        st3[0].setText("2222");
        st3[0].setBackground(new Color(176,58,46));
        st3[1].setText("4444");
        st3[1].setBackground(new Color(231,76,60));
        st3[2].setText("3333");
        st3[2].setBackground(new Color(236,112,99));
        st3[3].setText("1111");
        st3[3].setBackground(new Color(241,148,138));


        for(int i = 0 ; i < 4; i++)
        {
            st4[i] = new TextField(12);
            st4[i].setBounds(720,st4height,150,40);
            st4[i].setFont(f2);
            st4[i].setEditable(false);
            add(st4[i]);
            st4height = st4height - 40;
        }

        btn4 = new  Button("Stack 4");
        btn4.setBounds(735,500,120,40);
        btn4.setBackground(new Color(255,228,196));
        btn4.setFont(f2);
        add(btn4);

        st4[0].setText("4444");
        st4[0].setBackground(new Color(136,14,79));
        st4[1].setText("1111");
        st4[1].setBackground(new Color(173,20,87));
        st4[2].setText("3333");
        st4[2].setBackground(new Color(236,64,122));
        st4[3].setText("2222");
        st4[3].setBackground(new Color(240,98,146));

        for(int i = 0 ; i < 4; i++)
        {
            st5[i] = new TextField(12);
            st5[i].setBounds(910,st5height,150,40);
            st5[i].setBackground(new Color(154,205,50));
            st5[i].setFont(f2);
            st5[i].setEditable(false);
            add(st5[i]);
            st5height = st5height - 40;
        }
        
        btn5 = new  Button("Stack 5");
        btn5.setBounds(925,500,120,40);
        btn5.setBackground(new Color(255,228,196));
        btn5.setFont(f2);
        add(btn5);

        vir = new Label("");
        vir.setBounds(320,700,600,40);
        vir.setForeground(new Color(128,0,0));
        vir.setFont(f3);
        add(vir);

        btn1.addActionListener(new Stack1());
        btn2.addActionListener(new Stack2());
        btn3.addActionListener(new Stack3());
        btn4.addActionListener(new Stack4());
        btn5.addActionListener(new Stack5());
    }

    public void checkWinner()
    {
        if((st1[0].getText().equals("1111") && st1[1].getText().equals("1111") && st1[2].getText().equals("1111") && st1[3].getText().equals("1111")) || (st1[0].getText().equals("2222") && st1[1].getText().equals("2222") && st1[2].getText().equals("2222") && st1[3].getText().equals("2222")) || (st1[0].getText().equals("3333") && st1[1].getText().equals("3333") && st1[2].getText().equals("3333") && st1[3].getText().equals("3333")) || (st1[0].getText().equals("4444") && st1[1].getText().equals("4444") && st1[2].getText().equals("4444") && st1[3].getText().equals("4444")) || (st1[0].getText().equals("") && st1[1].getText().equals("") && st1[2].getText().equals("") && st1[3].getText().equals("")))  
        {
            if((st2[0].getText().equals("1111") && st2[1].getText().equals("1111") && st2[2].getText().equals("1111") && st2[3].getText().equals("1111")) || (st2[0].getText().equals("2222") && st2[1].getText().equals("2222") && st2[2].getText().equals("2222") && st2[3].getText().equals("2222")) || (st2[0].getText().equals("3333") && st2[1].getText().equals("3333") && st2[2].getText().equals("3333") && st2[3].getText().equals("3333")) || (st2[0].getText().equals("4444") && st2[1].getText().equals("4444") && st2[2].getText().equals("4444") && st2[3].getText().equals("4444"))|| (st2[0].getText().equals("") && st2[1].getText().equals("") && st2[2].getText().equals("") && st2[3].getText().equals("")))  
            {
                if((st3[0].getText().equals("1111") && st3[1].getText().equals("1111") && st3[2].getText().equals("1111") && st3[3].getText().equals("1111")) || (st3[0].getText().equals("2222") && st3[1].getText().equals("2222") && st3[2].getText().equals("2222") && st3[3].getText().equals("2222")) || (st3[0].getText().equals("3333") && st3[1].getText().equals("3333") && st3[2].getText().equals("3333") && st3[3].getText().equals("3333")) || (st3[0].getText().equals("4444") && st3[1].getText().equals("4444") && st3[2].getText().equals("4444") && st3[3].getText().equals("4444"))|| (st3[0].getText().equals("") && st3[1].getText().equals("") && st3[2].getText().equals("") && st3[3].getText().equals("")))  
                {
                    if((st4[0].getText().equals("1111") && st4[1].getText().equals("1111") && st4[2].getText().equals("1111") && st4[3].getText().equals("1111")) || (st4[0].getText().equals("2222") && st4[1].getText().equals("2222") && st4[2].getText().equals("2222") && st4[3].getText().equals("2222")) || (st4[0].getText().equals("3333") && st4[1].getText().equals("3333") && st4[2].getText().equals("3333") && st4[3].getText().equals("3333")) || (st4[0].getText().equals("4444") && st4[1].getText().equals("4444") && st4[2].getText().equals("4444") && st4[3].getText().equals("4444"))|| (st4[0].getText().equals("") && st4[1].getText().equals("") && st4[2].getText().equals("") && st4[3].getText().equals("")))  
                    {
                        if((st1[0].getText().equals("1111") && st1[1].getText().equals("1111") && st1[2].getText().equals("1111") && st1[3].getText().equals("1111")) || (st5[0].getText().equals("2222") && st5[1].getText().equals("2222") && st5[2].getText().equals("2222") && st5[3].getText().equals("2222")) || (st5[0].getText().equals("3333") && st5[1].getText().equals("3333") && st5[2].getText().equals("3333") && st5[3].getText().equals("3333")) || (st1[0].getText().equals("4444") && st1[1].getText().equals("4444") && st1[2].getText().equals("4444") && st1[3].getText().equals("4444"))|| (st5[0].getText().equals("") && st1[5].getText().equals("") && st5[2].getText().equals("") && st5[3].getText().equals("")))  
                        {
                            vir.setText(">>> Level  Succesfully  Completed <<<");
                        
                        }
                    }
                }
            }   
        }
    }



    class ResetAndNewGame extends MouseAdapter
    {
        public void mouseClicked(MouseEvent me)
        {
            Button btn=(Button)me.getComponent();
            if(btn==reset)
            {


            }
            else{
                dispose();
            }
        }
    }




    class Stack1 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s1 = tf1.getText();
            String s2;
            if(s1.isEmpty())
            {
                for(int i = 3 ; i >= 0 ; i--)
                {
                    s2 = st1[i].getText();
                    if(!s2.isEmpty())
                    {
                        tf1.setText(s2);
                        st1[i].setText("");
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0 ; i<=3 ; i++)
                {
                    s2 = st1[i].getText();
                    if(s2.isEmpty())
                    {
                        st1[i].setText(s1);
                        tf1.setText("");
                        break;
                    } 
                }
            }
            checkWinner();
            checkWinner();
        }
    }

    class Stack2 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s1 = tf1.getText();
            String s2;
            if(s1.isEmpty())
            {
                for(int i = 3 ; i >= 0 ; i--)
                {
                    s2 = st2[i].getText();
                    if(!s2.isEmpty())
                    {
                        tf1.setText(s2);
                        st2[i].setText("");
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0 ; i<=3 ; i++)
                {
                    s2 = st2[i].getText();
                    if(s2.isEmpty())
                    {
                        st2[i].setText(s1);
                        tf1.setText("");
                        break;
                    } 
                }
            }
            checkWinner();    
        }
    }

    class Stack3 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s1 = tf1.getText();
            String s2;
            if(s1.isEmpty())
            {
                for(int i = 3 ; i >= 0 ; i--)
                {
                    s2 = st3[i].getText();
                    if(!s2.isEmpty())
                    {
                        tf1.setText(s2);
                        st3[i].setText("");
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0 ; i<=3 ; i++)
                {
                    s2 = st3[i].getText();
                    if(s2.isEmpty())
                    {
                        st3[i].setText(s1);
                        tf1.setText("");
                        break;
                    } 
                }
            }
            checkWinner();
        }
    }

    class Stack4 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s1 = tf1.getText();
            String s2;
            if(s1.isEmpty())
            {
                for(int i = 3 ; i >= 0 ; i--)
                {
                    s2 = st4[i].getText();
                    if(!s2.isEmpty())
                    {
                        tf1.setText(s2);
                        st4[i].setText("");
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0 ; i<=3 ; i++)
                {
                    s2 = st4[i].getText();
                    if(s2.isEmpty())
                    {
                        st4[i].setText(s1);
                        tf1.setText("");
                        break;
                    } 
                }
            }
            checkWinner();

        }
    }

    class Stack5 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s1 = tf1.getText();
            String s2;
            if(s1.isEmpty())
            {
                for(int i = 3 ; i >= 0 ; i--)
                {
                    s2 = st5[i].getText();
                    if(!s2.isEmpty())
                    {
                        tf1.setText(s2);
                        st5[i].setText("");
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0 ; i<=3 ; i++)
                {
                    s2 = st5[i].getText();
                    if(s2.isEmpty())
                    {
                        st5[i].setText(s1);
                        tf1.setText("");
                        break;
                    } 
                }
            }
            checkWinner();
        }
    }

    public static void main(String ar[])
    {
        NumSortGame nsg = new NumSortGame();
        nsg.setVisible(true);
        nsg.setTitle("NUMBER SORTING PUZZEL GAME");
        nsg.setSize(1200,1000);
    }
}