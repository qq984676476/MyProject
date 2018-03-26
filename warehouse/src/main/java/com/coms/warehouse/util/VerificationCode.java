package com.coms.warehouse.util;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class VerificationCode {
    private static final char[] chars = {'0','1','2','3','4','5','6','7','8','9'};
    private static final int SIZE = 4;
    private static final int LINES = 5;
    private static final int WIDTH = 80;
    private static final int HEIGHT = 40;
    private static final int FONT_SIZE = 30;
    //生成验证码,封装到Map中,其中map的key是验证码,map的value是验证码图片,
    public static Map<String,BufferedImage> createImage(){
        StringBuffer sb = new StringBuffer();
        BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
        Graphics graphic = image.getGraphics();
        graphic.setColor(Color.LIGHT_GRAY);
        graphic.fillRect(0, 0, WIDTH, HEIGHT);
        Random ran = new Random();
        //画随机字符
        for(int i = 0;i<=SIZE;i++){
            int r = ran.nextInt(chars.length);
            graphic.setColor(getRandomColor());
            graphic.setFont(new Font(null,Font.BOLD+Font.ITALIC,FONT_SIZE));
            graphic.drawString(chars[r]+"",(i-1)*WIDTH/SIZE, HEIGHT/2);
            sb.append(chars[r]);//将字符保存
        }
        //画干扰线
        for(int i = 1;i<=LINES;i++){
            graphic.setColor(getRandomColor());
            graphic.drawLine(ran.nextInt(WIDTH),ran.nextInt(HEIGHT),ran.nextInt(WIDTH) , ran.nextInt(HEIGHT));
        }
        Map<String,BufferedImage> map = new HashMap<String, BufferedImage>();
        map.put(sb.toString(), image);

        return map;
    }
    //将图片转换为输入流
    public static InputStream getInputStream(BufferedImage image) throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        JPEGImageEncoder encode = JPEGCodec.createJPEGEncoder(bos);
        encode.encode(image);
        byte[] imageBts = bos.toByteArray();
        InputStream in = new ByteArrayInputStream(imageBts);
        return in;

    }

    private static Color getRandomColor() {
        Random ran = new Random();
        Color color = new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256));
        return color;
    }
}
