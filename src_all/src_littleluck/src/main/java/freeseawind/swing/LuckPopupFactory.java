package freeseawind.swing;

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JWindow;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import freeseawind.lf.cfg.LuckGlobalBundle;

/**
 * 透明背景popup工厂方法
 * 
 * @author freeseawind@github
 * @version 1.0
 */
public class LuckPopupFactory extends PopupFactory
{
    @Override
    public Popup getPopup(Component owner, Component contents, int x, int y)
        throws IllegalArgumentException
    {
        Popup popup = super.getPopup(owner, contents, x, y);

        // 比较安全的hack方式
        Object obj = SwingUtilities.getWindowAncestor(contents);

        if (obj instanceof JWindow)
        {
            JWindow window = (JWindow) obj;
            
            // 承载内容的窗体透明
            window.setBackground(UIManager.getColor(LuckGlobalBundle.TRANSLUCENT_COLOR));

            ((JComponent) window.getContentPane()).setOpaque(false);
        }

        return popup;
    }
}
