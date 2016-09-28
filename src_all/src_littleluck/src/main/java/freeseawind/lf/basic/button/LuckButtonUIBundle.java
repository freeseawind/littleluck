package freeseawind.lf.basic.button;

import java.awt.Color;

import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import freeseawind.lf.cfg.LuckResourceBundle;

/**
 * <pre>
 * ButtonUI资源绑定类。
 *
 * A ButtonUI resource bundle class.
 * <pre>
 *
 * @author freeseawind@github
 * @version 1.0
 */
public class LuckButtonUIBundle extends LuckResourceBundle
{
    /**
     * <pre>
     * Button边框属性key，边框默认间距(3, 14, 3, 15)
     *
     * Button border properties key, the default border spacing(3, 14, 3, 15)
     * <pre>
     */
    public static final String BORDER = "Button.border";

    /**
     * <pre>
     * <strong>[LittleLuck属性]</strong> 按钮颜色配置信息属性key，默认蓝色按钮
     *
     * <strong>[LittLeLuck Attributes]</strong> Button color configuration information attribute
     * key, the default blue button.
     *
     * <pre>
     */
    public static final String COLOR_INFO = "Button.colorInfo";

    /**
     * <pre>
     * Button背景颜色属性key, 默认白色
     *
     * Button Background color property, Default white.
     * <pre>
     */
    public static final String BACKGROUND = "Button.background";

    /**
     * <pre>
     * <strong>[LittleLuck属性]</strong> 如需要在有图标的时候仍绘制背景, 使用如下代码:
     * <code>button.putClientProperty(IS_PAINTBG, "");</code>
     *
     * <strong>[LittLeLuck Attributes]</strong> If you need to draw the background when there is
     * an icon, use the following code:
     * <code>button.putClientProperty(IS_PAINTBG, "");</code>
     *
     * <pre>
     */
    public static final String IS_PAINTBG = "Button.isPaintBG";

    public void uninitialize()
    {
        UIManager.put(COLOR_INFO, null);

        UIManager.put(IS_PAINTBG, null);
    }

    @Override
    protected void installBorder(UIDefaults table)
    {
        table.put(BORDER, new EmptyBorder(3, 14, 3, 15));
    }

    @Override
    protected void installColor(UIDefaults table)
    {
        table.put(COLOR_INFO, LuckButtonColorFactory.getBlueBtnInfo());

        table.put(BACKGROUND, Color.WHITE);
    }
}
