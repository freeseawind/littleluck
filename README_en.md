## Introduction
littleuck is a cross platform Java Swing LookAndFeel. Its name inspired by a song I like [小幸运](http://bd.kuwo.cn/yinyue/7204931?from=baidu), where the "it" is dedicated to all the friends who are still struggling Swing.

## Features
* Translucent shadow window border
* ClearType for translucent window
* Flattening interphase support
* Suspension scrollbar for scrollpane
* Android ninepatch draw support
* Simple and easy extension
* Much more...

## Minimum requirements
* JDK 7+ for littleluck
* [NinePatch](https://github.com/freeseawind/NinePatch) for littleluck

## Quick Start

Download littluck, Add it to you project.

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
                     UIManager.setLookAndFeel(LittleLuckLookAndFeel.class.getName());
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

## Preview
![JButton](https://raw.githubusercontent.com/freeseawind/littleluck/master/screenshots/1.png)

![JProgressBar](https://raw.githubusercontent.com/freeseawind/littleluck/master/screenshots/6.png)

![Text](https://raw.githubusercontent.com/freeseawind/littleluck/master/screenshots/7.png)

![JToolip](https://raw.githubusercontent.com/freeseawind/littleluck/master/screenshots/8.png)

:point_right: [more](https://github.com/freeseawind/littleluck/wiki/%E6%9B%B4%E5%A4%9A%E6%88%AA%E5%9B%BE)

## [User Manual](https://github.com/freeseawind/littleluck/wiki/User-Manual)

## Maven

```xml
<dependency>
  <groupId>com.github.freeseawind</groupId>
  <artifactId>littleluck</artifactId>
  <version>2.0.0</version>
</dependency>
```

## Contact
* Issues mail to :love_letter: `iphonewang@foxmail.com`
* Join QQ groupchat `148079860` <a target="_blank" href="http://shang.qq.com/wpa/qunwpa?idkey=1db134f79c4bcb759a21302f4243a88ffb20f8f7b6ae5e66c38bd5c02604aa27"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="Java 技术交流群" title="Java 技术交流群"></a>
