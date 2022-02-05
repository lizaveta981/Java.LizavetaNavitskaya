package com.liza.idea;

public class HW2_task2_Box {
    private static int x;
    private static int y;
    private static int z;

    public HW2_task2_Box(int x, int y, int z) {
        //это конструктор. тут момент создания. у него нет возвращаемого значения(он вернет объект коробке)
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX() {return this.x;}
    public int getY() {return this.y;}
    public int getZ() {return this.z;}

    public static String getDefineTheTypeOfBox (HW2_task2_Box box) {
        if (box.getX() == box.getY() && box.getY() == box.getZ()) {
            System.out.println("this is cube");
        } else if (box.getZ() == 0) {
            System.out.println("this is an envelope");
        } else {
            System.out.println("this is an ordinary box");
        }
        return null;
    }
}
