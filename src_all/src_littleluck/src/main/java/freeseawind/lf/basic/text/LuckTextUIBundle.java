package freeseawind.lf.basic.text;

import java.awt.Insets;

import javax.swing.UIDefaults;
import javax.swing.UIManager;

import freeseawind.lf.cfg.LuckResourceBundle;

/**
 * <p>文本相关资源绑定类。</p>
 *
 * <p>A TextUI resource bundle class.</p>
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class LuckTextUIBundle extends LuckResourceBundle
{
    /**
     * <p>TextField边框属性。</p>
     *
     * <p>TextField border properties.</p>
     */
    public static final String TEXTFIELD_BORDER = "TextField.border";

    /**
     * <p>[LittleLuck属性] TextField焦点边框属性。</p>
     *
     * <p>[LittLeLuck Attributes] TextField focus border properties.</p>
     */
    public static final String TEXTFIELD_FOCUSBORDER = "TextField.focusBorder";

    /**
     * <p>PasswordField边框属性。</p>
     *
     * <p>PasswordField border properties.</p>
     */
    public static final String PASSWORDFIELD_BORDER = "PasswordField.border";

    /**
     * <p>[LittleLuck属性] PasswordField焦点边框属性。</p>
     *
     * <p>[LittLeLuck Attributes] PasswordField focus border properties.</p>
     */
    public static final String PASSWORDFIELD_FOCUSBORDER = "PasswordField.focusBorder";

    /**
     * <p>FormattedTextField边框属性。</p>
     *
     * <p>FormattedTextField border properties.</p>
     */
    public static final String FORMATTEDTEXTFIELD_BORDER = "FormattedTextField.border";

    /**
     * <p>[LittleLuck属性]FormattedTextField焦点边框属性。</p>
     *
     * <p>[LittLeLuck Attributes] FormattedTextField focus border properties.</p>
     */
    public static final String FORMATTEDTEXTFIELD_FOCUSBORDER = "FormattedTextField.focusBorder";

    /**
     * <p>TextArea边框属性。</p>
     *
     * <p>TextArea border properties.</p>
     */
    public static final String TEXTAREA_BORDER = "TextArea.border";

    /**
     * <p>TextPane边框属性。</p>
     *
     * <p>TextPane border properties.</p>
     */
    public static final String TEXTPANE_BORDER = "TextPane.border";

    /**
     * <p>EditorPane边框属性。</p>
     *
     * <p>EditorPane border properties.</p>
     */
    public static final String EDITORPANE_BORDER = "EditorPane.border";
    
    public void uninitialize()
    {
        UIManager.put(TEXTFIELD_FOCUSBORDER, null);
        
        UIManager.put(PASSWORDFIELD_FOCUSBORDER, null);
        
        UIManager.put(FORMATTEDTEXTFIELD_FOCUSBORDER, null);
    }

    @Override
    protected void installBorder(UIDefaults table)
    {
        Insets insets = new Insets(4, 5, 4, 5);

        LuckTextBorder normalBorder = new LuckTextBorder(insets, false);

        LuckTextBorder focusBorder = new LuckTextBorder(insets, true);

        table.put(TEXTFIELD_BORDER, normalBorder);

        table.put(TEXTFIELD_FOCUSBORDER, focusBorder);

        table.put(PASSWORDFIELD_BORDER, normalBorder);

        table.put(PASSWORDFIELD_FOCUSBORDER, focusBorder);

        table.put(FORMATTEDTEXTFIELD_BORDER, normalBorder);

        table.put(FORMATTEDTEXTFIELD_FOCUSBORDER, focusBorder);
    }
}
