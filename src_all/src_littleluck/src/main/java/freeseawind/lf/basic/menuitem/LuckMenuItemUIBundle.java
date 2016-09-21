package freeseawind.lf.basic.menuitem;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.IconUIResource;

import freeseawind.lf.cfg.LuckResourceBundle;
import freeseawind.lf.img.LuckIcon;

/**
 * 
 * @author freeseawind@github
 * @version 1.0
 */
public class LuckMenuItemUIBundle extends LuckResourceBundle
{
    
    /**
     * MenuItem选中时背景颜色属性key
     */
    public static final String SELECTIONBG = "MenuItem.selectionBackground";

    /**
     * MenuItem选中时字体颜色属性key
     */
    public static final String SELECTIONFG = "MenuItem.selectionForeground";
    
    /**
     * MenuItem背景颜色属性key
     */
    public static final String BACKGROUND = "MenuItem.background";
    
    /**
     * MenuItem边框属性key
     */
    public static final String BORDER = "MenuItem.border";
    
    /**
     * CheckBoxMenuItem复选框属性key
     */
    public static final String CHECK_ICON = "MenuItem.checkIcon";
    
    /**
     * CheckBoxMenuItem箭头图标属性key
     */
    public static final String ARROW_ICON = "MenuItem.arrowIcon";
    
    /**
     * MenuItem文本和复选框图标间距属性key
     */
    public static final String AFTERCHECKICONGAP = "MenuItem.afterCheckIconGap";
    
    /**
     * MenuItem最小文本偏移宽度属性key
     */
    public static final String MINIMUMTEXTOFFSET = "MenuItem.minimumTextOffset";
    
    /**
     * MenuItem复选框图标偏移x轴距离属性key
     */
    public static final String CHECKICONOFFSET = "MenuItem.checkIconOffset";
    

    @Override
    protected void installColor(UIDefaults table)
    {
        table.put(SELECTIONBG, getColorRes(60, 175, 210));

        table.put(SELECTIONFG, Color.WHITE);
        
        table.put(BACKGROUND, Color.WHITE);
    }

    @Override
    protected void installBorder(UIDefaults table)
    {
        table.put(BORDER, BorderFactory.createEmptyBorder());
    }

    @Override
    protected void loadImages(UIDefaults table)
    {
        table.put(CHECK_ICON, new IconUIResource(new LuckIcon(0, 0)));
        
        table.put(ARROW_ICON, new IconUIResource(new LuckIcon(0, 0)));
    }

    @Override
    protected void installOther(UIDefaults table)
    {
        UIManager.put(AFTERCHECKICONGAP, 4);
        UIManager.put(MINIMUMTEXTOFFSET, 0);
        UIManager.put(CHECKICONOFFSET, 4);
    }
}
