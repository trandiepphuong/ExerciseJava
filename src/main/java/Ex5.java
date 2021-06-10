public class Ex5 {
    public String giaiPTBac2(float a, float b, float c) {
        String result = "";
        if (a == 0) {
            if (b == 0) {
                return "VN";
            } else {
                return "x = " + (-c / b);
            }
        }
        if (a != 0) {
            float delta = b * b - 4 * a * c;
            if (delta > 0) {
                float x1;
                float x2;
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                result += ("x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                float x;
                x = -b / (2 * a);
                result += "x1 = x2 = " + x;
            } else {
                result += "VN";
            }
        }
        return result;
    }
}
