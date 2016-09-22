package freeseawind.lf.basic.toolips;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;

import freeseawind.ninepatch.swing.SwingNinePatch;

/**
 * <p>
 * ToolTipUI实现类，设置UI组件为不完全透明，使用点九图作为背景和边框。
 * </p>
 * <p>
 * A ToolTipUI implementation class, set UI components are not fully transparent,
 * to use as a background in ninepatch image, using an empty border to keep the
 * content of the pitch.
 * </p>
 * <p>
 * See Also:{@link LuckToolipUIBundle}
 * </p>
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class LuckToolTipUI extends BasicToolTipUI
{
    private static LuckToolTipUI sharedInstance = new LuckToolTipUI();

    private SwingNinePatch np;

    public static ComponentUI createUI(JComponent c)
    {
        return sharedInstance;
    }

    public void installUI(JComponent c)
    {
        super.installUI(c);

        if(np == null)
        {
            np = new SwingNinePatch((BufferedImage) UIManager.get(LuckToolipUIBundle.BGIMG));
        }
    }

    @Override
    public void uninstallUI(JComponent c)
    {
        super.uninstallUI(c);

        np = null;
    }

    public void installDefaults(JComponent c)
    {
        super.installDefaults(c);

        c.setOpaque(false);
    }

    public void paint(Graphics g, JComponent c)
    {

        if(np != null)
        {
            np.drawNinePatch((Graphics2D) g, 0, 0, c.getWidth(), c.getHeight());

        }

        super.paint(g, c);
    }
}
