package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) {
       if (ImageTypes.BMP.equals(types)) return new BmpReader();
       if (ImageTypes.JPG.equals(types)) return new JpgReader();
       if (ImageTypes.PNG.equals(types)) return new PngReader();
       throw new IllegalArgumentException();
    }
}
