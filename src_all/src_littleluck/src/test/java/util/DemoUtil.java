package util;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;

public class DemoUtil
{
    public static JFrame createFrame(String title, int w, int h)
    {
        JFrame frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(w, h);

        return frame;
    }

    public static void centerWindowOnScreen(Window window)
    {
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final Dimension size = window.getSize();

        if (size.height > screenSize.height)
        {
            size.height = screenSize.height;
        }

        if (size.width > screenSize.width)
        {
            size.width = screenSize.width;
        }

        window.setLocation((screenSize.width - size.width) / 2,
                (screenSize.height - size.height) / 2);
    }
}
