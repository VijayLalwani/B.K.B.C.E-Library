/*************************************************************************
** changes to be made -                                                 **
** 1.change the long excel function with simple new MySQL excel code    **
** 2.Add CD option                                                      **
** 3.check teachers issue_return                                        **
** 4.check from-till date records                                       **
** 5.make a good splash screen                                          **
** 6.add export for records                                             **
** 7.remove .this from everywhere                                       **
** 8.look for a better look and feel                                    **
** 9.Make it look Better                                                **
** 10.make a install file                                               **
** 11.make a portable file probably with SQLLite                        **
**************************************************************************/
package Library;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/*******************
 * @author Lalwani *
 ******************/

public class Splash
extends JWindow {
    private int duration;

    public Splash(int d) {
        this.duration = d;
    }

    public void showSplash() {
        Thread t = new Thread();
        JPanel content = (JPanel)this.getContentPane();
        try {
            Thread.sleep(1800);
        }
        catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Please try restarting the program");
        }
    }

    public void showSplashAndExit() {
        this.showSplash();
        new OpenPage().setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel((LookAndFeel)new SyntheticaAluOxideLookAndFeel());
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
        Splash splash = new Splash(100);
        splash.showSplashAndExit();
    }
}

