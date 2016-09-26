package freeseawind.lf.basic.text;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTextFieldUI;
import javax.swing.text.JTextComponent;

import freeseawind.lf.border.LuckBorderField;
import freeseawind.lf.event.LuckBorderFocusHandle;

/**
 * <p>
 * TexFieldUI实现类，设置组件为不完全透明，使用圆角焦点边框作为默认边框。
 * </p>
 *
 * <p>
 * TexFieldUI implementation class, setting the component is not completely
 * transparent, rounded corners as the default focus frame border.
 * </p>
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class LuckTexFieldUI extends BasicTextFieldUI implements LuckBorderField
{
    protected LuckBorderFocusHandle handle;
    private RectangularShape contentShape;
    private RectangularShape borderShape;
    private boolean isFocusGained;

    public static ComponentUI createUI(JComponent c)
    {
        return new LuckTexFieldUI();
    }

    public void installUI(JComponent c)
    {
        super.installUI(c);

        contentShape = new RoundRectangle2D.Float(0, 0, 0, 0, 8, 8);

        borderShape = new RoundRectangle2D.Float(0, 0, 0, 0, 8, 8);

        handle = createFocusHandle();

        c.addMouseListener(handle);

        c.addFocusListener(handle);
    }

    @Override
    public void uninstallUI(JComponent c)
    {
        super.uninstallUI(c);

        c.removeMouseListener(handle);

        c.removeFocusListener(handle);

        handle = null;
    }

    /**
     * <p>创建边框焦点监听器。</p>
     *
     * <p>Create the border focus listener.</p>
     *
     * @return <code>LuckBorderFocusHandle</code>
     */
    protected LuckBorderFocusHandle createFocusHandle()
    {
        return new LuckFocusHandler();
    }

    @Override
    protected void paintBackground(Graphics g)
    {
        // 绘制和边框形状一致的背景。
        // Draw border and conform to the shape of the background.
        JTextComponent editor = this.getComponent();

        Graphics2D g2d = (Graphics2D)g;

        g.setColor(editor.getBackground());

        contentShape.setFrame(0, 0, editor.getWidth() - 1, editor.getHeight() - 1);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.fill(contentShape);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
    }

    public void setFocusGained(boolean isFoucusGaind)
    {
        this.isFocusGained = isFoucusGaind;
    }

    public boolean isFocusGaind()
    {
        return isFocusGained;
    }

    public RectangularShape getBorderShape()
    {
        return borderShape;
    }

    public void setBorderShape(RectangularShape shape)
    {
        this.borderShape = shape;
    }

    public RectangularShape getContentShape()
    {
        return contentShape;
    }

    public void setContentShape(RectangularShape contentShape)
    {
        this.contentShape = contentShape;
    }

    public class LuckFocusHandler extends LuckBorderFocusHandle
    {
        @Override
        public JComponent getComponent()
        {
            return LuckTexFieldUI.this.getComponent();
        }

        @Override
        public LuckBorderField getBorderField()
        {
            return LuckTexFieldUI.this;
        }
    }
}
