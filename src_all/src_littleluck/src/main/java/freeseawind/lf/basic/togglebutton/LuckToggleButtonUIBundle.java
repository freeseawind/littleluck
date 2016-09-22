package freeseawind.lf.basic.togglebutton;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.UIDefaults;

import freeseawind.lf.cfg.LuckResourceBundle;
import freeseawind.lf.utils.LuckRes;

/**
 * <p>ToggleButtonUI and RadioButtonUI and CheckBoxUI资源绑定类。</p>
 *
 * <p>ToggleButtonUI and RadioButtonUI and CheckBoxUI resource bundle class. </p>
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class LuckToggleButtonUIBundle extends LuckResourceBundle
{
    /**
     * <p>[LittleLuck属性]RadioButton无状态下颜色属性key。</p>
     *
     * <p>[LittLeLuck Attributes] Color attributes when RadioButton no state.</p>
     */
    public static final String RADIO_NORMAL_COLOR = "RadioButton.normalColor";

    /**
     * <p>[LittleLuck属性]RadioButton有焦点时颜色属性key</p>
     *
     * <p>[LittLeLuck Attributes] Color attribute when RadioButton has focus.</p>
     */
    public static final String RADIO_FOCUS_COLOR = "RadioButton.focusColor";

    /**
     * <p>[LittleLuck属性]RadioButton点击时内阴影颜色属性key。</p>
     *
     * <p>[LittLeLuck Attributes] Shadow color properties when clicked RadioButton.</p>
     */
    public static final String RADIO_SHADOW_COLOR = "RadioButton.shadowColor";

    /**
     * <p>单选按钮背景颜色属性key。</p>
     *
     * <p>Radio button background color property.</p>
     */
    public static final String RADIO_BACKGROUND = "RadioButton.background";

    /**
     * <p>复选按钮背景颜色属性key。</p>
     *
     * <p>Check button background color property.</p>
     */
    public static final String CHECKBOX_BACKGROUND = "CheckBox.background";

    /**
     * <p>[LittleLuck属性]RadioButton小圆点颜色属性key。</p>
     *
     * <p>[LittLeLuck Attributes] RadioButton selected color attribute.</p>
     */
    public static final String RADIO_CHECK_COLOR = "RadioButton.checkColor";

    /**
     * <p>ChecBoxButton图标属性key。</p>
     *
     * <p>ChecBoxButton Icon Properties.</p>
     */
    public static final String CHECKBOX_ICON = "CheckBox.icon";

    /**
     * <p>[LittleLuck属性] ChecBoxButton无状态下图片属性key。</p>
     *
     * <p>[LittLeLuck Attributes] No state ChecBoxButton image properties.</p>
     */
    public static final String CHECKBOX_NORMAL_IMG = "CheckBox.normal";

    /**
     * <p>[LittleLuck属性] ChecBoxButton非选中状态下鼠标经过图片属性key。 </p>
     *
     * <p>[LittLeLuck Attributes] image properties when mouse move on no state ChecBoxButton.</p>
     */
    public static final String CHECKBOX_ROLLVER_IMG = "CheckBox.rollver";

    /**
     * <p>[LittleLuck属性] ChecBoxButton选中状态下鼠标经过图片属性key。</p>
     *
     * <p>[LittLeLuck Attributes] image properties when mouse move on checked state ChecBoxButton.</p>
     */
    public static final String CHECKBOX_UNROLLVER_IMG = "CheckBox.unrollver";

    /**
     * <p>[LittleLuck属性] ChecBoxButton无状态下点击图片属性key。</p>
     *
     * <p>[LittLeLuck Attributes] image properties when Click on no state ChecBoxButton.</p>
     */
    public static final String CHECKBOX_PRESSED_IMG = "CheckBox.pressed";

    /**
     * <p>[LittleLuck属性] ChecBoxButton选中状态下鼠标点击图片属性key。</p>
     *
     * <p>[LittLeLuck Attributes]  image attributes when Click on checked state ChecBoxButton.</p>
     */
    public static final String CHECKBOX_UNPRESSED_ICON = "CheckBox.unpressed";

    /**
     * <p>ToggleButton边框属性key。</p>
     *
     * <p>ToggleButton border properties.</p>
     */
    public static final String TOGGLEBUTTON_BORDER = "ToggleButton.border";


    /**
     * <p>RadioButton图标属性key。</p>
     *
     * <p>RadioButton icon properties.</p>
     */
    public static final String RADIO_ICON = "RadioButton.icon";

    @Override
    protected void installColor(UIDefaults table)
    {
        table.put(RADIO_BACKGROUND, Color.white);
        table.put(CHECKBOX_BACKGROUND, Color.white);
        table.put(RADIO_NORMAL_COLOR, getColorRes(178, 178, 178));
        table.put(RADIO_FOCUS_COLOR, getColorRes(5, 141, 192));
        table.put(RADIO_SHADOW_COLOR, getColorRes(120, 175, 217));
        table.put(RADIO_CHECK_COLOR, getColorRes(5, 141, 192));
    }

    @Override
    protected void installBorder(UIDefaults table)
    {
        table.put(TOGGLEBUTTON_BORDER, BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    @Override
    protected void loadImages(UIDefaults table)
    {
        //
        table.put(CHECKBOX_ICON, new LuckCheckBoxIcon());
        table.put(CHECKBOX_NORMAL_IMG, LuckRes.getImage("checkbox/cb_normal.png"));
        table.put(CHECKBOX_ROLLVER_IMG, LuckRes.getImage("checkbox/cb_rollver.png"));
        table.put(CHECKBOX_UNROLLVER_IMG, LuckRes.getImage("checkbox/cb_un_rollver.png"));
        table.put(CHECKBOX_PRESSED_IMG, LuckRes.getImage("checkbox/cb_pressed.png"));
        table.put(CHECKBOX_UNPRESSED_ICON, LuckRes.getImage("checkbox/cb_un_pressed.png"));

        //
        table.put(RADIO_ICON, new LuckRadioIcon());
    }
}
