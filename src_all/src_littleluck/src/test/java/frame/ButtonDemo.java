package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import freeseawind.lf.LittleLuckLookAndFeel;
import freeseawind.lf.basic.button.LuckButtonColorFactory;
import freeseawind.lf.basic.button.LuckButtonColorInfo;
import freeseawind.lf.basic.button.LuckButtonUI;
import freeseawind.lf.basic.rootpane.LuckBackgroundPanel;
import freeseawind.lf.layout.GBC;
import util.DemoUtil;


/**
 * ButtonDemo演示类, 演示如下功能：
 * <ul>
 * <li>如何更改按钮颜色</li>
 * <li>如何使用自定义按钮颜色</li>
 * </ul>
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class ButtonDemo
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    UIManager.setLookAndFeel(LittleLuckLookAndFeel.class.getName());
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }

                JFrame frame = DemoUtil.createFrame("ButtonDemo", 450, 300);

                JPanel panel = new JPanel();
                
                panel.setOpaque(false);

                panel.setLayout(new GridBagLayout());

                panel.add(createButton(LuckButtonColorFactory.getBlueBtnInfo(),
                        "Blue Button"), new GBC(0, 0, 1, 1).setInsets(3));

                panel.add(createButton(LuckButtonColorFactory.getGreenBtnInfo(),
                        "Green Button"), new GBC(0, 1, 1, 1).setInsets(3));

                panel.add(createButton(LuckButtonColorFactory.getNaturalsBtnInfo(),
                        "Naturals Button"), new GBC(0, 2, 1, 1).setInsets(3));

                panel.add(createButton(LuckButtonColorFactory.getVioletBtnInfo(),
                        "Violet Button"), new GBC(0, 3, 1, 1).setInsets(3));

                // 使用自定义颜色创建按钮
                panel.add(createButton(getCustomColorInfo(), "Custom Button"),
                        new GBC(0, 4, 1, 1).setInsets(3));

                frame.setContentPane(panel);

                DemoUtil.centerWindowOnScreen(frame);

                frame.setVisible(true);
                
                Container cc = frame.getContentPane();
                
                if(cc instanceof LuckBackgroundPanel)
                {
                    LuckBackgroundPanel bg = (LuckBackgroundPanel) cc;
                    
                    if(bg.getContentPane() != null)
                    {
                        bg.getContentPane().add(new JLabel("hello"));
                    }
                }
            }
        });
    }

    /**
     * 自定义颜色信息
     *
     * @return <code>LuckButtonColorInfo</code>
     */
    public static LuckButtonColorInfo getCustomColorInfo()
    {
        Color normal = new Color(157, 211, 42);

        Color rollver = new Color(187, 248, 81);

        Color pressed = new Color(141, 207, 36);

        Color font = Color.white;

        return new LuckButtonColorInfo(normal, rollver, pressed, font);
    }

    /**
     * 创建颜色按钮
     *
     * @param colorInfo 按钮颜色属性
     * @param text 按钮文本
     * @return <code>JButton</code>
     */
    public static JButton createButton(LuckButtonColorInfo colorInfo,
                                       String text)
    {
        JButton btn = new JButton(text);

        LuckButtonUI btnUI = (LuckButtonUI) btn.getUI();

        btnUI.setBtnColorInfo(colorInfo);
        
        btn.setPreferredSize(new Dimension(120, 26));

        return btn;
    }
}
