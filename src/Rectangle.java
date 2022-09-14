public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int lengthParam,int widthParam){
        length = lengthParam;
        width = widthParam;
         if (lengthParam < 0){
             length = 0;
         }

         if (widthParam < 0){
             width = 0;
         }
    }

    public String toString(){
        return "Length: " + length + "\nWidth: " + width;

    }

    public boolean setLength(int newLength){
        if (newLength <0){
           length = length + 0;
            System.out.println("Length changed: False");
        } else if (newLength >0){
            length = newLength;
            System.out.println("Length changed: True");
        }
        boolean changed = newLength > 0;
        return changed;

    }

    public boolean setWidth(int newWidth){
        if (newWidth <0){
            width = width + 0;
            System.out.println("Width changed: False");
        } else if (newWidth >0){
            width = newWidth;
            System.out.println("Width Changed: True");
        }
        boolean changed = newWidth > 0;
        return changed;


    }
}
