package awol_first_antivirus1;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class  Awol_First_Antivirus1 extends JFrame {
    public JPanel p1,p2,p3;
    public JButton button1,button2;
    public JLabel label;
    BufferedImage img1=null;
    public JPanel pl;
    public  Awol_First_Antivirus1() throws IOException {
        this.setLayout(new BorderLayout());
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p1.setBackground(Color.WHITE);
        p2.setBackground(Color.WHITE);
        p3.setBackground(Color.WHITE);
        this.add(p1,BorderLayout.NORTH);
        this.add(p2,BorderLayout.CENTER);
        this.add(p3,BorderLayout.SOUTH);
//        Image i= Toolkit.getDefaultToolkit().getImage("..//image//save.jpg");
//        img1 = ImageIO.read(new File("..//image//save.jpg"));
         Image i= Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Documents\\NetBeansProjects\\Awol_First_Antivirus1\\src\\image\\save.jpg");
        Image image1=Resized(800,150,i);
        ImageIcon imageIcon1 = new ImageIcon(image1);
        JLabel l=new JLabel("i am here");
        l.setIcon(imageIcon1);
        p1.setLayout(new BorderLayout());
        p1.add(l,BorderLayout.CENTER);
        label=new JLabel("Don't Worry For Those Removed File I Will Recovers It For You");
        p2.setLayout(new BorderLayout());
        pl=new JPanel();
        pl.setLayout(new FlowLayout(FlowLayout.CENTER));
        pl.add(label);
        pl.setBackground(Color.ORANGE);
        p2.add(pl,BorderLayout.NORTH);
        label.setBackground(Color.WHITE);
        label.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        button1=new JButton("To Fix It Click Me");
        JPanel pll=new JPanel();
        pll.setLayout(new FlowLayout(FlowLayout.CENTER));
        pll.add(button1);
        p3.add(pll,BorderLayout.CENTER);
        setSize(800,700);
        setLocation(300,10);
        setVisible(true);
        setResizable(false);
        Image i1= Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Documents\\NetBeansProjects\\Awol_First_Antivirus1\\src\\image\\ico.png");
        setIconImage(i1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  JLabel lm=new JLabel("Every Removed File is Recover Thank's For Trusting me!!!");
                     lm.setFont(new Font("Sans Serif", Font.PLAIN, 20));
                  JPanel pl1=new JPanel();
                  pl1.setLayout(new FlowLayout(FlowLayout.CENTER));
                  pl.setVisible(false);
                  pl1.setBackground(Color.ORANGE);
                  pl1.add(lm);
                  p2.add(pl1,BorderLayout.NORTH);
                  Image i= Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Documents\\NetBeansProjects\\Awol_First_Antivirus1\\src\\image\\load.gif");
                  ImageIcon loading = new ImageIcon(i);
                  JLabel progress=new JLabel(" ", loading, JLabel.CENTER);
                  JPanel plo=new JPanel();
                  plo.setLayout(new FlowLayout(FlowLayout.CENTER));
                  plo.add(progress);
                  p2.add(plo,BorderLayout.CENTER);
                  button1.setText("");
                  button1.setText("Wait Untill Look It Completely");
                  String path="cmd /c start nahil2\\showfile.bat";
                Runtime rn=Runtime.getRuntime();
                try {
                    Process pr=rn.exec(path);
                } catch (IOException ex) {
                    Logger.getLogger(Awol_First_Antivirus1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           
        });

    }
    
    //the method used for the resized the image of the icon
    private Image Resized(int width, int height, Image img) {
        Image dimg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return dimg;
    }
    public static void main(String[] args) throws IOException {
           try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
            Awol_First_Antivirus1 i=new  Awol_First_Antivirus1();
            
    }
}