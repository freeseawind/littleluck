package frame;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.ComponentUI;

import freeseawind.lf.LittleLuckLookAndFeel;
import freeseawind.lf.basic.rootpane.LuckBackgroundPanel;
import freeseawind.lf.basic.rootpane.LuckRootPaneUI;
import freeseawind.lf.basic.rootpane.LuckTitlePanel;
import freeseawind.lf.canvas.LuckCanvas;
import freeseawind.lf.event.WindowMouseHandler;
import freeseawind.lf.geom.LuckRectangle;
import freeseawind.lf.utils.LuckRes;
import util.DemoUtil;

/**
 * JFrameDemo演示类, 演示如下功能：
 * <ul>
 * <li>如何使用图片作为JFrame背景</li>
 * <li>如何自定义鼠标拖动区域</li>
 * <li>如何改变标题字体</li>
 * </ul>
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class FrameDemo
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

                JFrame frame = DemoUtil.createFrame("FrameDemo", 450, 300);

                frame.getRootPane().setUI(new DemoRootPaneUI());

                DemoUtil.centerWindowOnScreen(frame);

                frame.setVisible(true);
            }
        });
    }
}

class DemoRootPaneUI extends LuckRootPaneUI
{
    public static ComponentUI createUI(JComponent c)
    {
        return new DemoRootPaneUI();
    }

    /**
     * 自定义拖拽区域
     */
    protected MouseInputListener installWindowListeners(JRootPane root)
    {
        MouseInputListener listener = super.installWindowListeners(root);

        if(listener instanceof WindowMouseHandler)
        {
            ((WindowMouseHandler) listener).setDragArea(new LuckRectangle(root));
        }

        return listener;
    }

    /**
     * 使用图片做为背景，设置标题栏字体为白色
     */
    public LuckBackgroundPanel createContentPane(LuckTitlePanel titlePanel,
                                                 Container oldContent)
    {
        LuckBackgroundPanel bg = super.createContentPane(titlePanel, oldContent);

        // 设置标题栏背景为空
        titlePanel.setBackgroundNP(null);

        // 设置标题栏字体颜色为白色
        titlePanel.setTitleForeground(Color.WHITE);

        // 设置背景
        bg.setPainter(new LuckCanvas()
        {
            BufferedImage bgImg = LuckRes.getImage("bg.png");

            public void drawComponent(Graphics g, JComponent c)
            {
                Graphics2D g2d = (Graphics2D) g;

                AlphaComposite composite = (AlphaComposite) g2d.getComposite();

                AlphaComposite transulent = AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 0.8f);

                g2d.setComposite(transulent);

                g2d.drawImage(bgImg, 0, 0, c.getWidth(), c.getHeight(), null);

                g2d.setComposite(composite);
            }
        });

        return bg;
    }
}
