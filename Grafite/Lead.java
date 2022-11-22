package Grafite;

import java.text.DecimalFormat;
public class Lead { //todo
    private float thickness; //calibre
    private String hardness; //dureza
    private int size; //tamanho em mm

    public Lead(float thickness, String hardness, int size) { //todo
        this.thickness = thickness;
        this.hardness = hardness;
        this.size = size;
    }

    public float getThickness() { //todo
        return this.thickness;
    }

    public String getHardness() { //todo
        return this.hardness;
    }

    public int getSize() { //todo
        return this.size;
    }

    public void setSize(int size) { //todo
        this.size = size;
    }

    public int usagePerSheet() {
        if(hardness.equals("HB"))
            return 1;
        else if(hardness.equals("2B"))
            return 2;
        else if(hardness.equals("4B"))
            return 4;
        else
            return 6;
    }

    public String toString() {
        DecimalFormat form = new DecimalFormat("0.0");
        return form.format(thickness) + ":" + hardness + ":" + size;
    }
}

