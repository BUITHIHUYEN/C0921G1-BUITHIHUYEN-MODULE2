package bai_6_ke_thua.bai_tap.bai_2_lop_point2d_va_lop_point3d;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D (float x,float y,float z) {
        super(x,y);
        this.z = z;
    }
    public Point3D (){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z) {
        setX(getX());
        setY(getY());
        this.z = z;
    }
    public float[] getXYZ(){
        float[]arr1 = new float[3];
        arr1[0]= this.getX();
        arr1[1] =this.getY();
        arr1[2] =this.z;
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }
}
