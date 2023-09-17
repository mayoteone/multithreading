package task1631;

import task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
//        try {
        if (imageTypes == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        switch (imageTypes) {
            case BMP -> {
                return new BmpReader();
            }
            case PNG -> {
                return new PngReader();
            }
            case JPG -> {
                return new JpgReader();
            }
        }
//            if (imageTypes.equals(ImageTypes.JPG)) {
//                return new JpgReader();
//            } else if (imageTypes.equals(ImageTypes.PNG)) {
//                return new PngReader();
//            } else if (imageTypes.equals(ImageTypes.BMP)) {
//                return new BmpReader();
//            }
//        } catch (NullPointerException e) {
//            System.out.println("Неизвестный тип картинки");
//        }

        return null;
    }

}
