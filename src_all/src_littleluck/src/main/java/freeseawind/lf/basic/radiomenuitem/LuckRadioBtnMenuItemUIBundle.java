package freeseawind.lf.basic.radiomenuitem;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.IconUIResource;

import freeseawind.lf.cfg.LuckResourceBundle;
import freeseawind.lf.img.LuckIcon;

/**
 * <p>RadioBtnMenuItemUI资源绑定类。<p>
 *
 * <p>A RadioBtnMenuItemUI resource bundle class.</p>
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class LuckRadioBtnMenuItemUIBundle extends LuckResourceBundle
{
    /**
     * <p>JRadioButtonMenuItem背景颜色属性key。</p>
     *
     * <p>JRadioButtonMenuItem background color properties.</p>
     */
    public static final String BACKGROUND = "RadioButtonMenuItem.background";

    /**
     * <p>JRadioButtonMenuItem选中时背景颜色属性key。</p>
     *
     * <p>JRadioButtonMenuItem background color properties when selected.</p>
     */
    public static final String SELECTIONBG = "RadioButtonMenuItem.selectionBackground";

    /**
     * <p>JRadioButtonMenuItem选中时字体颜色属性key。</p>
     *
     * <p>RadioButtonMenuItem font color properties when selected.</p>
     */
    public static final String SELECTIONFG = "RadioButtonMenuItem.selectionForeground";

    /**
     * <p>RadioButtonMenuItem边框属性key。</p>
     *
     * <p>RadioButtonMenuItem border properties.</p>
     */
    public static final String BORDER = "RadioButtonMenuItem.border";

    /**
     * <p>RadioButtonMenuItem单选框图标属性key。</p>
     *
     * <p>RadioButtonMenuItem check icon properties.</p>
     */
    public static final String CHECK_ICON = "RadioButtonMenuItem.checkIcon";

    /**
     * <p>RadioButtonMenuItem箭头图标属性key。</p>
     *
     * <p>RadioButtonMenuItem arrow icon properties.</p>
     */
    public static final String ARROW_ICON = "RadioButtonMenuItem.arrowIcon";

    /**
     * <p>RadioButtonMenuItem文本和复选框图标间距属性key。</p>
     *
     * <p>RadioButtonMenuItem after check icon gap properties.</p>
     */
    public static final String AFTERCHECKICONGAP = "RadioButtonMenuItem.afterCheckIconGap";

    /**
     * <p>RadioButtonMenuItem最小文本偏移宽度属性key。</p>
     *
     * <p>RadioButtonMenuItem minimum text offset properties.</p>
     */
    public static final String MINIMUMTEXTOFFSET = "RadioButtonMenuItem.minimumTextOffset";

    /**
     * <p>RadioButtonMenuItem复选框图标偏移x轴距离属性key。</p>
     *
     * <p>RadioButtonMenuItem check icon offset properties,</p>
     */
    public static final String CHECKICONOFFSET = "RadioButtonMenuItem.checkIconOffset";


    @Override
    protected void installColor(UIDefaults table)
    {
        UIManager.put(BACKGROUND, Color.WHITE);

        UIManager.put(SELECTIONBG, getColorRes(60, 175, 210));

        UIManager.put(SELECTIONFG, Color.WHITE);
    }

    @Override
    protected void installBorder(UIDefaults table)
    {
        UIManager.put(BORDER, BorderFactory.createEmptyBorder());
    }

    @Override
    protected void loadImages(UIDefaults table)
    {
        UIManager.put(CHECK_ICON, new LuckRadioIcon());

        UIManager.put(ARROW_ICON, new IconUIResource(new LuckIcon(0, 0)));
    }

    @Override
    protected void installOther(UIDefaults table)
    {
        UIManager.put(AFTERCHECKICONGAP, 4);

        UIManager.put(MINIMUMTEXTOFFSET, 0);

        UIManager.put(CHECKICONOFFSET, 4);
    }
}
