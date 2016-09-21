package freeseawind.lf.cfg;

import javax.swing.UIDefaults;

/**
 * UI资源初始化接口
 * @author freeseawind@github
 * @version 1.0
 */
public interface LuckResConfig
{
    public void loadResources(UIDefaults table);
    
    public void removeResource();
}
