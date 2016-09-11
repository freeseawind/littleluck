## 简介
littleuck是Java Swing跨平台外观(LookAndFeel)实现。 它的名字的灵感来源于我喜欢的一首歌
[小幸运](http://bd.kuwo.cn/yinyue/7204931?from=baidu)，在这里把"它"献给所有仍在Swing奋斗的朋友。

## 功能介绍
* 窗体使用半透明阴影边框
* 解决透明窗体字体渲染问题
* 扁平化界面
* 滚动条悬浮的滚动面板
* 使用安卓点九绘图技术
* 简单且容易扩展
* 更多...

## 运行依赖
* JDK 7+ for littleluck
* [NinePatch](https://github.com/freeseawind/NinePatch) for littleluck

## 快速入门

下载littluck，并添加到你的项目中

`Startup.java`<br>

```Java

public class Startup
{
    public static void main(String[] args)
    {
        // if open it close
        // System.setProperty("awt.useSystemAAFontSettings", "on");

        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    LittleLuck.getSingleton().luanchLookAndFeel();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                
                ........
                
                //your code
            }
        }
    }
}

```

## 图片预览
![JButton](https://raw.githubusercontent.com/freeseawind/littleluck/master/screenshots/1.png)

![JProgressBar](https://raw.githubusercontent.com/freeseawind/littleluck/master/screenshots/6.png)

![Text](https://raw.githubusercontent.com/freeseawind/littleluck/master/screenshots/7.png)

![JToolip](https://raw.githubusercontent.com/freeseawind/littleluck/master/screenshots/8.png)

:point_right: [更多截图](https://github.com/freeseawind/littleluck/wiki/%E6%9B%B4%E5%A4%9A%E6%88%AA%E5%9B%BE)

## [帮助手册](https://github.com/freeseawind/littleluck/wiki/%E4%B8%AD%E6%96%87%E5%B8%AE%E5%8A%A9%E6%89%8B%E5%86%8C)

## 联系作者
* 如有Bug和建议邮箱至 :love_letter:  `iphonewang@foxmail.com`
* 欢迎加入Java技术讨论群 `148079860` <a target="_blank" href="http://shang.qq.com/wpa/qunwpa?idkey=1db134f79c4bcb759a21302f4243a88ffb20f8f7b6ae5e66c38bd5c02604aa27"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="Java 技术交流群" title="Java 技术交流群"></a>
