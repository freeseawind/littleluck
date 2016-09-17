package freeseawind.lf.basic.tree;

import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.TreeCellRenderer;

/**
 * <p>TreeUI实现类,设置组件为不完全透明</p>
 * <p>Set components are not fully transparent</p>
 * <p>
 * See Also: {@link LuckTreeUIBundle}, {@link LuckTreeCellRenderer}
 * </p>
 * 
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class LuckTreeUI extends BasicTreeUI
{
    public static ComponentUI createUI(JComponent x)
    {
        return new LuckTreeUI();
    }

    protected void installDefaults()
    {
        super.installDefaults();

        LookAndFeel.installProperty(tree, "opaque", Boolean.FALSE);
    }
    
    /**
     * <P>使用自定义TreeCellRenderer， 去除焦点边框绘制。</p>
     * <P>Use custom TreeCellRenderer, the removal of the border to draw focus.</P>
     */
    protected TreeCellRenderer createDefaultCellRenderer()
    {
        return new LuckTreeCellRenderer();
    }
}
