package frame;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import freeseawind.lf.LittleLuck;
import freeseawind.lf.border.LuckNinePatchBorder;
import freeseawind.lf.utils.LuckRes;
import util.DemoUtil;

/**
 * PopupMenuDemo演示类, 演示如下功能：
 * <ul>
 * <li>如何自定义PopupMenu边框</li>
 * </ul>
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class PopupMenuDemo
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    LittleLuck.getSingleton().luanchLookAndFeel();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }

                JFrame frame = DemoUtil.createFrame("PopupMenuDemo", 450, 300);

                frame.setJMenuBar(new JMenuBar());
                
                frame.getJMenuBar().setBorder(BorderFactory.createEmptyBorder(3,0,0,0));

                // default PopupMenuBorder
                JMenu menuDef = new JMenu("Default");

                menuDef.add(new JMenuItem("open file"));

                frame.getJMenuBar().add(menuDef);

                //custom PopupMenuBorder
                JMenu menuCustom = new JMenu("Custom");

                BufferedImage img = LuckRes.getImage("popup_border.9.png");

                menuCustom.getPopupMenu().setPopupSize(80, 51);

                menuCustom.getPopupMenu().setBorder(new LuckNinePatchBorder(new Insets(12, 4, 6, 4), img));

                menuCustom.add(new JMenuItem("open file"));

                menuCustom.add(new JMenuItem("Edit file"));

                frame.getJMenuBar().add(menuCustom);

                DemoUtil.centerWindowOnScreen(frame);

                frame.setVisible(true);
            }
        });
    }

}
