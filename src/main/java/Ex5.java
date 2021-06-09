public class Ex5 {
    public String giaiPTBac2(float a, float b, float c) {
        String s = "";
        if (a == 0) {
            if (b == 0) {
                s += ("VN");
            } else {
                s += "x = " + (-c / b);
            }
        }
        if (a != 0) {
            float delta = b * b - 4 * a * c;
            float x1;
            float x2;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                s += ("x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                s += ("x1 = x2 = " + x1);
            } else {
                s += ("VN");
            }
        }
        return s;
    }

}
